/**
 * Created by jinfeng 
   Created at 16/1/4
 */

import helper.DateHelper._

object Sample {

   def main(args: Array[String]): Unit = {

      val twoDayAgo = 2 days ago
      val twoDayAfter = 2 days from_now
      println("two days ago is " + twoDayAgo)
      println("two days after is " + twoDayAfter)

   }
}
