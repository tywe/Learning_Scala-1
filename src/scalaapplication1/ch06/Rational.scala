package scalaapplication1.ch06

/**
 * A Rational number (numerator, denomintor).  Constructor is automatically generated by compiler
 */
class Rational(n: Int, d: Int) {
  // anything that isn't part of a field or method definition gets placed in the primary constructor, like this:
  println("Created " + n + "/" + d)
}