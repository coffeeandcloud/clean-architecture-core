package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Maybe

abstract class MaybeUseCase<I, O> : UseCase<I, Maybe<O>>() {
    abstract override fun execute(param: I): Maybe<O>
}