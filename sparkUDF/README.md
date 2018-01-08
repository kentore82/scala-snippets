# Howto create a Scala UDF for Hive (CDH 5.X)

## Build slim or fat jar:
`sbt package` or `sbt assembly`

## From Beeline
```
beeline -u jdbc:hive2://<host>:10000/default -n username

beeline> ADD JAR /tmp/hiveudf_2.11-0.1.jar;
beeline> CREATE [TEMPORARY] FUNCTION strToUpper as 'no.sherpa.hive.udfs.strToUpperCase';
beeline> SELECT titanic.name AS name,strToUpper(titanic.name) AS nameupper FROM titanic LIMIT 5;
+-------------+-------------+--+
|    name     |  nameupper  |
+-------------+-------------+--+
| "Braund     | "BRAUND     |
| "Cumings    | "CUMINGS    |
| "Heikkinen  | "HEIKKINEN  |
| "Futrelle   | "FUTRELLE   |
| "Allen      | "ALLEN      |
+-------------+-------------+--+
5 rows selected (1.579 seconds)
 
```
