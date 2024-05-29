public class Main {
    public static void main(String[] args) {
        // Crea un objeto 'libro1' utilizando el constructor sin parámetros
        // Crea un objeto 'libro2' utilizando el constructor con parámetros
        Libro libro1 = new Libro();

        Libro libro2 = new Libro("Pro Git", "Scott Chacon and Ben Straub", "978-3-16-148410-0", 300.00);

        System.out.println("Detalles del Libro 1:");
        libro1.mostrarDetalles();

        // Llama a los métodos 'mostrarDetalles' y 'actualizarPrecio' para 'libro2'
        System.out.println("\nDetalles del Libro 2:");
        libro2.mostrarDetalles();

        libro2.actualizarPrecio(250.00);
    }
}