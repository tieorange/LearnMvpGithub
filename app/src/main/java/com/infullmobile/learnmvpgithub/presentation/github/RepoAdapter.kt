package com.infullmobile.learnmvpgithub.presentation.github

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.infullmobile.android.infullmvp.bindView
import com.infullmobile.learnmvpgithub.R
import com.infullmobile.learnmvpgithub.domain.model.Repo
import condeandfurious.lungsshoe.presentation.recycler.AddNewObjectAdapter
import condeandfurious.lungsshoe.presentation.recycler.BaseAddNewObjectViewHolder
import condeandfurious.lungsshoe.presentation.recycler.BaseRecyclerAdapter
import condeandfurious.lungsshoe.presentation.recycler.BaseRecyclerHolder
import java.util.*

class RepoAdapter() : BaseRecyclerAdapter<Repo>() {
    override fun createHolder(view: View, viewType: Int)= RepoViewHolder(view)

    override fun layoutId(viewType: Int) = R.layout.item_repo

    class RepoViewHolder(view: View) : BaseRecyclerHolder<Repo>(view) {
        val name: TextView by bindView(R.id.repoListName)

        override fun displayItem(item: Repo) {
            name.text = item.name
        }
    }

}
