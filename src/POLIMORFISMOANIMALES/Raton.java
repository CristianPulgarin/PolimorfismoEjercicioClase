package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public class Raton extends Animal {

    public Raton(String nombre, String tipoA, int edad) {
        super(nombre, tipoA, edad);
    }

    @Override
    public void Alimentarse() {
        Animal R = new Raton("Pipe", "Raton", 2);
        JOptionPane.showMessageDialog(null, "Soy un " + R.getTipoA() + "\n" + "Me llamo " + R.getNombre() + "\n" + "Tengo " + R.getEdad() + " años\n" + "Y me alimento de queso");
    }

}
