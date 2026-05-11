// #Sireum #Logika
//@Logika: --manual

import org.sireum._

//get user input number, print whether
//it is positive or negative

//what does "val" mean?
<<<<<<< HEAD:src/exam3material/week11_9April_tues/samplePrograms/samp2.sc
//val is a constant 
=======
//val is a constant
>>>>>>> 108e264a82ae7fe61e62913249b6cdb3b1b58088:src/exam3material/week11_7April_tues/samplePrograms/samp2.sc
val num: Z = Z.prompt("Enter a number: ")

//taking it and seeing if it is +, if it is print, it is; if not print that it is not 
if (num > 0) {
  println(num, " is positive")
} else { //same line 
  println(num, " is negative (or zero)")
}