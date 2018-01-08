package no.sherpa.spark.udfs

//import org.apache.hadoop.hive.ql.exec.UDF

class strToUpperCase extends UDF {

  def evaluate(inStr: String): String = {
    inStr.toUpperCase
  }

  def evaluate(inNull: Null): Null = {
    null
  }

}
