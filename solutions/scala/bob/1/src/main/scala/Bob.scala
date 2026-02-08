object Bob {
  def response(statement: String): String = {
    val s = statement.trim

    val isSilence = s.isEmpty
    val isQuestion = s.endsWith("?")
    val hasLetters = s.exists(_.isLetter)
    val isYelling = hasLetters && s.forall(c => !c.isLetter || c.isUpper)

    if (isSilence)
      "Fine. Be that way!"
    else if (isYelling && isQuestion)
      "Calm down, I know what I'm doing!"
    else if (isYelling)
      "Whoa, chill out!"
    else if (isQuestion)
      "Sure."
    else
      "Whatever."
  }
}
