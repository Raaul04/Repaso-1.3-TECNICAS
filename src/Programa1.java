public class Programa1 {
    private String nombre;
    private int edad;

    public Programa1(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void main(String[] args) {
        Programa1 p1= new Programa1("Raul",19);
        Programa1 p2= new Programa1("Sole", 33);

        System.out.println("Se llama "+ p1.getNombre()+ " y tiene "+ p1.getEdad()+" años");
        System.out.println("Se llama "+ p2.getNombre()+ " y tiene "+ p2.getEdad()+" años");

    }
}
