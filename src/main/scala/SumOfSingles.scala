object SumOfSingles extends App {

  def apply(input: List[Int]) : Int ={
    if (input.length < 2) throw new Exception("invalid input")
    val numberOfRepeats = input.map(x => input.map(y=> x == y).count(_ == true))
    val OnlydistinctNums = input.zip(numberOfRepeats).filter(x => x._2 ==1).map(_._1)
    OnlydistinctNums.sum
  }

  def apply2(input: List[Int]) :Int = {
    if (input.length < 2) throw new Exception("invalid input")
    val inputSum = input.sum
    val distinctSum = input.distinct.sum
    val dupes = inputSum - distinctSum
    distinctSum - dupes

  }

}
