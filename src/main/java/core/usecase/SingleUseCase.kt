package core.usecase

import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

abstract class SingleUseCase<I, O>(
        open val observeOn: Scheduler?,
        open val subscribeOn: Scheduler?
) : UseCase<I, Single<O>>() {
    constructor(): this(null, null)

    override fun start(param: I): Single<O> {
        return execute(param)
                .subscribeOn(this.subscribeOn?: Schedulers.io())
                .observeOn(this.observeOn?: Schedulers.io())
    }
    abstract override fun execute(param: I): Single<O>
}