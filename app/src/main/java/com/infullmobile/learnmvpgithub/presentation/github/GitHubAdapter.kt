package com.infullmobile.learnmvpgithub.presentation.github

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.infullmobile.android.infullmvp.bindView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo
import java.util.*

class GitHubAdapter() : RecyclerView.Adapter<GitHubAdapter.ViewHolder>() {
    private val reposList: ArrayList<Repo> = ArrayList()

    override fun getItemCount(): Int {
        return reposList.count()
    }

    fun setData(list: List<Repo>) {
        reposList.clear()
        reposList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_repo, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val repo = reposList[position]
        holder?.bind(repo)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val name: TextView by bindView(R.id.repoListName)
        fun bind(repo: Repo) {
            name.text = repo.name
        }

    }

}