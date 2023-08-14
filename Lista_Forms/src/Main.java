public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora(7,11);

        double soma = calculadora.somar();
        double subtracao = calculadora.subtrair();
        double multiplicacao = calculadora.multiplicar();
        double divisao = calculadora.dividir();

        System.out.printf("A soma é: %.2f\n", soma);
        System.out.printf("A subtração é: %.2f\n", subtracao);
        System.out.printf("A multiplicação é: %.2f\n", multiplicacao);
        System.out.printf("A divisão é: %.2f\n\n", divisao);




        ParOuImpar parOuImpar = new ParOuImpar();

        boolean par = parOuImpar.vericarParOuImpar();
        System.out.println(par ? "O número é par\n" : "O número é ímpar\n");




        CalculadoraDeAceleracao calculoDaAceleracao = new CalculadoraDeAceleracao();

        double aceleracaoDoObjeto = calculoDaAceleracao.aceleracao();
        System.out.printf("A aceleração do objeto é de: %.2f m/s", aceleracaoDoObjeto);
    }


}