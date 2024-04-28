package t

import org.springframework.stereotype.Component
import  io.grpc.examples.animals.BarkRequest
import io.grpc.examples.animals.PlayRequest
import t.service.DogsClientService

@Component
class DogSteps (private val stepsdDogGrpcService: DogsClientService){

    fun makeBark( place:String,name:String, reason:String, count:Int) {

        val request1 = BarkRequest.newBuilder()
        request1.setWhereBark(place)
        request1.setWhoBark(name)
        request1.setWhyBark(reason)
        request1.setHowManyTimesBark(count)
        val request2=request1.build()

         val getResponse = stepsdDogGrpcService.barkRequest(request2)


    }

   fun makePlay (toyName:String, toyColor:String, playPlace:String){
       val dogToy = toyFactory.newToy(toyColor, toyName)
       val request1 = PlayRequest.newBuilder()
       request1.setPlace(playPlace)
       request1.setToy(dogToy)
       val request2=request1.build()
       val getResponse =stepsdDogGrpcService.playRequest(request2)
   }


}