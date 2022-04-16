fun main () {

            var variables=nameList(listOf("Ray", "Malak", "God", "Jean", "Kent", "Karanja", "Nine", "Wednesday", "June", "Brunette"))
    println(variables)
    var calcHeights = peoplesHeights(listOf(1.56,1.88,1.98,1.45,1.75,1.24))
    println(calcHeights)

    var w = Person("Wainaina",26,70,1.89)
    var x = Person("Kinuthia",50,88,2.0)
    var y = Person("Oprah",60,90,1.77)
    var z = Person("Marie",29,60,1.67)
    var coolPeeps = mutableListOf<Person>(w,x,y,z)
    var sortedCoolPeeps = coolPeeps.sortedByDescending { person->person.age }
    println(sortedCoolPeeps)
    var a = Person("Verite",24,70,1.65)
    var b = Person("Effence", 22,56,1.67)
    //var c= Person("Wairimu",19,62,1.76)
    var d= listOf(a,b)
    println(coolPeeps.plus(d))

    var audi = Car("KBE 101Z",17.84)
    var mercedes = Car("KDE 345A",16.1)
    var rangeRover = Car("KDD 102X",10.75)
    var ferari = Car("KDY 289A",8.45)
    var landRover =Car("KDB 109A",10.75)

    var carTypes = listOf<Car>(audi,mercedes,rangeRover,ferari,landRover)







}

fun nameList(names: List<String>): List<String>{
    var index= names.filterIndexed { index,name -> index%2==0 }
    return index

}
fun peoplesHeights(heights: List<Double>):Double{
    var sumHeight = heights.sum()


    var averageHeight = heights.average()
    return averageHeight
    return sumHeight

}
data class Person(var name: String,var age: Int,var weight:Int,var height:Double)

fun addPeeps(namess:List<String>):List<String>{
    return namess
}
data class Car(var registration: String,var mileage: Double)

//fun averageMileage(cars: List<Car>):List<Double>{
//    var sumOfMileage=0
//    cars.forEach{car->
//    }}
