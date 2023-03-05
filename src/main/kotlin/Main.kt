fun main(){
    var Nicole = Human("Nicole",21,50.0)
    println(Nicole.age)
    Nicole.eat(2.0)
    println(Nicole.weight)
    Nicole.speak("I am going to school")
    Nicole.birthday(1)
    println(Nicole.age)

    var Joe = User("Joe","Roy", "joeroy@gmail.com", "0745823140", "3040jr21")
    println(Joe.phoneNumber)
    println(Joe.password)

}
class Human(var name:String, var age:Int, var weight:Double){
fun eat(foodWeight:Double) {
    println("I am eating $foodWeight kgs of food")
    weight += foodWeight

}
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(bday:Int){
        age += bday
    }
}
class User(var firstName:String, var lastName:String, var email:String,var phoneNumber:String,var password:String){

}