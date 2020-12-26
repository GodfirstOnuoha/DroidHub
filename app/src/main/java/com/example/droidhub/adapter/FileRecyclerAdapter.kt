package com.example.droidhub.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.droidhub.R
import com.example.droidhub.model.File

class FileRecyclerAdapter(private val fileList: List<File>) : RecyclerView.Adapter<FileRecyclerAdapter.FileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileViewHolder {
        return FileViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.files_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: FileViewHolder, position: Int) {
        val file = fileList[position]
        holder.textFile.text = file.fileName
    }

    override fun getItemCount(): Int = fileList.size

    class FileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textFile: TextView = itemView.findViewById(R.id.text_file)

    }
}