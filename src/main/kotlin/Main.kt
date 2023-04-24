fun main() {

    //Q1
    val dog= Dog("simba",3)
    val cat =Cat("cute",2)

    dog.makeSound()
    cat.makeSound()
    //Q2

    val car =Car("Mercedes","C220",2015)
    car.start()
    car.drive()

    val truck =Truck("Toyota","Hilux",2017)
    truck.start()
    truck.cargo()



}
//Q1.Create a class hierarchy that models different types of animals. Each animal should have a name and age
//  and should be able to make a sound (i.e. bark, meow, etc.). Implement inheritance to avoid code duplication.
 open class Animal(val name:String,val age:Int){
    open fun makeSound(){
        println("The animal makes a sound")
    }
}
class Dog(name:String,age: Int): Animal(name,age){
    override fun makeSound(){
        println("The dog barks")
    }

}
class Cat(name: String,age: Int):Animal(name,age) {
    override fun makeSound() {
        println("The cat meows")
    }
}
 //Q2. Create a class hierarchy related to vehicles, with a base class for all vehicles called Vehicle.
// Implement subclasses for different types of vehicles such as Car, Truck, and Motorcycle, and
// demonstrate how to call a method in the superclass from each subclass.
    open class Vehicle(val make:String, val model:String, val year:Int){
        fun start(){
            println("starting the engine")
        }

    }
class Car(make:String, model:String, year:Int) :Vehicle(make,model,year){
    fun drive(){
        println("Driving the car")
    }
}
class Truck(make:String, model:String, year:Int) :Vehicle(make ,model, year){
    fun cargo(){
        println("cargo in the truck")
    }
}
class Motorcycle(make:String, model:String, year:Int) :Vehicle(make ,model, year) {
    fun ride(){
        println("riding the motorcycle")
    }
}


//what I have learned from inheritance:
//It allows user to create a new class (derived class) from an existing class (base class).
// The derived class inherits all the features from the base class and can have additional features of its own.
// Inheritance enables code reusability and saves time.

