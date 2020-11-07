object Main {
  def main(args: Array[String]): Unit = {
    val academy = new ArcaneBaristaAcademy

    println("You go to the academy to study")
    academy.learnFireBall()

    println("You go to the herbalist to heal burns and fix your upset stomach")
    academy.healWounds()
    academy.curePoison("anise")

    println("You go to the hermit for your fortune")
    academy.getFortune(2)

    println("You go feed your owl")
    academy.feedOwl(20)
  }
}
