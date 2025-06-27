public class Heiter extends HeroParty {
    private String cachaceiro;
    String curandeiro;
    String engraçado;

    public Heiter() {

        super();
    }
    public Heiter(String nome, String raca, int idade, String classe, String cachaceiro, String curandeiro, String engraçado){

        super(nome, raca, idade, classe);

        this.cachaceiro = cachaceiro;
        this.curandeiro = curandeiro;
        this.engraçado = engraçado;

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
    public String getCachaceiro() {
        return cachaceiro;
    }
    public String getCurandeiro() {
        return curandeiro;
    }
    public String getEngraçado() {
        return engraçado;
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
    public void setCachaceiro(String cachaceiro) {
        this.cachaceiro = cachaceiro;
    }
    public void setCurandeiro(String curandeiro) {
        this.curandeiro = curandeiro;
    }
    public void setEngraçado(String engraçado) {
        this.engraçado = engraçado;
    }

}
