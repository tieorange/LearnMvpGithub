package condeandfurious.lungsshoe.presentation.recycler

import android.view.View

/**
 * Created by hiv on 1/26/17.
 */
abstract class BaseAddNewObjectViewHolder<NormalItemType : Any>(view: View)
    : BaseRecyclerHolder<NormalItemType>(view) {

    var onAddNewClickListener: OnAddNewItemClickListener = object : OnAddNewItemClickListener {
        override fun onAddNewItem(position: Int) {
            /*EMPTY*/
        }
    }

    init {
        itemView.setOnClickListener { onAddNewClickListener.onAddNewItem(adapterPosition) }
    }

    override fun displayItem(item: NormalItemType) {
        /*EMPTY*/
    }

    abstract fun holderBound()
}
