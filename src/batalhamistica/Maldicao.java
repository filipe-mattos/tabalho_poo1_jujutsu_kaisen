package batalhamistica;

public class Maldicao extends Ser {
    private String nomeCriador;

    public Maldicao(String nome, int peso, double altura){
        super(nome, peso, altura);
        super.setEnergia(200);
    }
}
