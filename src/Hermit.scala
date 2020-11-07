trait Hermit extends FortuneTeller {
  def getFortune(coins: Int): Unit = {
    if (coins < 10)
      println("You will encounter an Australian Drop Bear on your next adventure.")
    else if (coins > 9)
      println("Next time you buy gruel, it will be mostly safe to eat.")
    else
      println("Error getting fortune.")
  }
}
