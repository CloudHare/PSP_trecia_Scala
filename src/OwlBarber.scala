trait OwlBarber extends OwlCare {
  def feedOwl(coins: Int): Unit = {
    if (coins < 3)
      println("Your owl was fed gruel. Feel ashamed yet?")
    else if (coins > 2)
      println("Your owl was fed some nice juicy worms. Better than the gruel you eat.")
    else
      println("Error feeding owl")
  }

  def stylizeOwl(coins: Int): Unit = {
    if (coins < 3)
      println("Is that nail polish?")
    else if (coins > 2)
      println("You owl has a beard now")
    else
      println("Error stylizing owl")
  }
}
