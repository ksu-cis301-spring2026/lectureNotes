// #Sireum #Logika
//@Logika: --manual

import org.sireum._

//get user input number, add one to it, print it out

//what does "var" mean?
var x: Z = Z.prompt("Enter a number: ") //Z type - integers Z is the int type - varx: (declaring a variable )
                                        //declaring variable x with type integer and then using Z.prompt for user input 

x = x + 1

println("One more is ", x)  