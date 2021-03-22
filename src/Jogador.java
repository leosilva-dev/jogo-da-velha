public class Jogador {
    private String nome;
    private int pontos;
    private char caracter;

    Jogador(String nome, char caracter){
        this.setNome(nome);
        this.setCaracter(caracter);
        this.pontos = 0;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void pontua(){
        this.pontos = this.pontos + 1;
    }

    public String toString(){
        return "Jogador: " + nome + " - " + caracter + " | " + "Pontos: " + pontos; 
    }
}
