public class Himmel extends HeroParty {
    private String habilidoso;
    String apaixonado;
    String generoso;

    public Himmel() {

        super();
    }
    public Himmel(String nome, String raca, int idade, String classe, String habilidoso, String apaixonado, String generoso){

        super(nome, raca, idade, classe);

        this.habilidoso = habilidoso;
        this.apaixonado = apaixonado;
        this.generoso = generoso;

}
    @Override
    public String getNome() {
    return super.getNome();
    }
    @Override
    public String getRaca() {
    return super.getRaca();
    }
    @Override
    public int getIdade() {
        return super.getIdade();
    }
    @Override
    public String getClasse() {
        return super.getClasse();
    }
    public String getHabilidoso() {
        return habilidoso;
    }
    public String getApaixonado() {
        return apaixonado;
    }
    public String getGeneroso() {
        return generoso;
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setRaca(String raca) {
        super.setRaca(raca);
    }
    @Override
    public void setIdade(int idade) {
        super.setIdade(idade);
    }
    @Override
    public void setClasse(String classe) {
        super.setClasse(classe);
    }
    public void setHabilidoso(String habilidoso) {
        this.habilidoso = habilidoso;
    }
    public void setApaixonado(String apaixonado) {
        this.apaixonado = apaixonado;
    }
    public void setGeneroso(String generoso) {
        this.generoso = generoso;
    }

}
