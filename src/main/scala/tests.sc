val input = List(8,3,3,1,5,5,3)


val numberOfRepeats = input.map(x => input.map(y=> x == y).count(_ == true))

val numberOfRepeats2 = input.map(x => input.map(_ ==x).count(_==true))


val distinctNums = input.zip(numberOfRepeats).filter(x => x._2 ==1).map(_._1)

distinctNums.sum