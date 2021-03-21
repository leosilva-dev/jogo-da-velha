public class Jogador {
    private String nome;
    private int pontos;

    Jogador(String nome){
        this.setNome(nome);
        this.pontos = 0;
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
        return "Jogador: " + nome + " | " + "Pontos: " + pontos; 
    }
}
