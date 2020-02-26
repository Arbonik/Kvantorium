package com.arbonik.kvantorium

import Group
import Kvant
import Kvantorium
import Student
import Teather
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var kvantorium : Kvantorium = Kvantorium()
    var kvant : Kvant = kvantorium.make_Kvant("bio")
    var group : Group = kvant.make_Group("SUPERGROUP",
        Teather("1", "2", "3"))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listGroup.adapter = ArrayAdapter<Student>(this,
            android.R.layout.simple_list_item_1, group.students)

    }

}
