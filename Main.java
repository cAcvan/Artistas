import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void program(int opcion, Arte a){
        Scanner sc = new Scanner(System.in);
        String nombre;
        switch (opcion){
            case 1:
                System.out.println("Ahora añadirás una obra.");
                System.out.println("Ingrese el nombre de la obra: ");
                nombre = sc.nextLine();
                Obra o = a.queryObra(nombre);
                if(o!=null){
                    System.out.println("La obra " + nombre + " ya está añadida.");
                }else{
                    System.out.println("Ingresa el tipo de obra: ");
                    String tipo = sc.next();
                    System.out.println("Ingresa el año de la obra: ");
                    int edad = sc.nextInt();
                    System.out.println("Ingrese el precio de la obra: ");
                    int precio = sc.nextInt();
                    System.out.println("Ingrese el nombre del artista: ");
                    String nombreArtista = sc.next();
                    Artista art = a.queryArtista(nombreArtista);
                    if(art!=null){
                        System.out.println("El artista " + nombreArtista + " ya existe, por lo tanto no se añadirá a los artistas de nuevo.");
                        o = new Obra(nombre,tipo,precio,edad,art);
                        a.addObra(o);
                    }else{
                        System.out.println("Ingrese su nacionalidad: ");
                        String nacionalidad = sc.next();

                        Artista b = new Artista(nombreArtista,nacionalidad);
                        o = new Obra(nombre,tipo,precio,edad,b);
                        a.addObra(o);
                        a.addArtist(b);
                    }
                }
                    break;

            case 2:
                System.out.println("Ahora vas a añadir un artista.");
                System.out.println("Ingrese el nombre del artista: ");
                nombre = sc.next();
                Artista artista = a.queryArtista(nombre);
                if(artista!=null){
                    System.out.println("El artista " + nombre + " ya está añadido.");
                }else{
                    System.out.println("Ahora ingrese su nacionalidad: ");
                    String nacionalidad = sc.next();

                    artista = new Artista(nombre,nacionalidad);
                    a.addArtist(artista);
                }
                    break;

            case 3:
                System.out.println("Ahora buscarás una obra por su nombre.");
                System.out.println("Ingresa el nombre de la obra: ");
                nombre = sc.next();
                o = a.queryObra(nombre);
                if(o!=null){
                    a.getObra(o);
                }else
                    System.out.println("No existe la obra " + nombre + '.');
                        break;

            case 4:
                System.out.println("Ahora buscarás una obra por el nombre de su artista.");
                System.out.println("Ingresa el nombre del artista: ");
                nombre = sc.next();
                o = a.queryObra(nombre);
                if(o!=null){
                    a.getObra(o);
                }else
                    System.out.println("No existe el artista " + nombre + '.');
                        break;

            case 5:
                System.out.println("Ahora vas a eliminar una obra.");
                System.out.println("Ingresa el nombre de la obra: ");
                nombre = sc.next();
                o = a.queryObra(nombre);
                if(o!=null){
                    a.deleteObra(o);
                    System.out.println("La obra " + nombre + " se ha eliminado correctamente.");
                }else
                    System.out.println("No existe la obra " + nombre + '.');
                        break;

            case 6:
                System.out.println("Ahora se mostrará la obra más cara: ");
                a.expensiveObra();
                    break;

            case 7:
                System.out.println("Ahora se mostrará la obra más moderna.");
                a.findNewestObra();
                    break;

            case 8:
                a.imprimirObras();
                    break;

            case 9:
                a.imprmirArtistas();
                    break;

            default:
                System.out.println("No está disponible esa opción.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arte a = new Arte();

        int opcion=0;

        System.out.println("Ahora podrás ver, añadir y borrar obras de artistas.");
        do{
            try{
                Arte.menu();
                System.out.println();
                System.out.println("Ingresa la opción: ");
                opcion = sc.nextInt();
                Main.program(opcion,a);
                System.out.println();
            }catch (InputMismatchException e){
                System.out.println("Ingrese caracteres válidos.");
                sc.next();
            }
        }while(opcion!=10);
    }
}
