public class Obra {
    private String nombre, tipo;
    private int precio, ano;
    private Artista artista;

    public Obra(String nombre, String tipo, int precio, int ano, Artista artista){
        this.nombre=nombre;
        this.tipo=tipo;
        this.precio=precio;
        this.ano=ano;
        this.artista=artista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getAno() {
        return ano;
    }

    public Artista getArtista() {
        return artista;
    }
}
