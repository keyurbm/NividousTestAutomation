cls  
@echo off
cls 
cls
cls

cd /d %~dp0
SET MYPATH=%~dp0
echo =================================  
echo Enter your Project Name?
echo =================================  
set /p var=
set /p answer=Are you sure you want to create the project with name %var%?(y/n) 
IF %answer%== y (
echo[
echo We are creating folder structure for your project...
)
IF %answer%== n (
echo[
echo try again!
pause
exit)

mkdir "%MYPATH%\testExecution\%var%"
mkdir "%MYPATH%\testExecution\%var%\%var%_XML"
mkdir "%MYPATH%\testExecution\%var%\%var%_DATA"
mkdir "%MYPATH%\supportFiles\%var%"
@echo.> "%MYPATH%\supportFiles\%var%\%var%.properties"
@echo.> "%MYPATH%\testExecution\%var%\%var%_DATA\%var%.xlsx"
copy %MYPATH%\externalData\template.xlsx %MYPATH%\testExecution\%var%\%var%_DATA\%var%.xlsx >NUL
cls

echo ================================================================================ 
echo Done! Folder structure is generated under "%MYPATH%testExecution\%var%" path
echo ================================================================================
echo[
pause
start %MYPATH%\testExecution\%var%\%var%_DATA\%var%.xlsx
