object SumOfSingles extends App {

  def apply(input: List[Int]) :Int ={
    if (input.length < 2) throw new Exception("invalid input")
    2*input.distinct.sum-input.sum
  }
}
