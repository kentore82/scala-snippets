name := "hiveUDF"

version := "0.1"

scalaVersion := "2.11.7"

resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
resolvers += "Conjars Repo" at "http://conjars.org/repo"

libraryDependencies += "eigenbase" % "eigenbase-properties" % "1.1.4"

libraryDependencies += "org.pentaho" % "pentaho-aggdesigner-algorithm" % "5.1.5-jhyde"

libraryDependencies += "org.apache.hive" % "hive-exec" % "1.1.0-cdh5.13.0"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
