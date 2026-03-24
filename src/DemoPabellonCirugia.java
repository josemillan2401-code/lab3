import java.util.Scanner;

public class DemoPabellonCirugia {
    public static void main(String[]args){
        Scanner tcld=new Scanner(System.in);

        PabellonCirugia[] pabellonCirugias=new PabellonCirugia[6];
        System.out.println("ingresar datos");
        for (int i=0;i<6;i++) {
            System.out.println("Numero: ");
            int Numero = tcld.nextInt();
            tcld.nextLine();
            System.out.print("Especialidad: ");
            String especialidad = tcld.nextLine();

            pabellonCirugias[i] = new PabellonCirugia(Numero, especialidad);
        }

        for (int i=0;i<6;i++){
            if (i%2!=0){
                pabellonCirugias[i].setEstado(Estado.OCUPADO);
            }
        }

        for (int i=0;i<6;i++){
            System.out.println(pabellonCirugias[i].toString());
        }

        System.out.println("Comparación Pabellones");

        for (int i = 0; i < 6; i++){

            PabellonCirugia x = pabellonCirugias[i];

            for (int z = 0; z < 6; z++){

                PabellonCirugia xx = pabellonCirugias[z];

                if(i != z){
                    if(x.equals(xx)){
                        System.out.println("El pabellon " + x.getNumero() + " es igual a " + xx.getNumero());
                    }
                }
            }
        }
    }
}
