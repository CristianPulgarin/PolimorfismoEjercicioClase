package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public class Gato extends Animal {

    public Gato(String nombre, String tipoA, int edad) {
        super(nombre, tipoA, edad);

    }

    @Override
    public void Alimentarse() {

        Gato G = new Gato("Jerri", "Gato", 5);

        JOptionPane.showMessageDialog(null, "Soy un " + G.getTipoA() + "\n" + "Me llamo " + G.getNombre() + "\n" + "Tengo " + G.getEdad() + " años\n" + " Y me alimento de wiscaz");
    }

}
