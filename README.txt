- Configuration for test running has requires following steps:
 1) create junit runner
 2) add AcceptanceTestSuite as a class
 3) add vm options: -Dwebdriver.driver=chrome -Dautohero.stories=TestLogin.story -Dconfig.file=environment.properties
 4) perform mvn clean compile  for downloading all sources and drivers