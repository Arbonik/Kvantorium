import java.util.*

class Group(n : String) {
    var name = n
    var schedule = arrayOf(Date(), Date())
    var teather : Teather? = null
    var students : MutableList<Student> = MutableList(0, {Student() })

    fun display(){
        println(name)
        teather?.display()
        for (i in students){
            i.display()
        }
    }
}

