import scala.collection.mutable._

class School {
  type DB = Map[Int, Seq[String]]

  var myDb:DB=Map.empty
  

   def add(name: String, g: Int): Unit = {
    
    if (myDb.values.flatten.exists(_ == name)) return


    val updatedGrade =
      myDb.getOrElse(g, Seq.empty) :+ name

    myDb = myDb.updated(g, updatedGrade)
  }
  
  def db: DB = myDb

  def grade(g: Int): Seq[String] = myDb.getOrElse(g,Seq.empty)

  def sorted: DB =
    myDb.map { case (g, students) =>
      g -> students.sorted
    }
}

