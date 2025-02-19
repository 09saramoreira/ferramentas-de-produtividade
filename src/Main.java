//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main (){

    }
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        cilindro.setRaio(2.0);
        cilindro.setAltura(3.0);
        Cilindro cilindro2 = new Cilindro();
        cilindro2.setRaio(3.0);
        cilindro2.setAltura(4.0);
        System.out.println("Volume: " + cilindro.calcularVolume());
        System.out.println("Área: " + cilindro.calcularArea());
        System.out.println("Volume: " + cilindro2.calcularVolume());
        System.out.println("Área: " + cilindro2.calcularArea());
    }
}