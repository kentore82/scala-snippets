package no.sherpa.hive.udfs

import org.apache.hadoop.hive.ql.exec.UDF

class strToUpperCase extends UDF {

  def evaluate(inStr: String): String = {
    return inStr.toUpperCase
  }

}
