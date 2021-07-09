package com.littonishir.home

import android.graphics.Color
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.alibaba.android.arouter.facade.annotation.Route
import com.littonishir.common.base.BaseActivity
import com.littonishir.common.model.DaiLiReq
import com.littonishir.common.model.PageInfo
import com.littonishir.common.model.Truck
import com.littonishir.common.network.convertRequestBody
import com.littonishir.home.adapter.HomeAdapter
import com.littonishir.home.databinding.ActivityHomeBinding
import com.littonishir.home.vm.HomeVM
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@Route(path = "/home/HomeActivity")
@AndroidEntryPoint
class HomeActivity : BaseActivity<HomeVM, ActivityHomeBinding>(), SwipeRefreshLayout.OnRefreshListener {
   @Inject
    lateinit var truck: Truck
    @Inject
    lateinit var  mAdapter:HomeAdapter
    private var pageInfo = PageInfo()
    private val daiLiReq = DaiLiReq()
    override fun initView(savedInstanceState: Bundle?) {

        binding.rv.layoutManager = LinearLayoutManager(this)
        binding.rv.adapter = mAdapter
        truck.deliver()
        viewModel.homeList(convertRequestBody(daiLiReq))
        viewModel.list.observeForever {
            if (pageInfo.isFirstPage) {
                val rows = it.rows
                //如果是加载的第一页数据，用 setData()
                mAdapter.setNewInstance(it.rows)
            } else {
                //不是第一页，则用add
                mAdapter.addData(it.rows)
            }
            mAdapter.loadMoreModule.loadMoreComplete()
            binding.swipeRefresh.isRefreshing = false
            pageInfo.nextPage()

        }
        initRefreshLayout()
        initLoadMore()

    }

    private fun initRefreshLayout() {
        binding.swipeRefresh.setColorSchemeColors(Color.BLACK)
        binding.swipeRefresh.setOnRefreshListener { refresh() }
    }

    /**
     * 初始化加载更多
     */
    private fun initLoadMore() {
        mAdapter.loadMoreModule.setOnLoadMoreListener { loadMore() }
        mAdapter.loadMoreModule.isAutoLoadMore = true
        //当自动加载开启，同时数据不满一屏时，是否继续执行自动加载更多(默认为true)
        mAdapter.loadMoreModule.isEnableLoadMore = false

    }

    /**
     * 刷新
     */
    private fun refresh() {
        mAdapter.loadMoreModule.isEnableLoadMore = false
        pageInfo.reset()
        daiLiReq.page.pageNo = pageInfo.page
        daiLiReq.page.pageSize = pageInfo.size
        viewModel.homeList(convertRequestBody(daiLiReq))
    }

    /**
     * 加载更多
     */
    private fun loadMore() {
        daiLiReq.page.pageNo = pageInfo.page
        daiLiReq.page.pageSize = pageInfo.size
        viewModel.homeList(convertRequestBody(daiLiReq))
    }


    override fun onRefresh() {
        refresh()
    }


}