import java.util.Scanner;

public class CalculadoraDeAceleracao {
    public double pedirForca(){
        System.out.println("--- PEDINDO FORÇA ---");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a força: ");
        int forca = input.nextInt();
        return forca;
    }

    public double pedirMassa(){
        System.out.println("--- PEDINDO MASSA ---");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a massa: ");
        int massa = input.nextInt();
        return massa;
    }

    public double aceleracao(){
        double forca = pedirForca();
        double massa = pedirMassa();

        System.out.println("--- CALCULANDO ACELERAÇÃO ---");
        return forca/massa;
    }
}
