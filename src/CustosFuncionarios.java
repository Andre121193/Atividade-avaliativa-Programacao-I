import java.util.ArrayList;

public class CustosFuncionarios {

    public static void main(String[] args) {

        ArrayList<Funcionarios> funcionarios = new ArrayList<>();
        double salarioTotal = 0;
        double salarioSuperior = 0;
        double salarioMedio = 0;
        double salarioBasico = 0;

        // populando o arraylist.

        FuncionarioEnsinoBasico fernando = new FuncionarioEnsinoBasico("Fernando", 1, "Escola Machado de assis");
        FuncionarioEnsinoBasico roberto = new FuncionarioEnsinoBasico("Roberto",2, "Escola Machado de assis");
        FuncionarioEnsinoBasico marcela = new FuncionarioEnsinoBasico("Marcela",3, "Escola Machado de assis");
        FuncionarioEnsinoBasico eduarda = new FuncionarioEnsinoBasico("Eduarda",4, "Escola Machado de assis");

        FuncionarioEnsinoMedio alfredo = new FuncionarioEnsinoMedio("Alfredo", 5, "Escola Machado de assis", "Escola Joao widemann");
        FuncionarioEnsinoMedio marcelo = new FuncionarioEnsinoMedio("Marcelo", 6, "Escola Machado de assis", "Escola Joao widemann");
        FuncionarioEnsinoMedio renata = new FuncionarioEnsinoMedio("Renata", 7, "Escola Machado de assis", "Escola Joao widemann");
        FuncionarioEnsinoMedio josiane = new FuncionarioEnsinoMedio("Josiane", 8, "Escola Machado de assis", "Escola Joao widemann");

        FuncionarioEnsinoSuperior andre = new FuncionarioEnsinoSuperior("Andre", 9 , "Escola Machado de assis", "Escola Joao widemann", "Uniavan");
        FuncionarioEnsinoSuperior gabriela = new FuncionarioEnsinoSuperior("Gabriela", 10 , "Escola Machado de assis", "Escola Joao widemann", "Uniavan");

        funcionarios.add(fernando);
        funcionarios.add(roberto);
        funcionarios.add(marcela);
        funcionarios.add(eduarda);
        funcionarios.add(alfredo);
        funcionarios.add(marcelo);
        funcionarios.add(renata);
        funcionarios.add(josiane);
        funcionarios.add(andre);
        funcionarios.add(gabriela);

        // somatoria de salarios de todos os funcionarios.

        for (int i = 0; i < funcionarios.size(); i++) {
            salarioTotal += funcionarios.get(i).salario();
        }

        // somatoria de salarios dos funcionarios por escolaridade.

        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).salario() == 1100){
                salarioBasico += funcionarios.get(i).salario();
            } else if (funcionarios.get(i).salario() == 1650) {
                salarioMedio += funcionarios.get(i).salario();
            } else if (funcionarios.get(i).salario() == 3300) {
                salarioSuperior += funcionarios.get(i).salario();
            }
        }

        System.out.println("O salário total dos funcionários com ensino basico é de R$ " + salarioBasico);
        System.out.println("O salário total dos funcionários com ensino médio é de R$ " + salarioMedio);
        System.out.println("O salário total dos funcionários com ensino superior é de R$ " + salarioSuperior);
        System.out.println("O total de gastos com salário de funcionários é de R$ " + salarioTotal);

    }
}
