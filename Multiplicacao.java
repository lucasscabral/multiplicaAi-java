package multiplicacao;

import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite qual numero voce quer saber a tabuada: ");
        int numero = entrada.nextInt();
        System.out.println("Tabela de multiplicação de " + numero);

        for (int i = 0; i < 11; i++) {
            int multiplicacao = numero * i;
            System.out.println(numero + " x " + i + "= " + multiplicacao);
        }

        entrada.close();
    }
}
