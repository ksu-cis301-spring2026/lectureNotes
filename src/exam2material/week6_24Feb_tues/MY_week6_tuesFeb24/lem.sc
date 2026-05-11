// #Sireum #Logika

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

@pure def lem(p: B): Unit = {
  Deduce(
    |- ( p | !p )
      Proof(
        1 SubProof(
          //all theorems start with a subproof 
          //only one that can be used here is PbC
          2 Assume (!( p | !p )),

          3 SubProof( //Neg
            4 Assume (p),
            5 (p | !p) by OrI1(4),
            6 (F) by NegE(5,2)

          ),
          7 (!p) by NegI(3),
          8 ( p | !p) by OrI2(7),
          9 (F) by NegE(8, 2)
        ), 
        10 (p | !p) by PbC(1)


          //NEED  p | !p TO CONTRADICT with assume 
          //Try to get !p to build | 
          //goal F
        )
        
  )
}