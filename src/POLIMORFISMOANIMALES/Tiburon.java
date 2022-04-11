package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public class Tiburon extends Animal {

    public Tiburon(String nombre, String tipoA, int edad) {
        super(nombre, tipoA, edad);

    }

    @Override
    public void Alimentarse() {
        Tiburon T = new Tiburon("Tiburoncin", "Tiburon", 7);

        JOptionPane.showMessageDialog(null, "Soy un " + T.getTipoA() + "\n" + "Me llamo " + T.getNombre() + "\n" + "Tengo " + T.getEdad() + " años\n" + " Y me alimento de peces");
    }

}
