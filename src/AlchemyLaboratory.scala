abstract class AlchemyLaboratory {
  def brewSpeedPotion(coins: Int): Unit =  {
    if (coins < 4)
      println("That's not enough gold. You're not allowed into the laboratory.")
    else if (coins > 3)
      println("You brew a speed potion.")
    else
      println("Error brewing speed potion")
  }
}
