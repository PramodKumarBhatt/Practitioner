<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>DataDrivenTesting With MS Excel</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>3</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>true</rerunImmediately>
   <testSuiteGuid>fc55ee76-ae2b-4fde-b104-602967a1f045</testSuiteGuid>
   <testCaseLink>
      <guid>7eda285a-b488-4622-9e33-05d7052c6f3e</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <iterationNameVariable>
         <defaultValue>'places in Atlanta'</defaultValue>
         <description></description>
         <id>5a5aa52e-b2d1-4174-9afa-1c896892f3e4</id>
         <masked>false</masked>
         <name>message</name>
      </iterationNameVariable>
      <testCaseId>Test Cases/AirbnbDemo/Find a place</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d23d2fac-117b-4676-9adf-c865bf316a89</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/100 cities_Excel</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d23d2fac-117b-4676-9adf-c865bf316a89</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>city</value>
         <variableId>fbc71c88-1a87-4b2c-a89c-edbee831612a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>SCRIPT_VARIABLE</type>
         <value>null</value>
         <variableId>5a5aa52e-b2d1-4174-9afa-1c896892f3e4</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
