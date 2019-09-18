package sandbox

object Exercise1Dot3 {
  trait Printable[A] {
    def fmt(value: A): String
  }

  object PrintableInstances {
    implicit val printableString: Printable[String] = new Printable[String] {
      def fmt(value: String): String = value
    }

    implicit val printableInt: Printable[Int] = new Printable[Int] {
      def fmt(value: Int): String = value.toString
    }

    implicit val printableCat: Printable[Cat] = new Printable[Cat] {
      def fmt(value: Cat): String = {
        val name = Printable.fmt(value.name)
        val age = Printable.fmt(value.age)
        val color = Printable.fmt(value.color)

        s"$name is a $age year-old $color cat."
      }
    }
  }

  object PrintableSyntax {

    implicit class PrintableOps[A](value: A) {
      def fmt(implicit printable: Printable[A]): String = {
        printable.fmt(value)
      }

      def print(implicit printable: Printable[A]): Unit = {
        println(printable.fmt(value))
      }
    }
  }

  object Printable {
    def fmt[A](value: A)(implicit printable: Printable[A]): String = {
      printable.fmt(value)
    }

    def print[A](value: A)(implicit printable: Printable[A]): Unit = {
      println(printable.fmt(value))
    }
  }

  final case class Cat(name: String, age: Int, color: String)
}