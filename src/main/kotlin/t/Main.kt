package t

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import t.DogSteps

@SpringBootApplication
class DogsTestApp(private val mydogSteps:DogSteps) : CommandLineRunner {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<DogsTestApp>(*args)
        }
    }
    override fun run(vararg args: String?) {
        try{
            mydogSteps.makeBark("На улице","Буба","Увидел птичку",3)
        } catch (e:Exception){
           println( "Не гавкнул потому что:" +e.message.toString())
        }
    }





}
