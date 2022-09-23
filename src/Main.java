import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static int x;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1;
        Random sorteio = new Random();
        x = sorteio.nextInt(10);

        while (true) {
            System.out.println("Estou pensando em um numero entre 0 a 9, voce acha que pode acertar?");
            System.out.println("Digite o numero  que estou pensando:");
            num1 = Integer.parseInt(input.nextLine());


            if (num1 == x) {
                System.out.println("Voce Acertou,parabens!");
                break;
            } else {
                if ((num1 > x)) {
                    System.out.println("Numero alto");
                }else{
                    System.out.println("Numero Baixo");
                }
                System.out.println("Voce errou, tente novamente :");
            }
        }
    }
}