public class FuncionarioEnsinoSuperior extends FuncionarioEnsinoMedio {

    private String escolaEnsinoSuperior;
    double salarioLocal = super.salario() * 2;

    public FuncionarioEnsinoSuperior(String nome, int codigo, String escolaEnsinoBasico, String escolaEnsinoMedio, String escolaEnsinoSuperior) {
        super(nome, codigo, escolaEnsinoBasico, escolaEnsinoMedio);
        this.escolaEnsinoSuperior = escolaEnsinoSuperior;
    }

    public double salario(){
        return salarioLocal;
    };
}
