public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {

    private String escolaEnsinoMedio;
    double salarioLocal = super.salario() * 1.5;

    public FuncionarioEnsinoMedio(String nome, int codigo, String escolaEnsinoBasico, String escolaEnsinoMedio) {
        super(nome, codigo, escolaEnsinoBasico);
        this.escolaEnsinoMedio = escolaEnsinoMedio;
    }

    public double salario(){
        return salarioLocal;
    };

}
