public class Main {
    public static void main(String[] args) {
        int numerolf = 2;

        if (numerolf == 0) {
            System.out.println("numerolf vale 0");
        } else if (numerolf <0) {
            System.out.println("numerolf es negativo");
        } else {
            System.out.println("numerolf es positivo");
        }

        int numeroWhile = 0;

        while(numeroWhile <3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        numeroWhile = 0;
        do {
            numeroWhile++;
        } while (numeroWhile<3);
        System.out.println(numeroWhile);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        var estacion = "invierno";

        switch (estacion) {
            case "invierno":
                System.out.println("Hace frio");
                break;
            case "primaera":
                System.out.println("Aparecen las flores");
                break;
            case "verano":
                System.out.println("Vamos a la playa");
                break;
            case "otoño":
                System.out.println("Se caen las hojas");
                break;
            default:
                System.out.print("Hummm esto si que es raro!");
                break;
        }
    }
}