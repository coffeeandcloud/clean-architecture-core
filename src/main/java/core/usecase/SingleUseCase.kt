package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Single

abstract class SingleUseCase<I, O> : UseCase<I, Single<O>>() {
    abstract override fun execute(param: I): Single<O>
}