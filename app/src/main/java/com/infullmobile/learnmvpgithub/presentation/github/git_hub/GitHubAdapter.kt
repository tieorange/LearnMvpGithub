package com.infullmobile.learnmvpgithub.presentation.github.git_hub

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.infullmobile.android.infullmvp.bindView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo

class GitHubAdapter(val context: Context, val reposList: List<Repo>) : RecyclerView.Adapter<GitHubAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return reposList.count()
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_github, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val repo = reposList[position]
        holder?.bind(repo)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
//        var name: TextView by bindView(R.id.name)
        fun bind(repo: Repo) {

        }

    }

}