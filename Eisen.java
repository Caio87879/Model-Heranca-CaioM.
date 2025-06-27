public class Eisen extends HeroParty {
    private String resistente;
    String forte;
    String combatente;

    public Eisen() {

        super();
    }
    public Eisen(String nome, String raca, int idade, String classe, String resistente, String forte, String combatente){

        super(nome, raca, idade, classe);

        this.resistente = resistente;
        this.forte = forte;
        this.combatente = combatente;

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
    public String getResistente() {
        return resistente;
    }
    public String getForte() {
        return forte;
    }
    public String getCombatente() {
        return combatente;
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
    public void setResistente(String resistente) {
        this.resistente = resistente;
    }
    public void setForte(String forte) {
        this.forte = forte;
    }
    public void setCombatente(String combatente) {
        this.combatente = combatente;
    }

}
