public class Libro {
    // Atributos
    String titulo;
    String autor;
    //TODO agrega más atributos de los libros relevantes para tienda
    String ISBN;
    double precio;

    // Constructor sin parámetros
    public Libro() {
        //Inicializa los atributos con valores por defecto
        titulo = "Título";
        autor = "Autor";
        ISBN = "ISBN";
        precio = 0.0;
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String ISBN, double precio) {
        // Inicializa los atributos con los valores dados
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        // Implementa este método para mostrar los detalles del libro
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Precio: Q" + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        // Implementa este método para actualizar el precio del libro
        this.precio = nuevoPrecio;
        System.out.println("Libro '" + titulo + "' ahora a Q" + precio);
    }
}
