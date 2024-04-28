package t.service
import io.grpc.examples.animals.*
import net.devh.boot.grpc.client.inject.GrpcClient
import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Component

@Component
@Primary
class DogsClientService {
    @GrpcClient("pet")
    private  lateinit var dogStub: DogGrpc.DogBlockingStub

    fun  barkRequest(request: BarkRequest): BarkReply{
        return dogStub.bark(request)
    }

    fun  playRequest(request: PlayRequest): PlayReply{
        return dogStub.play(request)
    }
}