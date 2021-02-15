//class header with empty constructor
class Animal () {

//    //secondary constructor
//    constructor(name:String){
//        println("The animal name is: $name")
//    }

    //animal properties
    var type:String = "Herbivore"
    var fur:Boolean = false
    var legs:Int = 4
    var teeth:Int = 32

    //sleep function
    fun sleep(){
        println("$type sleeping!")
    }

    //function eat
    fun eat(meal:String){
        println("$type is eating $meal")
    }

}