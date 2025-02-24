package br.com.fiap.imcapp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import kotlin.math.pow

fun calcularIMC(pesoU: Double, alturaU: Double) : Double {
    var imc = pesoU / (alturaU/100).pow(2)
    return imc
}

fun imcStatus(imcUsuario: Double) : String {
    return if(imcUsuario < 18.5) {
        "Abaixo do peso"
    } else if (imcUsuario >= 18.5 && imcUsuario < 25.0) {
        "Peso Ideal"
    } else if (imcUsuario >= 25.0 && imcUsuario < 30.0) {
        "Levemente acima do peso"
    } else if (imcUsuario >= 30.0 && imcUsuario < 35.0) {
        "Obesidade Grau I"
    } else if (imcUsuario >= 35.0 && imcUsuario < 40.0) {
        "Obesidade Grau II"
    } else {"Obesidade Grau III"}

}

fun corCard(UsuarioStatusIMC: String): Color {
    return if (UsuarioStatusIMC == "Peso Ideal") {
        Color(0xff329F6B)
    } else if (UsuarioStatusIMC == "Abaixo do peso" ||
        UsuarioStatusIMC == "Obesidade Grau I" ||
        UsuarioStatusIMC == "Obesidade Grau II" ||
        UsuarioStatusIMC == "Obesidade Grau III") {
        Color.Red
    } else if (UsuarioStatusIMC == "Levemente acima do peso") {
        Color(0xFFCB7800)
    } else {
        Color.Gray
    }
}

