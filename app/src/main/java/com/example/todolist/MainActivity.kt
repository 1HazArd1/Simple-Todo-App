package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val todos= mutableListOf<Todos>()
        val adapter=TodoAdapter(todos)
        rv_TodoList.adapter=adapter
        rv_TodoList.layoutManager=LinearLayoutManager(this)

        btn_Add.setOnClickListener{
            val items=et_TodoItem.text.toString()
            val todoItem=Todos(items,false)
            todos.add(todoItem)
            adapter.notifyItemInserted(todos.size-1)
            et_TodoItem.text=null
        }
    }
}