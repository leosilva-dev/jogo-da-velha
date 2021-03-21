public class Jogador {
    private String nome;
    private int pontos;

    Jogador(String nome, int pontos){
        this.setNome(nome);
        this.setPontos(pontos);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
