package poo;

import java.util.HashMap;
import java.util.Scanner;

public class TestaNumero {
    public static void main(String[] args) {

        Numero n = new Numero();

        boolean continuar = true;
        Scanner scan  = new Scanner (System.in);
        while (continuar){

            double x = 0;
            double y = 0;
            int operacao = 0 ;

            System.out.println("Digite a operação Desejada: "
            +                   " \n1 para soma"
            +                   " \n2 para subitração"
            +                   " \n3 para divisão"
            +                   " \n4 para multiplicação"
            +                   " \n5 ou 0 para finalizar o programa"
            
            );
            operacao = scan.nextInt();

            if((operacao == 0 )|| (operacao >5 )){
                continuar = false;
                return;
            }
             System.out.println("Informe o valor do primeiro número");

             x = scan.nextDouble();

             System.out.println("Informe o valor do segundo número");

             y = scan.nextDouble();

             switch (operacao) {
                case 1:

                    imrpimeCalculadora(operacao, n.soma(x,y), x, y);
                    
                    break;
                    
                    case 2:

                    imrpimeCalculadora(operacao, n.subtracao(x,y), x, y);
                    
                    break;

                    case 3:

                    imrpimeCalculadora(operacao, n.divisao(x,y), x, y);
                    
                    break;

                    case 4:

                    imrpimeCalculadora(operacao, n.multiplicacao(x,y), x, y);
                    
                    break;
             
            
             }
        }

        
        scan.close();
    }
    
    static void imrpimeCalculadora(int operacao, double resultado, double x, double y){
        HashMap<Integer, String> mapOperacao = new HashMap <>();
        mapOperacao.put(1, "somado ");
        mapOperacao.put(2, "subtraido ");
        mapOperacao.put(3, "dividido ");
        mapOperacao.put(4, "multiplicado ");

        System.out.println("\n o resultado de "+ x + mapOperacao.get(operacao) + " por " + y + " é igual  a " + resultado + "\n" );
    }
}
