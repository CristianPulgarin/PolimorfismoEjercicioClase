package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public class Elefante extends Animal {

    public Elefante(String nombre, String tipoA, int edad) {
        super(nombre, tipoA, edad);
    }

    @Override
    public void Alimentarse() {
        Elefante E = new Elefante("Felpi", "Elefante", 15);

        JOptionPane.showMessageDialog(null, "Soy un " + E.getTipoA() + "\n" + "Me llamo " + E.getNombre() + "\n" + "Tengo " + E.getEdad() + " años\n" + "Y me alimento de mani");
    }

}
