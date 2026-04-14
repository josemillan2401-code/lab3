public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("El perro ladra: Guau Guau");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Raza: " + raza);
    }
}
