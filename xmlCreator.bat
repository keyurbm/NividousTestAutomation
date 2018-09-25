@echo off
(
echo ^<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" ^>
echo ^<suite name="%1" verbose="1"^>
echo 	^<!-- GLOBAL PARAMETERS --^>
echo 	^<parameter name="BusinessChannel" value="%1"^>^</parameter^>
echo 	^<parameter name="Project" value="%1"^>^</parameter^>
echo 	^<parameter name="OR_Path" value="%2"^>^</parameter^>
echo 	^<!-- OSType has only 2 values "Windows" or "Linux" only --^>
echo 	^<parameter name="OSType" value="%3"^>^</parameter^>
echo 	^<parameter name="JsonFileName" value="%4"^>^</parameter^>
echo[
echo 	^<!-- LISTERNERS --^>
echo 	^<listeners^>
echo 		^<listener class-name="com.nividous.listener.CustomHTMLReport" /^>
echo 		^<listener class-name="com.nividous.listener.CustomLogging" /^>
echo 		^<listener class-name="com.nividous.listener.StartSuiteDate" /^>
echo 	^</listeners^>
echo[
echo 	^<!-- REGERESSION TEST CASES --^>
echo[
echo 	^<!-- Loading Excel Sheet File --^>
echo 	^<test name="LoadExcel" preserve-order="true"^>
echo 		^<parameter name="filePath" value="%5"^>^</parameter^>
echo 		^<classes^>
echo 			^<class name="com.nividous.util.CommonUtilityForSuite"^>^</class^>
echo 		^</classes^>
echo 	^</test^>
echo 	^<!-- Loading Excel Sheet File --^>
echo[

)>%6%
exit