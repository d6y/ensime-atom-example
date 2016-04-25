object Example extends App {

  val x = Some(42)

  val y = for { n <- x } yield n * 2
  
}
