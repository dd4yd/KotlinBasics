fun main(args: Array<String>) {
	
    val sample1 = 0x3A
    var sample2 = 58
    var heartRate: Int = 85
    var deposits = 135002796
    val acceleration: Double = 9.800
    var mass = 14.6
    var distance: Double = 129.763001
    var lost: Boolean = true
    var expensive: Boolean = true
    var choice: Int = 2
    val integral: Char = '∫'
    val greeting: String = "Hello"
    var name: String = "Karen"
    
    if (sample1 == sample2) {
        println("the samples are equal")
    } else {
        println("the samples are not equal")
    }

	if (heartRate >= 40 && heartRate <= 80) {
        println("heart rate is normal")
    } else {
        println("hear rate is not normal")
    }
    
    if (deposits > 100000000) {
        println("you are exceedingly wealthy")
    } else {
        println("sorry you are soo poor")
    }
    
    var force = mass * acceleration
    println("force = $force")
    
    println("$distance is the distance")
    
    if (lost == true && expensive == true) {
        println("I am really sorry! I will get the manager")
    } else if (lost == true && expensive == false) {
        println("Here is a coupon for 10% off")
    }
    
    when {
        choice == 1 -> println("you chose 1")
        choice == 2 -> println("you chose 2")
        choice == 3 -> println("you chose 3")
        else -> println("you made an unknown choice")
    }
    
    println("$integral is an integral")
    
    for (i in 5..10) println("i = $i")
    
    var age = 0
    while (age < 6) {
        println("age = $age")
        age++
    }
    
    println("$greeting $name")
    
}
