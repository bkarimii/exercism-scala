object Etl {
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] = {
    scoreMap.flatMap{case (score , letters) =>
      letters.map(let => let.toLowerCase -> score)
    }.toMap
  }
}
