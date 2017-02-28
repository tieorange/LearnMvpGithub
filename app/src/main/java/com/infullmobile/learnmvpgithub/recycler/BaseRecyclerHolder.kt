package condeandfurious.lungsshoe.presentation.recycler

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by hiv on 1/25/17.
 */
open class BaseRecyclerHolder<ItemType : Any>(view: View) : RecyclerView.ViewHolder(view) {

    var onItemClickListener: OnItemClickListener<ItemType> = object : OnItemClickListener<ItemType> {
        override fun onItemClick(item: ItemType) {
            /*EMPTY*/
        }
    }

    fun setOnItemClickListener(onItemClick: (ItemType) -> Unit) {
        onItemClickListener = object : OnItemClickListener<ItemType> {
            override fun onItemClick(item: ItemType) {
                onItemClick(item)
            }
        }
    }

    open fun displayItem(item: ItemType) {
        this.itemView.setOnClickListener { onItemClickListener.onItemClick(item) }
    }
}