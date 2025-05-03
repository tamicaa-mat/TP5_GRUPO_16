package principal;

public class Peliculas {
	private int id;
    private String titulo;
    private Categorias categoria;
    private static int siguienteId = 1;

    public Peliculas(String titulo, Categorias categoria) {
        this.id = siguienteId++;
        this.titulo = titulo;
        this.categoria = categoria;
    }
    
    public int getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Categorias getCategoria() {
        return categoria;
    }
    public void setCategoria(Categorias categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Título: " + titulo + ", " + categoria;
    }

	public static int obtenerSiguienteId() {
		
		return siguienteId;
	}
}
