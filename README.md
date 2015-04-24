testday2014
===========

1. mvn clean install
1. feature:install camel-sql
1. osgi:install -s wrap:file:<path>/ojdbc6.jar
1. osgi:install -s mvn:com.example/oracle-ds/1.0.0-SNAPSHOT
1. osgi:install -s mvn:com.example/usecase1/1.0.0-SNAPSHOT
1. log:display
