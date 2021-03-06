package com.anstaendig.base.repository

import io.reactivex.ObservableTransformer

interface BaseRepository {
    val results: ObservableTransformer<out BaseAction, out BaseResult>
}

interface BaseResult
interface BaseAction
