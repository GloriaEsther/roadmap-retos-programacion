/*
 * EJERCICIO:
 * - Muestra ejemplos de creación de todas las estructuras soportadas por defecto en tu lenguaje.
 * - Utiliza operaciones de inserción, borrado, actualización y ordenación.
 *
 * DIFICULTAD EXTRA (opcional):
 * Crea una agenda de contactos por terminal.
 * - Debes implementar funcionalidades de búsqueda, inserción, actualización y eliminación de contactos.
 * - Cada contacto debe tener un nombre y un número de teléfono.
 * - El programa solicita en primer lugar cuál es la operación que se quiere realizar, y a continuación
 *   los datos necesarios para llevarla a cabo.
 * - El programa no puede dejar introducir números de teléfono no numéricos y con más de 11 dígitos.
 *   (o el número de dígitos que quieras)
 * - También se debe proponer una operación de finalización del programa.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.List;

public class GloriaEsther {
   
    /*
     //conjuntos: hashset y treeset
    //map: hashamp y treemap
    //pilas y colas: stack, queque (cola),;
Tablas Hash
Pilas y Colas
Grafos y Árboles */

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        //Arreglos(array) es un conjunto de datos con tamano fijo y estatico
        String Animales [] = new String[5];// ={"perro","vaca","gato","canario","paloma"};
        //Insertar 
        for( int i=0;i<Animales.length;i++){
            System.out.println("Ingresa un animal: ");
            String animal= teclado.next();
            Animales[i]= animal;
        }   
        //Mostrar los elementos
        System.out.println("Esto estaba en el array: ");
        for (String animal :Animales){
            System.out.println(animal);
        }
        //Actualizacion
        Animales [0]="Pichon";
        System.out.println("Nueva primera posicion del array: "+Animales[0]);
        //Otro ejemplo de actualizar es este:
        int Numeros[] ={6,2,3,5};
        Numeros[2]=7;
        System.out.println("Este numero estaba en la posicion 2 de este array: "+Numeros[2]);
        //Ordenamiento de menor a mayor
        Arrays.sort(Numeros);
        for (int numero :Numeros){
            System.out.println(numero);
        }

        /*Listas
          Arraylist es para manejar datos de manera dinamica porque puede crecer de tamano tanto como se necesite 
        */

        ArrayList<String> lista_frutas = new ArrayList<>(Arrays.asList("Manzana", "Naranja"));
        //Tambien se puede declarar asi
        // ArrayList<String> lista_frutas = new ArrayList<String>(); o  ArrayList<String> lista_frutas = new ArrayList<>();
        
        // Agregar
        lista_frutas.add("Durazno"); 
        lista_frutas.add("Pera"); 
        lista_frutas.add("Fresa"); 
        lista_frutas.add("Platano"); 

        //Recorrido antes de borrar y modificar
        System.out.println("Arraylist(recorrido con for): ");
        for (String fruta :lista_frutas){
            System.out.println(fruta);
        }
        System.out.println("Arraylist: " +lista_frutas);
        // Borrar (por índice)
        lista_frutas.remove(1); //Borraria Naranja

        //Modificar
        System.out.println(lista_frutas.get(3));
        lista_frutas.add(1,"Mango"); 
        lista_frutas.set(3,"Tuna");
        //Recorrido
        System.out.println("Arraylist actualizado: "+lista_frutas);

        //Linkedist
        LinkedList<String> Personas = new LinkedList<>();
        Personas.add("Natalia");
        Personas.add("Roberto");
        System.out.println("Linkedlist: "+Personas);
        //Actualizacion
        Personas.addFirst("Maria");
        Personas.addLast("Fernando");   
        System.out.println("Linkedlist actualizada: "+Personas);
        
        //Obtener
        System.out.println("Primera posicion: "+Personas.getFirst());
        System.out.println("Ultima posicion: "+Personas.getLast());

        //Borrar
        Personas.remove("Maria");
        Personas.removeFirst();
        Personas.removeLast();
        System.out.println("Linkedlist actualizada: "+Personas);
    }


}
