trait Herbalist extends Healer {
  def healWounds(): Unit = {
    println("Your wounds have been healed!")
  }

  def curePoison(poison: String): Unit = {
    println("You have been cured from " + poison + ". Seems odd how he used the same incense like last time.")
  }
}
