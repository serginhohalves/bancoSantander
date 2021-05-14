
fun main(){
val cliente1 = Cliente(1233,"alves",584989, 41333)
val cc = ContaCorrente(cliente1, 500.67F)
cc.deposito(567F)

}

// classe cliente
class Cliente(
    var numero: Int,
    var sobrenome: String,
    var rg: Int,
    var cpf: Int){
}


//classe conta
open class Conta(
     var cliente: Cliente

){
   open fun deposito(novoDeposito: Float){}
    open fun sacar(novoSaque: Float){}
    open fun consultaSaldo(novoSaldo: Double){}
}

open class ContaCorrente(cliente:Cliente, var saldoCc: Float = 0F):Conta(cliente){


    override fun deposito(novoDeposito: Float) {

        this.saldoCc+=novoDeposito
        println("Foi depositado $novoDeposito em sua conta," +
                "seu novo saldo é de $saldoCc")
//        super.deposito(novoDeposito)
    }

    override fun sacar(novoSaque: Float) {
        this.saldoCc -= novoSaque
        println("Foi Realizado um saque de  $novoSaque" +
                "seu saldo disponóvel é de $saldoCc")
    }

    fun depositoCheque(valorCheque: Float, bancoEmissor:String, dataPagamento:String){
        saldoCc+=valorCheque
        println("Cheque de $valorCheque  da data $dataPagamento do banco $bancoEmissor foi compensado")

    }
}



