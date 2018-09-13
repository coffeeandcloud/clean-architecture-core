package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Observable

abstract class ObservableUseCase<I, O> : UseCase<I, Observable<O>>() {
    abstract override fun execute(param: I): Observable<O>
}