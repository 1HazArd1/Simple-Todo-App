package com.example.todolist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoAdapter(
    private var todos:MutableList<Todos>              // the job here is to take the list and set the data of the list to the corresponding data of recycler view
):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>(){

    inner class TodoViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)                   //(view that describe current item)view that describes the item_todo
                                                                                //TodoViewHolder will inherit recyclerview.viewHolder

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false)
        return TodoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todos.size
    }
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
          holder.itemView.apply {
              tv_title.text=todos[position].title
              cb_status.isChecked=todos[position].isCheck
          }
    }


}