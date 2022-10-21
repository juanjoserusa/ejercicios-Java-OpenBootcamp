public class Main {
    public static void main(String[] args) {
        System.out.println("La suma de mis tres parametros es " + suma( 4, 5, 6));


        coche myCoche = new coche ();
        myCoche.sumarPuertas();



        System.out.println("El numero de puertas de mi coche ahora son " + myCoche.Puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;

    };

    static class coche{
        public int Puertas = 4;

    public void sumarPuertas(){
    this.Puertas++;
    }
    }
    }


