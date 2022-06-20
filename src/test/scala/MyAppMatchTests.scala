
import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object MainCheck extends Properties("List") {
//Rule based
  property("sum") = forAll {(a: Int, b:Int) =>
    println(s"a: $a b: $b")
    val result = MyApp.sum(a, b)

    // How can we neutralise this a sum operation? minus them....
    result - a == b
  }
}