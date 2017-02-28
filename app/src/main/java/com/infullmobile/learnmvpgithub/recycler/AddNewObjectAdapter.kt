package condeandfurious.lungsshoe.presentation.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by hiv on 1/25/17.
 */
abstract class AddNewObjectAdapter<T : Any> : BaseRecyclerAdapter<T>() {

    val addNewObjectPosition: Int
        get() = itemCount - 1

    val realItemCount: Int
        get() = itemCount - 1

    var onAddNewItemClickListener: OnAddNewItemClickListener = object : OnAddNewItemClickListener {
        override fun onAddNewItem(position: Int) {
            /*EMPTY*/
        }
    }

    fun setOnAddNewItemClickListener(onAddNewItemClick: (Int) -> Unit) {
        onAddNewItemClickListener = object : OnAddNewItemClickListener {
            override fun onAddNewItem(position: Int) {
                onAddNewItemClick(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return super.getItemCount() + 1
    }

    abstract val addNewObjectLayoutId: Int
    abstract fun createAddNewObjectHolder(view: View, viewType: Int): BaseAddNewObjectViewHolder<T>

    abstract val normalLayoutId: Int
    abstract fun createNormalHolder(view: View, viewType: Int): BaseRecyclerHolder<T>

    override fun layoutId(viewType: Int): Int {
        return if (viewType == ADD_NEW_ITEM_VIEW_TYPE) addNewObjectLayoutId else normalLayoutId
    }

    override fun getItemViewType(position: Int): Int {
        return when (position) {
            addNewObjectPosition -> ADD_NEW_ITEM_VIEW_TYPE
            else -> NORMAL_ITEM_TYPE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseRecyclerHolder<T> {
        val view = LayoutInflater.from(parent.context).inflate(layoutId(viewType), parent, false)
        return createHolder(view, viewType)
    }

    override fun createHolder(view: View, viewType: Int): BaseRecyclerHolder<T> {
        return if (viewType == ADD_NEW_ITEM_VIEW_TYPE) {
            val holder = createAddNewObjectHolder(view, viewType)
            holder.onAddNewClickListener = this.onAddNewItemClickListener
            holder
        } else {
            val holder = createNormalHolder(view, viewType)
            holder.onItemClickListener = this.onItemClickListener
            holder
        }
    }

    override fun onBindViewHolder(holder: BaseRecyclerHolder<T>, position: Int) {
        if (position == addNewObjectPosition) {
            (holder as BaseAddNewObjectViewHolder<T>).holderBound()
        } else if (isNotEmpty) {
            super.onBindViewHolder(holder, position)
        }
    }

    companion object {
        const val ADD_NEW_ITEM_VIEW_TYPE = 1
        const val NORMAL_ITEM_TYPE = 0
    }
}