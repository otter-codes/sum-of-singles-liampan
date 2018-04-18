object SumOfSingles extends App {

  def apply(input: List[Int]) : Int ={
    if (input.length < 2) throw new Exception("invalid input")
    val numberOfRepeats = input.map(x => input.map(y=> x == y).count(_ == true))
    val distinctNums = input.zip(numberOfRepeats).filter(x => x._2 ==1).map(_._1)
    distinctNums.sum
  }

}
