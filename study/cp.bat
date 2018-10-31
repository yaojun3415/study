git log -n 1 > web/src/main/webapp/version
mvn clean -Dmaven.test.skip=true -Ptest package
