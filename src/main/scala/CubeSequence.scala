import CubeSequence.cubeSequence

import scala.io.StdIn.readLine

object CubeSequence extends App {

  //TODO ask user for starting number
  //TODO ask user for ending numbers
  //Calculate cubes of these integers including start and end AND store results in a sequence
  //Print the saved sequence on screen

  //extra challenge save odd cubes and print them

  val startNumber = readLine("What is starting number? ").toInt
  val endNumber = readLine("What is end number?").toInt

  val numbers = (startNumber to endNumber)
  println(numbers)

  var cubeSequence = for (number <- startNumber to endNumber) yield Math.pow(number, 3).toInt
   println(s"Cube numbers are: $cubeSequence")

    val oddCubes = for (cube <- cubeSequence if cube % 2 == 1 ) yield cube
    println(s"The odd cubes are: $oddCubes")

}
