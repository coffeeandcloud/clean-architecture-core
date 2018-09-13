package com.sulkyloops.wedgebackend.core.base

/**
 * Base abstract UseCase class with input parameter I and
 * output parameter O
 */
abstract class UseCase<I, O> {
    abstract fun execute(param: I): O
}