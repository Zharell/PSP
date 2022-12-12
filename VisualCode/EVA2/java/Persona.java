package EVA2.java;

public class Persona implements EventSource.Observer{

    String nombre;
    public Persona (String nombre) {
        this.nombre=nombre;
    }



    @Override
    public void update(String event) {
        System.out.println(String.format("Soy %s, ha pasado %s, ",nombre, event));
    }
    
}
