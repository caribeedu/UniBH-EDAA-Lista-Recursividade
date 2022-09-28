
import java.util.Scanner;

/**
 *
 * @author Edu Caribé
 */
public class EduQ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um número N: ");
        int n = input.nextInt();
        
        int soma = somaNumerosZeroAteN(n, 0, 0);
        System.out.println("Soma total:" + soma);
    }
    
    private static int somaNumerosZeroAteN(int n, int numeroAtual, int valorAtual) {
        System.out.println("Soma atual:" + valorAtual + " - " + "Número atual:" + numeroAtual);
        
        valorAtual += numeroAtual;
        numeroAtual++;        
        
        if (numeroAtual != n)
            return somaNumerosZeroAteN(n, numeroAtual, valorAtual);
        else
            return valorAtual;
    }
}
