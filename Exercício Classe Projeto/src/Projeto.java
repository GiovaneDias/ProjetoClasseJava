public class Projeto {
    private String nome;
    private double custoHora;
    private int horas;

    public Projeto(String nome) {
        this.nome = nome;
        this.custoHora = 10.50;
    }
    public Projeto(String nome, double custoHora) {
        this.nome = nome;
        this.custoHora = custoHora;
    }

    public void registrarHoras(int horas) {
        this.horas = horas;
    }

    public double getCustoAtual() {
        return this.horas * this.custoHora;
    }

    public String getNome() {
        return this.nome;
    }

    public double getCustoHora() {
        return this.custoHora;
    }

    public int getHoras() {
        return this.horas;
    }

    public void setNome(String nome) {
        if(nome.trim().equals(nome) != nome.trim().equals("")){
            this.nome = nome;
        }
    }

    public void setCustoHora(double custoHora) {
        if (custoHora>0) {
            this.custoHora = custoHora;
        }
    }
}