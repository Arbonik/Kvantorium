import java.util.*
import kotlin.random.Random

var names = arrayOf("Павел", "Дарья","Алексей","Дмитрий","Александра")
var fam = arrayOf("Бондарчук", "Петров","Путин","Зеленский","Медведева")
var othc = arrayOf("Акаккиевич", "Владимирович","Аннович","Александрович","Медведевич")

open class Man{
    var firstName : String? = null
    var secondName : String? = null
    var fatherName : String? = null

    var birthDate : Date = Date()

    fun display(){
        println(firstName + " " + secondName + " " + fatherName)
        println(birthDate)
    }
}

class Student : Man(){
    init {
        firstName = names[Random.nextInt(names.size)]
        secondName = fam[Random.nextInt(fam.size)]
        fatherName = othc[Random.nextInt(othc.size)]
    }

    override fun toString(): String {
        return "$firstName $secondName"
    }
}

class Teather(name : String, secName : String, name2 : String) : Man(){
    init {
        firstName = name
        secondName = secName
        fatherName = name2
    }
}