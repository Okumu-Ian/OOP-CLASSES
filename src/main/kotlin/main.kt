fun main(args: Array<String>) {

    //create car object
    val myCar:Car = Car(250,5000,
        4,"Maseratti")
    println("My car has ${myCar.wheelsCount} wheels")

    //create animal object
    val cat:Animal = Animal()
    //add properties for cat
    cat.type = "Carnivore"
    cat.fur = true
    cat.teeth = 30
    //print the cat object
    println("CAT: ${cat.fur}")
    //cat actions
    cat.sleep()
    cat.eat("Lizards")

    //Using secondary constructor
    //val human = Animal("Human")


}