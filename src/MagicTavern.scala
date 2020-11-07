abstract class MagicTavern {
  def rentRoom(coins: Int): Unit = {
    if (coins < 5)
      println("You got an old room that stinks like goblin's socks.")
    else if (coins > 4)
      println("You got a decent room with jsut a few ferac rats.")
    else
      println("Error renting room.")
  }

  def buyGruel: Unit = {
    println("You buy some gruel. It didn't even cost anything. Maybe you're the one who should have gotten paid to take it?")
  }
}
