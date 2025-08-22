package switchs;

public class switchs {
    public static void main(String[] args) {
        float num1 = 1, num2 = 0;
        byte opcao = 4;
        switch (opcao) {
            case 1:
                System.out.println("Resultado da adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Opção Invalida!");
        }
    }
}
