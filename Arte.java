import java.util.ArrayList;
import java.util.List;

public class Arte {
    private List<Obra> obras;
    private List<Artista> artistas;

    public Arte(){
        obras=new ArrayList<Obra>();
        artistas=new ArrayList<Artista>();
    }

    private int findObra(String nombre){
        int index = -1;
        for(int i=0;i<obras.size();i++){
            if(obras.get(i).getNombre().equals(nombre)){
                index = i;
            }else if(obras.get(i).getArtista().getNombreArtista().equals(nombre)){
                index = i;
            }
        }
        return index;
    }

    private int findArtist(String nombre){
        int index = -1;
        for(int i=0;i<artistas.size();i++){
            if(artistas.get(i).getNombreArtista().equals(nombre)){
                index = i;
            }
        }
        return index;
    }

    public Obra queryObra(String nombre){
        int index = findObra(nombre);
        if(index!=-1){
            return obras.get(index);
        }else
            return null;
    }

    public Artista queryArtista(String nombre){
        int index = findArtist(nombre);
        if(index!=-1){
            return artistas.get(index);
        }else
            return null;
    }

    public void addArtist(Artista a){
        artistas.add(a);
    }

    public void addObra(Obra o){
       obras.add(o);
    }

    public void deleteObra(Obra o){
        obras.remove(o);
    }

    public void getObra(Obra o){
        System.out.println(o.getNombre() + ", " + o.getTipo() + ", " + o.getAno() + ", " + o.getPrecio() + ", " + o.getArtista().getNombreArtista() + ',' + o.getArtista().getNacionalidad() + ".");
    }

    public void expensiveObra(){
        String nombre="";
        int precio=0;
        for(int i=0;i<obras.size();i++){
            if(obras.get(i).getPrecio()>precio){
                precio = obras.get(i).getPrecio();
                nombre = obras.get(i).getNombre();
            }
        }
        System.out.println("La obra más cara es: " + nombre);
    }

    public void findNewestObra(){
        String nombre="";
        int edad=0;
        for(int i=0;i<obras.size();i++){
            if(obras.get(i).getAno()>edad){
                edad = obras.get(i).getAno();
                nombre = obras.get(i).getNombre();
            }
        }
        System.out.println("La obra más moderna es: " + nombre);
    }

    public static void menu(){
        System.out.println("1.Añadir obra.");
        System.out.println("2.Añadir artista.");
        System.out.println("3.Buscar obra por nombre.");
        System.out.println("4.Buscar obra por artista.");
        System.out.println("5.Eliminar obra.");
        System.out.println("6.Obra más cara.");
        System.out.println("7.Obra más moderna.");
        System.out.println("8.Imprimir obras.");
        System.out.println("9.Imprimir artistas.");
        System.out.println("10.Salir.");
    }

    public void imprimirObras(){
        int cont = 1;
        for(Obra o : obras){
            System.out.println(cont + "º: " + o.getNombre() + ", " + o.getTipo() + ", " + o.getAno() + ", " + o.getPrecio() + ", " + o.getArtista().getNombreArtista() + ", " + o.getArtista().getNacionalidad() + ".");
            cont++;
        }
    }

    public void imprmirArtistas(){
        int cont = 1;
        for(Artista a : artistas){
            System.out.println(cont + "º: " + a.getNombreArtista() + ", " + a.getNacionalidad() + ".");
            cont++;
        }
    }
}
