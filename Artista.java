public class Artista {
    private String nombreArtista, nacionalidad;

    public Artista(String nombreArtista, String nacionalidad){
        this.nombreArtista=nombreArtista;
        this.nacionalidad=nacionalidad;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "nombreArtista= " + nombreArtista + ',' + "nacionalidad= " + nacionalidad + '.';
    }
}
