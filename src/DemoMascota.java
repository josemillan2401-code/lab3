public class DemoMascota {

    public static void main(String[] args) {
        Perro perro = new Perro ("Firulais", 3, "Labrador");
        Gato gato = new Gato ("Michi", 1, true);

        System.out.println("perro");
        perro.mostrarInfo();

        System.out.println("gato");
        gato.mostrarInfo();
    }
}