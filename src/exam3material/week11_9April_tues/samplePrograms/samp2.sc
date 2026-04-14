// #Sireum #Logika
//@Logika: --manual

import org.sireum._

//get user input number, print whether
//it is positive or negative

//what does "val" mean?
//val is a constant 
val num: Z = Z.prompt("Enter a number: ")

//taking it and seeing if it is +, if it is print, it is; if not print that it is not 
if (num > 0) {
  println(num, " is positive")
} else { //same line 
  println(num, " is negative (or zero)")
}