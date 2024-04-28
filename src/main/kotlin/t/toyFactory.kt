package t

import io.grpc.examples.animals.Toy
import io.grpc.examples.animals.Color
class toyFactory private constructor(){
    companion object {
        fun newToy(colorName:String, toyName:String):Toy{

         val toyColor=  Color.newBuilder().setName(colorName).build()

         val dogToy = Toy.newBuilder()
             .setName(toyName)
             .setColor(toyColor)
             //.colorBuilder.setName(colorName)
             .build()

            return dogToy

        }

    }
}
