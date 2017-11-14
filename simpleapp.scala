/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

# This Source Code Form is subject to the terms of the Mozilla Public
# License, v. 2.0. If a copy of the MPL was not distributed with this
# file, You can obtain one at http://mozilla.org/MPL/2.0/.

<!-- This Source Code Form is subject to the terms of the Mozilla Public
   - License, v. 2.0. If a copy of the MPL was not distributed with this
   - file, You can obtain one at http://mozilla.org/MPL/2.0/. -->

This Source Code Form is subject to the terms of the Mozilla Public
License, v. 2.0. If a copy of the MPL was not distributed with this
file, You can obtain one at http://mozilla.org/MPL/2.0/.



/* SimpleApp.scala */
import org.apache.spark.sql.SparkSession

import scala.tools.nsc.util.HashSet


object SimpleApp {
  def main(args: Array[String]) {
    val logFile = "/home/robert/IdeaProjects/find_merg/res/some_logfile.txt" // Should be some tile on your system
    // val logFile = "/home/robert/Downloads/spark-2.2.0-bin-hadoop2.7/README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("Simple Application").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }

  def find (value: Int, disjoint_set: Seq[Int]): Int = {
    disjoint_set.find {
      case x if x == value => return x
    }
  }

  def merge (hashSet: HashSet[Int], disjoint: List[Int], value_one: Int, value_two: Int): Int = {
    // two is assumed to have a larger value

    // PSEUDO

    // wList = a.find(two)
    val res = find(value_two, disjoint)

    val working_list = hashSet[res]
    // for item in wList
      // disjoint[item] = one
    // wList.valueAt(item).append(two)
    // DELETE & a[two]
   }
}
