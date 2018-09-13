package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Completable

abstract class CompletableUseCase<I> : UseCase<I, Completable>() {
    abstract override fun execute(param: I): Completable
}