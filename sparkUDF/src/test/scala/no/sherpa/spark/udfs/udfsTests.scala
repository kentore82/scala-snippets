package no.sherpa.spark.udfs

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class udfsTests extends FunSuite {

  /*
  trait TestSets {
    val testStrToUpper = new strToUpperCase
  }
  */

  val testStrToUpper = new strToUpperCase


  test("Test non-empty string") {
      assert(testStrToUpper.evaluate("hei på deg") === "HEI PÅ DEG")

  }

  test("Test empty string") {
      assert(testStrToUpper.evaluate("") === "")
  }

  test("Test database null string") {
      assert(testStrToUpper.evaluate(null) == null)
  }

}
