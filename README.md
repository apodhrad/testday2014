testday2014
===========


1. osgi:install -s wrap:file:<path>/ojdbc6.jar
2. cd oracle-ds
3. mvn clean install
4. cd test
5. mvn clean install
6. feature:install camel-sql
7. osgi:install -s mvn:org.apodhrad.testday/oracle-ds/1.0-SNAPSHOT
8. osgi:install -s mvn:org.apodhrad.testday/test/1.0-SNAPSHOT
9. log:display