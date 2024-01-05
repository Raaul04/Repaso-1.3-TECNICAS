public class Programa2 {
    private String nombre;
    private String cargo;
    private double salario;

    public Programa2(String nombre, String cargo, double salario){
        this.cargo=cargo;
        this.nombre=nombre;
        this.salario=salario;
    }

    public void calcularSalario(double porcentaje){
        salario=salario+salario * porcentaje/100;

    }


    public double getSalario() {
        return salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }
    public void printEmployeeDetails() {
        System.out.println("Name: " + nombre);
        System.out.println("Job Title: " + cargo);
        System.out.println("Salary: " + salario);
    }

    public static void main(String[] args) {
        Programa2 programa2= new Programa2("Raul","Jefe", 3500);
        programa2.printEmployeeDetails();
        programa2.calcularSalario(4);
        programa2.printEmployeeDetails();
    }
}
