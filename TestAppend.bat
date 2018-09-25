@echo off
setlocal ENABLEDELAYEDEXPANSION

>>"%1%" (
FOR /F "tokens=* delims=" %%x in (%2%) DO (
set "%%x=%%x:~0,-1%"
echo 	^<^^!-- %%x --^>
echo 	^<test name="%%x" preserve-order="true"^>
echo 		^<parameter name="TestCase" value="%%x"^>^</parameter^>
echo 		^<classes^>
echo 			^<class name="com.nividous.util.GenericTest"^>^</class^>
echo 		^</classes^>
echo 	^</test^>
echo 	^<^^!-- %%x --^>		
echo[
)
echo ^</suite^>
)
endlocal
exit