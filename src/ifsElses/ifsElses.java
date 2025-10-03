package ifsElses;

public class ifsElses {
    public static void main(String[] args) {
        int a = 10, b= 20;
        int maior = (a > b) ? 12 : 56;
        int media = 5;
        int numeroFaltas = 4;
        int numero = 7;

        System.out.println("Maior número é o " + numero);

        String resultado = (numero % 2 ==0) ? "Par" : "Impar";

        System.out.println("O número " + numero + " é " + resultado);

        if (media >= 6 && numeroFaltas <= 20) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        if (media < 6 || numeroFaltas > 20) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Aprovado");
        }


    }
}
