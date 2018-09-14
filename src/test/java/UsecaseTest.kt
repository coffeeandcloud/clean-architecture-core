import io.reactivex.schedulers.Schedulers
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import samples.SampleUseCase

class UsecaseTest {

    @Test
    fun run() {
        val sampleUseCase: SampleUseCase = SampleUseCase(subscribeOn = Schedulers.newThread(), observeOn = Schedulers.computation())
        sampleUseCase.start(param = "Blub").subscribe { s: String ->
            System.out.println(s)
        }
    }
}