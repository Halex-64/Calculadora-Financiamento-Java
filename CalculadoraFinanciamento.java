public class CalculadoraFinanciamento {
    public static void main(String[] args) {
        int valorDoCarro= 10000;
        int duracaoEmprestimo = 3;
        int taxaDeJuros = 5;
        int valorEntrada = 2000;
        int valorEmprestimo = 2000;
        

        
     if(duracaoEmprestimo <= 0 || taxaDeJuros <= 0){
        System.out.println ("Erro!! Você deve fazer um emprestimo valido");
    } else if (valorEntrada >= valorDoCarro) {
        System.out.println ("O carro pode ser pago integralmente!");
    } else {
        int saldoRestante = (valorDoCarro - valorEntrada);
        int numeroDeMeses = duracaoEmprestimo * 12;
        int saldoMensal = (saldoRestante / numeroDeMeses);
        int juros = (saldoMensal * taxaDeJuros / 100);
        int pagamentoMensal = (saldoMensal + juros);
        System.out.println (pagamentoMensal);
}
} 
}