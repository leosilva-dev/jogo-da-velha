import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "";

        System.out.println("Jogo da velha!");

        while(nome.isEmpty()){
            System.out.println("Informe o nome do primeiro jogador: ");
            nome = sc.nextLine();
        }

        Jogador j1 = new Jogador(nome);

        nome = "";
        while(nome.isEmpty()){
            System.out.println("Informe o nome do segundo jogador: ");
            nome = sc.nextLine();
        }

        Jogador j2 = new Jogador(nome);

        
        


        sc.close();
    }
}
