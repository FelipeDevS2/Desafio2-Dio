import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametro1 = input.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametro2 = input.nextInt();

        try {
            contar(parametro1, parametro2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }

        input.close();
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException{
        if(parametro1>parametro2){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametro2 - parametro1;
        for (int i = 0; i <= contagem; i++){
            System.out.println("Interação "+i);
        }

        
    }

    

}
