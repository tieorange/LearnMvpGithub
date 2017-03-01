package condeandfurious.lungsshoe.presentation.recycler

import android.support.annotation.LayoutRes
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import java.util.*

/**
 * Created by hiv on 1/25/17.
 */
abstract class BaseRecyclerAdapter<ItemType : Any> : RecyclerView.Adapter<BaseRecyclerHolder<ItemType>>() {

    val data: ArrayList<ItemType> = arrayListOf()
    val lastItemPosition: Int = data.lastIndex

    val isNotEmpty: Boolean
        get() = data.isNotEmpty()


    var onItemClickListener: OnItemClickListener<ItemType> = object : OnItemClickListener<ItemType> {
        override fun onItemClick(item: ItemType) {
        }
    }

    override fun onBindViewHolder(holder: BaseRecyclerHolder<ItemType>, position: Int) {
        holder.displayItem(data[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerHolder<ItemType> {
        val view = LayoutInflater.from(parent.context).inflate(layoutId(viewType), parent, false)
        val holder = createHolder(view, viewType)
        holder.onItemClickListener = this.onItemClickListener
        return holder
    }

    abstract fun createHolder(view: View, viewType: Int): BaseRecyclerHolder<ItemType>

    @LayoutRes abstract fun layoutId(viewType: Int): Int

    override fun getItemCount(): Int = data.size

    fun setData(newData: Array<ItemType>) {
        val result = DiffUtil.calculateDiff(AdapterDiffCallback<ItemType>(newData.asList(), data))
        data.clear()
        data.addAll(newData)
        result.dispatchUpdatesTo(this)
    }

    internal class AdapterDiffCallback<T>(private val newItems: List<T>, private val oldItems: List<T>)
        : DiffUtil.Callback() {

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldItems[oldItemPosition] == newItems[newItemPosition]
        }

        override fun getOldListSize(): Int = oldItems.size

        override fun getNewListSize(): Int = newItems.size

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
            return oldItems[oldItemPosition] == newItems[newItemPosition]
        }
    }
}