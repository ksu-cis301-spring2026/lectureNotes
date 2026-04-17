// #Sireum #Logika
//@Logika: --manual

import org.sireum._

//write a separate function to add all elements in a sequence
//create a sequence, call the function, print the result
//def to define a function (seq: ZS) is a parameter
//Z is an integer and S is a sequence, similar to an array 
// : Z = is giving the return type then welcoming in the function 
// this is adding up each thing within this sequence.
def sumSequence(seq: ZS) : Z = {
  var sum: Z = 0

  var i: Z = 0

  while (i < seq.size) {
    sum = sum + seq(i)
    i = i + 1
  }

  return sum
}

//////////////////
//setting the definitions that will be used within our function
//calling the funtion getting the total
//print it out. 
val list: ZS = ZS(1,2,3,4)
val total: Z = sumSequence(list)
println("Sum of elements:", total)