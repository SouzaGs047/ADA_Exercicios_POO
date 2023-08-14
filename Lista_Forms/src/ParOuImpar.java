import java.util.Scanner;

public class ParOuImpar {
    public int pedirNumero(){
        System.out.println("--- PEDINDO NÚMERO ---");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para verificar se o mesmo é par ou ímpar: ");
        int numero = input.nextInt();
        return numero;
    }

    public boolean vericarParOuImpar(){
        int numero = pedirNumero();

        System.out.println("--- VERIFICANDO SE É PAR ---");
        boolean par;

        if (numero%2==0){
            return par = true;
        }else {
            return par = false;
        }
    }
}
