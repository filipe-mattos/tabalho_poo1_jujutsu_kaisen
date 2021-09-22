package batalhamistica;

public class Feiticeiro extends Ser {
    private int qtdArmas;
    private String regiao;

    public Feiticeiro(String nome, int peso, double altura){
        super(nome, peso, altura);
        super.setEnergia(100);
    }

    public int getQtdArmas() {
        return this.qtdArmas;
    }

    public void setQtdArmas(int qtdArmas) {
        this.qtdArmas = qtdArmas;
    }

    public String getRegiao() {
        return this.regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }
}
