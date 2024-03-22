package Gabriel.Alexander

import org.w3c.dom.Text

class Calculadora {

    fun calcular(numero:Int):String
    {

        var resultado:String

        if (numero % 2 == 0){
            resultado = "Par"

        }
        else {
            resultado = "Impar"
        }
        return resultado
    }


}