class Kvant {
    fun make_Group(name:String, teather : Teather) : Group{
        var temp = Group(name)
        for (i in 1..space!!)
        temp.students.add(Student())
        //temp.schedule
        temp.teather = teather

        groups.add(temp)
        return temp
    }

    var space :Int? = null
    var name :String? = null
    var desc : String? = null
    var groups : MutableList<Group> = mutableListOf()
    var teathers : Array<Teather>? = null

    fun display(){
        println(name)
        println(desc)
        teathers?.forEach { it.display() }
        groups?.forEach { it.display() }
    }
}
