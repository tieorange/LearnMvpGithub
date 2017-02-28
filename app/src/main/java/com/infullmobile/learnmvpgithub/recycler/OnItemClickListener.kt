package condeandfurious.lungsshoe.presentation.recycler

/**
 * Created by hiv on 1/26/17.
 */
interface OnItemClickListener<in ItemType : Any> {
    fun onItemClick(item: ItemType)
}