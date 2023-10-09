public class FuncionarioEnsinoBasico extends Funcionarios {

    private String escolaEnsinoBasico;
    double salarioLocal = super.salario() * 1.1;

    public FuncionarioEnsinoBasico(String nome, int codigo, String escolaEnsinoBasico) {
        super(nome, codigo);
        this.escolaEnsinoBasico = escolaEnsinoBasico;
    }

    public double salario(){
        return salarioLocal;
    };
}
