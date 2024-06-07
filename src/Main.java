import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.println("Digite uma letra correspondente (P) - (M) - (G) ");
            String sigla = scan.nextLine();

                    switch(sigla){
                case "P":
                    System.out.println("Pequeno");
                    break;
                case "M":
                    System.out.println("Médio");
                    break;
                case "G":
                    System.out.println("Grande");
                default:
                    System.out.println("Indefinido");



            }

        }
    }
