public class Main {
    public static void main(String[] args) {
        int resultado;
        System.out.println(suma (2,2,2));

        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);
        miCoche.agregarPuerta();
        System.out.println(miCoche.puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coche {
        public int puertas = 4;

        public void agregarPuerta() {
            puertas++;
        }
    }
}
