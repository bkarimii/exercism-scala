object Hamming {
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] ={
    if(dnaStrandOne.length != dnaStrandTwo.length) return None
    
    var hammDist:Int = 0
    
    for(i <- 0 until dnaStrandOne.length){
      if(dnaStrandOne(i) != dnaStrandTwo(i)) 
        hammDist+=1
    }

    Some(hammDist)
  }
}
