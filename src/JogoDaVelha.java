import java.text.MessageFormat;
import java.util.Arrays;

public class JogoDaVelha {
    private int tamanhoTabuleiro;
    private char [][] tabuleiro;
    private int jogadasFeitas;

    JogoDaVelha(int tamanhoTabuleiro){
        this.setTamanhoTabuleiro(tamanhoTabuleiro);
        this.tabuleiro = new char[tamanhoTabuleiro][tamanhoTabuleiro];
        this.setJogadasFeitas(0); 
    }

    public int getJogadasFeitas() {
        return jogadasFeitas;
    }

    public void setJogadasFeitas(int jogadasFeitas) {
        this.jogadasFeitas = jogadasFeitas;
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(char tabuleiro[][]) {
        this.tabuleiro = tabuleiro;
    }

    public int getTamanhoTabuleiro() {
        return tamanhoTabuleiro;
    }

    public void setTamanhoTabuleiro(int tamanhoTabuleiro) {
        this.tamanhoTabuleiro = tamanhoTabuleiro;
    }

    public boolean realizaJogada(int linha, int coluna, char caracter){
        
        if(linha >= tamanhoTabuleiro || coluna >= tamanhoTabuleiro ){
            return false;
        }

        if(tabuleiro[linha][coluna] == 0){
            tabuleiro[linha][coluna] = caracter;
            setJogadasFeitas(jogadasFeitas+1);
            return true;
        }else{
            return false;
        }
        
    }

    public boolean verificaGanhador(){
        if(jogadasFeitas < tamanhoTabuleiro){
            return false;
        }

    char jogadorGanhador = 0;
    String mensagem = "Venceu ";

    for (int x = 0; x < tabuleiro.length; x++) {

        int pontos = 1;

        if (tabuleiro[x][0] == 0) {
            continue;
        }

        char primeiroValor = tabuleiro[x][0];

        for (int y = 1; y < tabuleiro.length; y++) {

            if (tabuleiro[x][y] == 0) {
                break;
            }

            if (tabuleiro[x][y] == primeiroValor) {
                pontos++;
            }
        }

        if (pontos == tamanhoTabuleiro) {

            jogadorGanhador = primeiroValor;

            System.out.println(mensagem + jogadorGanhador);
            return true;
        }
    }

    for (int x = 0; x < tabuleiro.length; x++) {

        int pontos = 1;

        if (tabuleiro[0][x] == 0) {
            continue;
        }

        char primeiroValor = tabuleiro[0][x];

        for (int y = 1; y < tabuleiro.length; y++) {

            if (tabuleiro[y][x] == 0) {
                break;
            }

            if (tabuleiro[y][x] == primeiroValor) {
                pontos++;
            }
        }

        if (pontos == tamanhoTabuleiro) {

            jogadorGanhador = primeiroValor;

            System.out.println(mensagem + jogadorGanhador);
            return true;
        }
    }

    if (tabuleiro[0][0] != 0) {

        char primeiroValor = tabuleiro[0][0];
        int pontos = 1;

        for (int x = 1; x < tabuleiro.length; x++) {

            if (tabuleiro[x][x] == 0) {
                break;
            }

            if (tabuleiro[x][x] == primeiroValor) {
                pontos++;
            }
        }

        if (pontos == tamanhoTabuleiro) {

            jogadorGanhador = primeiroValor;

            System.out.println(mensagem + jogadorGanhador);
            return true;
        }
    }

    if (tabuleiro[0][tabuleiro.length - 1] != 0) {

        char primeiroValor = tabuleiro[0][tabuleiro.length - 1];
        int pontos = 1;

        for (int x = 1; x < tabuleiro.length; x++) {

            if (tabuleiro[x][tabuleiro.length - x - 1] == 0) {
                break;
            }

            if (tabuleiro[x][tabuleiro.length - x - 1] == primeiroValor) {
                pontos++;
            }
        }

        if (pontos == tamanhoTabuleiro) {

            jogadorGanhador = primeiroValor;

            System.out.println(mensagem + jogadorGanhador);
            return true;
        }
    }

    return false;
}


    public String toString() {

        System.out.println("----------------------------");
        System.out.println();

        System.out.print("    ");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print(i + "   ");
        }
       
        System.out.println();
        for (int x = 0; x < tabuleiro.length; x++) {

            System.out.print(x + " ");
            for (int y = 0; y < tabuleiro.length; y++) {

                if (tabuleiro[x][y] == 0) {

                    System.out.print(MessageFormat.format("| {0}  ", tabuleiro[x][y]));
                } else {
                    System.out.print(MessageFormat.format("| {0} ", tabuleiro[x][y]));
                }
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println();
        System.out.println("----------------------------");

        return "JogoDaVelha [dimensao=" + tamanhoTabuleiro + ", tabuleiro=" + Arrays.toString(tabuleiro) + "]";
    }

    public void resetTabuleiro(){
        for (int row = 0; row < tabuleiro.length; row++) {
            for (int col = 0; col < tabuleiro[row].length; col++) {
               tabuleiro[row][col] = 0;
            }
         }
    }
   
  
}
