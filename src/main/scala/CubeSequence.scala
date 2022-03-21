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
val cubeSequence = scala.collection.mutable.ArrayBuffer[Int]()
  for (number <- numbers) {
    val cubeNumbers = number * number * number
    println(cubeNumbers)

  }
}
