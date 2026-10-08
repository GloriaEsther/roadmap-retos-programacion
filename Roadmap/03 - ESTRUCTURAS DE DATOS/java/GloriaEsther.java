/*
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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Iterator;

public class GloriaEsther {
    /*
    //pilas y colas: stack, queque (cola),;
Pilas y Colas
Grafos y Árboles */

    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);

        //Arreglos(array) es un conjunto de datos con tamano fijo y estatico
        String Animales [] = new String[5];
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
        
        System.out.println("Array de numeros ");
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
        System.out.println("Arraylist: " +lista_frutas);
        // Borrar (por índice)
        lista_frutas.remove(1); //Borraria Naranja

        //Modificar
        System.out.println(lista_frutas.get(3));
        lista_frutas.add(1,"Mango"); 
        lista_frutas.set(3,"Tuna");
        //Recorrido
        System.out.println("Arraylist actualizado: "+lista_frutas);
        // Ordenar
        Collections.sort(lista_frutas); // alfabeticamente o en orden ascendente 
        System.out.println(lista_frutas);
        Collections.sort(lista_frutas, Collections.reverseOrder());// alfabeticamente en reversa o en orden ascendente 
        System.out.println(lista_frutas);
        //Esto es para limpiar y borrar todo
        lista_frutas.clear();
        System.out.println(lista_frutas);

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
        // Ordenar
        Collections.sort(Personas); // alfabeticamente o en orden ascendente 
        System.out.println(Personas);
        Collections.sort(Personas, Collections.reverseOrder());// alfabeticamente en reversa o en orden ascendente 
        System.out.println(Personas);

        //Borrar
        Personas.remove("Maria");
        Personas.removeFirst();
        Personas.removeLast();
        System.out.println("Linkedlist actualizada: "+Personas);
        //Borrar todo
        Personas.clear();
        System.out.println(Personas);

        //HashSet
        //Es una coleccion de objetos unicos
        HashSet<String> cars = new HashSet<String>();
        //Agregar
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Si hay un dato duplicado solo parece una vez
        cars.add("Mazda");
        cars.add("Lamborgini");
        //Obtener datos
        System.out.println("Hashset: "+cars);
        
        //Borrar
        cars.remove("Volvo");
       
        //No se puede actualizar como tal porque tiene objetos unicos y sin orden pero se puede simular
        if(cars.contains("Mazda")){ //revisar si existe un elemento en un hashset
            cars.remove("Mazda");
            cars.add("Ferrari"); 
        }
        System.out.println("Hashset actualizado: "+cars);
        
        //Iterador 
        //Sirve para iterar en colecciones como arraylist y hashset (no funciona en colecciones clave-valor)
        Iterator<String> it = cars.iterator();
       // System.out.println("Esto muestra el recorrido de un iterador en un hashset");
        while(it.hasNext()) {
         //System.out.println(it.next());
          String carro =it.next();
         if(carro.equals("Ford")){
            it.remove();
         }
        }
        System.out.println("HashSet: "+cars);
        //Esto es para vaciar el Hashset:cars.clear();
        cars.clear();
        System.out.println(cars);
        //Esto es otro ejemplo de iterador pero con un arraylist de numeros
        ArrayList<Integer> num = new ArrayList<Integer>();
        num.add(12);
        num.add(8);
        num.add(2);
        num.add(23);
        Iterator<Integer> has = num.iterator();
        while(has.hasNext()) {
        Integer i = has.next();
        if(i < 10) {
            has.remove();
        }
        }
        System.out.println(num);
        num.clear();

        //Treeset es una coleccion de objetos unicos pero con un orden
        TreeSet<Integer> numeros = new TreeSet<>();
        //Agregar
        numeros.add(10);
        numeros.add(5);
        numeros.add(1);
        numeros.add(100);
        numeros.add(70);
        //Obtener
        System.out.println("Treeset: "+numeros);
        //Borrar
        numeros.remove(5);
        numeros.clear();
        //No se puede actualizar como tal, solo se podria eliminar el dato instanciar un nuevo elemento y agregarlo
       
        //LinkedHashSet, es una lista de elementos pero recuerda el orden en que se agregaron
        LinkedHashSet<String> flores = new LinkedHashSet<>();
        flores.add("Rosa");
        flores.add("Rosa");  // Duplicados los ignora
        flores.add("Margarita");
        flores.add("Girasol");
        System.out.println("LinkedHashSet: "+flores);
        flores.remove("Margarita");
        System.out.println("LinkedHashSet actualizada: "+flores);
        //No se puede actualizar como tal un valor 
        flores.clear();
        System.out.println(flores);
        /*La interface Map en java permite el uso de clave-valores en el cual la clave es unica pero los valores pueden ser duplicados
        HashMap - rapido y desordenado
        TreeMap - ordenado por clave y aparte su estruc es la de un arbol binario
        LinkedHashMap - recuerda el orden en que se agregaron los elementos
        */
       //HashMap puede tener combinaciones clave - valor como claves string y valores integer 
        HashMap<String, String> capitales = new HashMap<String, String>();

        // Agregar
        capitales.put("Inglaterra", "Londres");
        capitales.put("Mexico", "CDMX");
        capitales.put("Austria", "Wien");
        capitales.put("Noruega", "Oslo");
        capitales.put("Noruega", "Oslo"); // EN caso de duplicados el ultimom valor sobreescribe el anterior
        capitales.put("USA", "Washington DC");
        System.out.println(capitales);

        //Mostrar elementos(por clave)
        capitales.get("Inglaterra");

        //Borrar elementos (por clave)
        capitales.remove("Inglaterra");

        //y clave - valor
        capitales.remove("Austria","Wien");
        System.out.println(capitales);

        //Se puede actualizar el valor pero no la clave ya que asi si se tendria que eliminar todo el elemento
        capitales.put("Japon", "Washington DC");//esta mal al proposito
        System.out.println("HashMap antes de actualizarse: "+capitales);
        capitales.put("Japon", "Tokio");//actualizar
        System.out.println("HashMap despues de actualizarse:"+capitales); 
        capitales.clear();
        System.out.println(capitales);

        //TreeMap
        TreeMap<String, String> paises = new TreeMap<>();
        //Agregar
        paises.put("Europa", "Francia");
        paises.put("Europa", "Francia");//Noruega
        paises.put("E", "Francia");
        paises.put("Asia", "Filipinas");
        paises.put("Asia", "China");
        paises.put("America", "Mexico");
        paises.put("Africa", "Mexico");

        //Un treeMap no permite claves repetidas, es mas las ignora pero si acepta valores duplicados
        System.out.println("TreeMap: "+paises);
        //Acceder a un objeto en especifico por clave
        System.out.println(paises.get("America"));
        //Borrar
        paises.remove("Europa");//por clave
        // paises.remove("Asia","Filipinas");//por clave-valor
        System.out.println("TreeMap: "+paises);
        //Actualizar
        paises.replace("Africa", "Nigeria");
        System.out.println("TreeMap actualizado: "+paises); 
        //Ordenar
        System.out.println(paises.descendingKeySet());//Mostrar las claves en orden descendiente
        System.out.println(paises.descendingMap());//Lo mismo pero tambien muestra su valor
        paises.clear();
        System.out.println(paises);

        //LinkedHashMap
        LinkedHashMap<String, String> Persona = new LinkedHashMap<>();
        Persona.put("Marco", "Ruiz");
        Persona.put("Maria", "Perez");        
        Persona.put("Maria", "Perez");
        Persona.put("Vicente", "Chavez");
        Persona.put("Victoria", "Martinez");
        System.out.println("LinkedHashMap: "+Persona);
        
        //Acceder a un objeto en especifico por clave
        System.out.println(Persona.get("Maria"));
        //Borrar
        Persona.remove("Marco");
        //Actualizar
        Persona.replace("Marco", "Ruiz Gonzalez");
        
        System.out.println("LinkedHashMap actualizada: "+Persona);
        //Ordena en el orden en que se agregan los elementos
        //Limpiar
        Persona.clear();
        System.out.println("LinkedHashMap: "+Persona);
        //Algorithm es una herramienta de collection para ordenar, buscar y manipular datos
        //Ejemplo:
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names); // Los ordena primero
        int index = Collections.binarySearch(names, "Angie");//luego busca
        System.out.println("Angie esta en el indice: " + index);

  }

}
