package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String tipoA, int edad, String raza) {
        super(nombre, tipoA, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void Alimentarse() {

        Perro P = new Perro("Doggi", "Perro", 5, "Pitbull");

        JOptionPane.showMessageDialog(null, "Soy un " + P.getTipoA() + "\n" + "Me llamo " + P.getNombre() + "\n" + "Tengo " + P.getEdad() + " años\n" + "Y me alimento de cuido");
    }

}
