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

}
