package com.example.liststart.datasource

import com.example.liststart.util.Constants
import com.example.liststart.viewmodel.BusinessViewModelFactory
import com.example.liststart.viewmodel.MarkerViewModelFactory

object DataSourceProvider {
    // Business 관련 싱글톤 인스턴스
    private val businessDataSource: BusinessDataSource by lazy {
        BusinessDataSourceImpl(Constants.turbineApiService)
    }

    val businessViewModelFactory: BusinessViewModelFactory by lazy {
        BusinessViewModelFactory(businessDataSource)
    }

    private val markerDataSource: MarkerDataSource by lazy {
        MarkerDataSourceImpl(Constants.turbineApiService)
    }

    val markerViewModelFactory: MarkerViewModelFactory by lazy {
        MarkerViewModelFactory(markerDataSource)
    }

}