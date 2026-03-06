// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

//Prove AND is commutative


@pure def andCommute(p: B, q: B): Unit = {
  Deduce(
    (p & q) |- (q & p)
      Proof(
        //PROOF GOES HERE
        1 ( p & q ) by Premise,
        2 ( p ) AndE1(1),
        3 ( q ) AndE2(1),
        4 ( q & p ) by AndI(3, 2)
      
        
    )
  )
}