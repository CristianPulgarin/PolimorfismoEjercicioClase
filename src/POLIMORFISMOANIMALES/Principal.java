
package POLIMORFISMOANIMALES;


public class Principal {
    
    public static void main(String args[]){
    
    Animal P=new Perro("Doggi", "Perro", 5, "Pitbull");
    P.Alimentarse();
    
    Animal Gato=new Gato("Jerri","Gato",5);
    Gato.Alimentarse();
    
    Animal raton =new Raton("Pipe","Raton",2);
    raton.Alimentarse();
        
    Animal Elefante =new Elefante("Felpi","Elefante",15);
    Elefante.Alimentarse();
    
    Animal Tiburon=new Tiburon("Tiburoncin","Tiburon",7);
            Tiburon.Alimentarse();
            
    }
    
}
