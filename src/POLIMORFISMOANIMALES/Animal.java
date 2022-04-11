package POLIMORFISMOANIMALES;

import javax.swing.JOptionPane;

public abstract class Animal {

    private String nombre, tipoA;
    private int edad;

    public Animal(String nombre, String tipoA, int edad) {
        this.nombre = nombre;
        this.tipoA = tipoA;
        this.edad = edad;
    }

    public abstract void Alimentarse();

    public void Moverse() {
        JOptionPane.showMessageDialog(null, "El animal se");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoA() {
        return tipoA;
    }

    public void setTipoA(String tipoA) {
        this.tipoA = tipoA;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
