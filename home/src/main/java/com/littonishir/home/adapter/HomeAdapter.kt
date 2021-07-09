package com.littonishir.home.adapter

import android.view.View
import com.chad.library.adapter.base.listener.OnLoadMoreListener
import com.chad.library.adapter.base.module.LoadMoreModule
import com.littonishir.common.base.BaseBindingAdapter
import com.littonishir.common.base.VBViewHolder
import com.littonishir.common.model.DaiLiRes
import com.littonishir.home.databinding.ItemHouseHomeBinding
import javax.inject.Inject

/**
 * Created by kohana on 2021/7/9.
 */
class HomeAdapter @Inject constructor(): BaseBindingAdapter<ItemHouseHomeBinding, DaiLiRes.Data.Row>(), LoadMoreModule {
    override fun convert(holder: VBViewHolder<ItemHouseHomeBinding>, item: DaiLiRes.Data.Row) {
        try {
            holder.vb.let {
                item.apply {
                    it.tvHouseTitle.text = item.rentalWay + "·" + item.communityName
                    it.tvHouseType.text = "$area|$currentFloor|$floor|$orientation"
                    it.tvHousePrice.text = markPrice
                    it.tvHouseAdd.text = roomNum
                    if (vrFlag != 0) {
                        it.vr.visibility = View.VISIBLE
                    } else {
                        it.vr.visibility = View.GONE
                    }

                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


}