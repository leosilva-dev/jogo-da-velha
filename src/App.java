import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "";
        int tamanhoTabuleiro = 0;
        Jogador jogadorAtual;
        boolean jogando = false;
        boolean reset = false;
        int linha, coluna;
        String continua = "";

        System.out.println("Jogo da velha!");
        
        while(nome.isEmpty()){
            System.out.println("Informe o nome do primeiro jogador: ");
            nome = sc.nextLine();
        }

        Jogador j1 = new Jogador(nome,'X');
        
        nome = "";
        while(nome.isEmpty()){
            System.out.println("Informe o nome do segundo jogador: ");
            nome = sc.nextLine();
        }
        
        Jogador j2 = new Jogador(nome,'O');
        
        System.out.println("Informe o tamanho do tabuleiro: ");
        tamanhoTabuleiro = sc.nextInt();
        
        JogoDaVelha jogo = new JogoDaVelha(tamanhoTabuleiro);        
        
        jogando = true;
        jogadorAtual = j1;

        while(jogando == true){

            if(reset){
                jogo.resetTabuleiro();
                reset = false;
            }


            jogo.toString();

            System.out.println(jogadorAtual.getNome() + ", informe uma linha e coluna para realizar a sua jogada: ");
            System.out.print("Linha: ");
            linha = sc.nextInt();
            System.out.print("Coluna: ");
            coluna = sc.nextInt();
            boolean jogadaFeita = jogo.realizaJogada(linha, coluna, jogadorAtual.getCaracter());
            
            while(!jogadaFeita){
                System.out.println("Jogada incorreta! Esta posição do tabuleiro já foi ocupada...");
                System.out.println(jogadorAtual.getNome() + ", informe uma linha e coluna para realizar a sua jogada: ");
                System.out.print("Linha: ");
                linha = sc.nextInt();
                System.out.print("Coluna: ");
                coluna = sc.nextInt();
                jogadaFeita = jogo.realizaJogada(linha, coluna, jogadorAtual.getCaracter());
            }
           
            
            
            
            if(jogo.verificaGanhador()){
                System.out.println("--------- " + jogadorAtual.getNome()+" venceu! ---------");
                jogadorAtual.pontua();

                System.out.println(j1.toString());
                System.out.println(j2.toString());
                
                

                while(continua.isEmpty()){
                    System.out.println("Deseja jogar novamente? S/N");
                    continua = sc.nextLine();
                }

                if(continua.equalsIgnoreCase("s")){
                    reset = true;
                }

                if(continua.equalsIgnoreCase("n")){
                    jogando = false;
                }

            }
            if(!reset){
                if(jogadorAtual == j1){
                    jogadorAtual = j2;
                }else{
                    jogadorAtual = j1;
                }
            }
            

        }


        System.out.println("Encerrando jogo...");
        
        
       


        sc.close();
    }
}
