import io.reactivex.schedulers.Schedulers
import org.junit.jupiter.api.Test
import samples.SampleUseCase
import java.lang.Thread.currentThread

class UsecaseTest {

    @Test
    fun run() {
        println(currentThread().name)
        val sampleUseCase: SampleUseCase = SampleUseCase(subscribeOn = Schedulers.io(), observeOn = Schedulers.io())
        sampleUseCase.start(param = "Blub").subscribe { s: String ->
            System.out.println(s)
            println(currentThread().name)
        }
    }
}