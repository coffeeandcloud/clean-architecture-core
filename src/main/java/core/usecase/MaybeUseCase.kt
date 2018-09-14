package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Maybe
import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

abstract class MaybeUseCase<I, O>(
        open val observeOn: Scheduler?,
        open val subscribeOn: Scheduler?
) : UseCase<I, Maybe<O>>() {
    override fun start(param: I): Maybe<O> {
        return execute(param)
                .subscribeOn(this.subscribeOn?: Schedulers.io())
                .observeOn(this.observeOn?: Schedulers.io())
    }

    abstract override fun execute(param: I): Maybe<O>
}