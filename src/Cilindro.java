public class Cilindro {
    private double raio;
    private double altura;

    public Cilindro() {
    }

    public double getRaio() {
        return this.raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularVolume() {
        return Math.PI * Math.pow(this.raio, 2.0) * this.altura;
    }

    public double calcularArea() {
        return 6.283185307179586 * this.raio * (this.raio + this.altura);
    }
}
