public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public String getNome() {
        return this.nome;
    }

    public double getIdade() {
        return (double)this.idade;
    }

    public double getPeso() {
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }

    }

    public void setPeso(double peso) {
        if (peso > 0.0) {
            this.peso = peso;
        }

    }

    public void setAltura(double altura) {
        if (altura > 0.0) {
            this.altura = altura;
        }

    }

    public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String classificarIMC() {
        double imc = this.calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso.";
        } else if (imc < 25.0) {
            return "Peso Normal.";
        } else if (imc < 30.0) {
            return "Sobrepeso.";
        } else if (imc < 35.0) {
            return "Obesidade grau 1.";
        } else {
            return imc < 40.0 ? "Obesidade grau 2." : "Obesidade grau 3.";
        }
    }
}
