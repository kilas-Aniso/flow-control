import org.w3c.dom.ranges.Range
fun main(args: Array<String>) {
odd()
   println(names(arrayOf("nisa", "bagiii", "maryan", "abdifatah")))

    drinks(22)
    drinks(1)
    drinks(13)
    drinks(76)
    num()
   println(names(arrayOf("Nisa","maryaan","bagiii" )))
}

//} Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun odd() {
    for (x in 1..100)
        if (x % 2 == 1)
            println(x)
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts
fun names(z:Array<String>):Int{
    var q = 0
    for (y in z){
    if (y.length>5) {
        q++
    }
}
    return q++
}
/*3. You are creating a robot to serve drinks at a party. The robot is required to
serve a glass of milk for guests under the age of 6. For guests under the age of
15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
else gets a bottle of Coca-Cola. Create a function that will make these
decisions, printing out the name of the drink each person gets according to
their age. (2pts)*/
 fun drinks(age:Int) {
    when (age) {
        in 0..6 -> println("serve a glass of milk")

        in 7..15 -> println("serve a botlle of fanta orange")
        else -> println("serve a bottle of coco-cola")



    }
}
/*
4. Write a function that prints each number from 1 to 100 on a new line. For each
multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
"Buzz" instead of the number. For numbers which are multiples of both 3 and
5, print "FizzBuzz" instead of the number. (4pts)
 */
fun num(){
    for (m in 1..100) {
        if  (m % 15 == 0) {
            println("Fizzbuzz")
        } else if (m % 5 == 0) {
            println("Buzz")
        } else if (m % 3 == 0) {
            println("Fizz")
        }
        else{
            println(m)
        }
    }
}