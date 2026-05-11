// #Sireum #Logika
//@Logika: --manual

import org.sireum._

//use a loop to print the numbers from 10 down to 1
//this loop is counting down from 10 to 1  
//variable - cur is and integer that is 10, while it is over 1 print it and subtract 1 
var cur: Z = 10
while (cur >= 1) {
  println("Next number: ", cur)
  cur = cur - 1
}