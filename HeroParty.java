//Tema escolhido: Ler - Escolhi o manga Sousou no Frieren

public class HeroParty {
    String nome;
    String raca;
    int idade;
    private String classe;

    public HeroParty(){}

    public HeroParty (String nome, String raca, int idade, String classe){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.classe = classe;
    }
    public String getNome() {
        return nome;
    }
    public String getRaca() {
        return raca;
    }
    public int getIdade(){
        return idade;
    }
    public String getClasse(){
        return classe;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
}

