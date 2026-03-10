// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.pred._
import org.sireum.justification.natded.prop._

// ∀ x (Human(x) __>: Mortal(x)), Human(Socrates) |- ∃ x Mortal(x)

@pure def exists1[T](Human: T=>B @pure, Mortal: T=>B @pure, Socrates: T): Unit = {
  Deduce(
     (
      ∀((n: T) => (child(n) | adult(n))),
      !child(Jane)
    )
    |-
    ( adult(Jane) )
    Proof(
      1 ( ∀((n: T) => (child(n) | adult(n))) ) by Premise,
      2 ( !child(Jane) )                        by Premise,
      3 ( child(Jane) | adult(Jane) )           by AllE[T](1, Jane),
      4 ( adult(Jane) )                         by OrE(3, 2)
    )
  )
}