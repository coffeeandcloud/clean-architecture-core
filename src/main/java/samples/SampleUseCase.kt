package samples

import com.sulkyloops.wedgebackend.core.base.SingleUseCase
import io.reactivex.Scheduler
import io.reactivex.Single

class SampleUseCase(
        subscribeOn: Scheduler?,
        observeOn: Scheduler?
): SingleUseCase<String, String>() {

    constructor(): this(null, null)

    override fun execute(param: String): Single<String> {
        return Single.just("Hello World!")
    }
}