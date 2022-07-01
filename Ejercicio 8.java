public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(10);
        persona.setNombre("Pepe");
        persona.setTelefono("+1800123456");

        persona.getEdad();
        persona.getNombre();
        persona.getTelefono();
    }

    public static class Persona {
        private int edad;
        private String nombre;
        private String telefono;

        private void setEdad(int edad) {
            this.edad = edad;
        }

        private void getEdad() {
            System.out.println(edad);
        }

        private void setNombre(String nombre) {
            this.nombre = nombre;
        }

        private void getNombre() {
            System.out.println(nombre);
        }

        private void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        private void getTelefono() {
            System.out.println(telefono);
        }
    }

}