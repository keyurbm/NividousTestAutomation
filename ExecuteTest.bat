cls
@echo off
cls 
cls
cls

setlocal enableDelayedExpansion
set /a counter=0

cd /d %~dp0\testExecution
echo Following projects are available for execution...
echo *********************************************************
for /f %%l in ('dir /a:d /b') do (
set /a counter=counter+1
echo !counter!. %%l
)
echo *********************************************************
echo[
echo Please enter the project number to execute.
:START_AGAIN
set /p var1=
set /a counter2=0
for /f %%l in ('dir /a:d /b') do (
set /a counter2=counter2+1
IF %var1%==!counter2! (
set var=%%~nl
goto End_OF_FOOR
)
)
IF %var%==[%1]==[] (
echo[
echo The entered project number is invalid.
echo[
echo Please try again and enter correct project number
goto START_AGAIN
)
:End_OF_FOOR
echo[
echo You have selected %var% project for execution...

cd /d %~dp0
set ProjectPath=%~dp0
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
set excelFilePath=\\testExecution\\%var%\\%var%_DATA\\%var%.xlsx
set objectRepositoryPath=\\supportFiles\\%var%

IF EXIST %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml (
del %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml /f /q
)

@echo.> "%ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml"

IF EXIST %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml (
start /b %ProjectPath%\xmlCreator.bat %var% %objectRepositoryPath% Windows client_secret.json %excelFilePath% %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml
)

cd /d %~dp0\lib
java -jar testNameReader.jar %ProjectPath%%excelFilePath%
pause

for /f "skip=1 delims=*" %%a in (testCasesNames.txt) do (
echo %%a>>newfile.txt
)
echo f | xcopy /s/y newfile.txt %ProjectPath%externalData\testCasesNames.txt
del newfile.txt /f /q
del testCasesNames.txt /f /q
cd..

cls
IF NOT EXIST %ProjectPath%externalData\testCasesNames.txt (
echo ==============================================================================
echo Please, add test cases in selected project's excel sheet in order to execute.
echo Empty sheet will not execute...
echo ==============================================================================
pause
exit)

IF EXIST %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml (
start /b %ProjectPath%\TestAppend.bat %ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml %ProjectPath%externalData\testCasesNames.txt)

echo Your execution is starting now for project %var%...
java org.testng.TestNG "%ProjectPath%\testExecution\%var%\%var%_XML\%var%.xml" >log.txt

cd /d %~dp0
for /f "delims=*" %%a in (folderPath.txt) do (
set path=%%a
)
Copy log.txt %path%\log.txt
del folderPath.txt /f /q
del log.txt /f /q

cls
echo ==============================================================================
echo Your execution is completed, please check execution report...
echo ==============================================================================
del %ProjectPath%externalData\testCasesNames.txt /f /q
pause