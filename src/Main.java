//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Sara");
        pessoa.setIdade(18);
        pessoa.setAltura(1.64);
        pessoa.setPeso(65.0);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + " metros");
        System.out.println("Peso: " + pessoa.getPeso() + " kg");
        System.out.println("IMC: " + pessoa.calcularIMC() + " kg/m2");
        System.out.println("Classificação: " + pessoa.classificarIMC());
    }
}


