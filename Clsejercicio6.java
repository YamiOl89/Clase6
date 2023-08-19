package pkgejercicio;

public class Clsejercicio6 {
    private String Nombre;
    private double Sueldo_base;
    private double descuentos;
    private double sueldo_liquido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public double getSueldo_base() {
        return Sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        Sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }

    public void calcularSueldoLiquido() {
        sueldo_liquido = Sueldo_base - descuentos;
    }

    public static void main(String[] args) {
        Clsejercicio6 ej = new Clsejercicio6();
        ej.setNombre("juan");
        ej.setSueldo_base(3000);
        ej.setDescuentos(500);

        ej.calcularSueldoLiquido();

        System.out.println("Nombre: " + ej.getNombre());
        System.out.println("Sueldo_Base: " + ej.getSueldo_base());
        System.out.println("Descuentos: " + ej.getDescuentos());
        System.out.println("Sueldo_Liquido: " + ej.getSueldo_liquido());
    }
}
