// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//Given premises:  a ∧ b, c
//Use natural deduction to prove: b ∧ c


@pure def and1(a: B, b: B, c: B): Unit = {
    Deduce(
        (a & b, c) |- (b & c)
        Proof(
            //PROOF GOES HERE
            1 (a & b) by Premise,
            2 (c) by Premise,
            3 (a) AndE1(1),
            4 (b) AndE2(1),
            5(b & c) AndI(4, 2)
        )
    )
}