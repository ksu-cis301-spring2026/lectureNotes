// #Sireum #Logika
//@Logika: --manual

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

val x: Z = 2

//What can we put in a proof block here?
//Do we need this step?


Deduce(
    1 ( x == 2 ) by Premise
)


val y: Z = x + 2

<<<<<<< HEAD:src/exam3material/week11_9April_tues/add.sc
Deduce( 
    1 ( x == 2) by Premise, 
    2 ( y == x + 2) by Premise, 
    3 ( y == 4) by Algebra*(1,2),
    4 ( y == 4 & x == 2) by AndI(3,1)
)
=======
Deduce(
    1 ( x == 2 ) by Premise,
    2 ( y == x + 2 ) by Premise,
    3 ( y == 4 ) by Algebra*(1,2),
    4 ( y == 4 & x == 2 ) by AndI(3,1)
)

>>>>>>> 108e264a82ae7fe61e62913249b6cdb3b1b58088:src/exam3material/week11_7April_tues/add.sc

//what can we put in a proof block here?

assert(y == 4 & x == 2)
<<<<<<< HEAD:src/exam3material/week11_9April_tues/add.sc
=======

>>>>>>> 108e264a82ae7fe61e62913249b6cdb3b1b58088:src/exam3material/week11_7April_tues/add.sc



