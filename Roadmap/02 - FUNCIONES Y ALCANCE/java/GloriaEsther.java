import java.util.Scanner;

public class GloriaEsther {
   static int num;//variable global (no lo es como tal pero se puede usar de esa manera haciendo que la variable sea static)
   static float x;
   static float y;
   //Funcion sin retorno ni parametros
    public static void Mensaje(){//las funciones se declaran como static si no se va a instanciar un objeto de la clase que pueda utilizar esto
        System.out.println("Esta es una funcion sin retorno ni parametros");
    }
    //Funcion con retorno y parametros
    public static int suma(int a,int b,int c){
        int resultado = a+b+c;
        return resultado;
    }
    //Funcion con parametro y sin retorno
    public static void saludarUsuario(String nombre) {
        System.out.println("¡Hola, " + nombre + ", este es el resultado de una funcion con parametro y sin retorno!");
    }
    //
    static float divisionFloat(float x,float y){
        return x/y;
    }
    static float multiplicacionFloat(float x,float y){
        return x*y;
    }

    static float sumaFloat(float x,float y){
        return x+y;
    }
    static float restaFloat(float x,float y){
        return x-y;
    }
    static void mostrarResultados(){//Funciones dentro de otras
        x=204.40f;
        y=151.30f;
        float resultado_division=divisionFloat(x, y);
        float resultado_multiplicacion=multiplicacionFloat(x,y);
        float resultado_suma=sumaFloat(x, y);
        float resultado_resta=restaFloat(x, y);
        System.out.println(x+" / "+y+" = "+resultado_division);
        System.out.println(x+" * "+y+" = "+resultado_multiplicacion);
        System.out.println(x+" + "+y+" = "+resultado_suma);
        System.out.println(x+" - "+y+" = "+resultado_resta);
    }
      /*
        * DIFICULTAD EXTRA (opcional):
        * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
        * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
        *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
        *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
        *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
        *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos.
        *
        * Presta especial atención a la sintaxis que debes utilizar en cada uno de los casos.
        * Cada lenguaje sigue una convenciones que debes de respetar para que el código se entienda.
        */

    static String multiplosporTexto(String texto1,String texto2){
        int multiplos=0;
        int veces_num=0;
       // int i;//=0;
        for(int i=1;i<=100;i++){//porque debe imprimir del 1 al 100
            if(i%3==0){
                System.out.println(texto1);
                multiplos+=1;
            }
            if(i%5==0){
                System.out.println(texto2);
                multiplos+=1;
            }
            if(i%3==0 && i%5==0){
                System.out.println(texto1+texto2);
                multiplos+=1;
            }
            if(!(i%3==0) && !(i%5==0)){
                System.out.println(i);
            }
            veces_num+=1;//Numero de veces que se hace un recorrido
        }
        System.out.println(" ");
        System.out.println("Multiplos en total " + multiplos);
        int resultado= veces_num - multiplos;

        System.out.println("Num de veces que se imprimio el numero en lugar del texto = " + resultado);
       
        String str_resultado = Integer.toString(resultado);

        return ""+str_resultado;
    }

    public static void main(String args[]){
        num= 1000;//se asigno un valor a la variable global
        String nombre="Gloria";//variable local
        Mensaje();
        System.out.println("Este es el resultado de la funcion de suma con parametros: "+suma(num,3040,14));    
        saludarUsuario(nombre);
        mostrarResultados();
      
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa un texto: ");
        String cadena1=teclado.nextLine();
        
        System.out.println("Ingresa otro texto: ");
        String cadena2=teclado.nextLine();
        multiplosporTexto(cadena1, cadena2);

    }
}
