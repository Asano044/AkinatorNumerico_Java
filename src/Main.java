import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner entrada = new Scanner(System.in);
        String resposta;
        int[] lista = new int[15];
        int numero;
        int maior = 100;
        int menor = 0;
        for (int contador = 0; contador <= 14; contador++) {
            numero = rd.nextInt(menor+1, maior);
            lista[contador] = numero;
            System.out.println("O número " + lista[contador] +
                    " foi o que você pensou? [sim/menor/maior]");
            resposta = entrada.nextLine();
            if (resposta.equals("sim")) {
                System.out.println("Isso!!! consegui na minha " + (contador+1) + "º tentativa!!");
                break;
            }
            else if (resposta.equals("menor")) {
                menor = lista[contador];
            } else if (resposta.equals("maior")) {
                maior = lista[contador];
            }
            if (contador == 14) {
                System.out.println("Parece que você me venceu, bom trabalho...");
            }
        }

    }
}