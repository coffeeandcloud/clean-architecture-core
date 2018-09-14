package com.sulkyloops.wedgebackend.core.base

import io.reactivex.Scheduler
import io.reactivex.schedulers.Schedulers

/**
 * Base abstract UseCase class with input parameter I and
 * output parameter O
 */
abstract class UseCase<I, O>() {
    abstract fun start(param: I): O
    protected abstract fun execute(param: I): O
}