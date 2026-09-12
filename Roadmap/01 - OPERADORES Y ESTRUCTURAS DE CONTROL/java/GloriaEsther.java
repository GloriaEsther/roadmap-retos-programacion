public class GloriaEsther {
    public static void main(String[] args) {
        /*Operadores de asignacion
        = ,+=,-=,--(-1),++(+1)
        sirven para asignar valores */
        int valor=0;//se utilizo =

        //Operadores aritmeticos
        // +(suma),-(resta),*(multiplicacion),/(division),%(modulo/residuo de una division)
        int a=10,b=20,suma;
        suma = a + b;
        System.out.println("Suma: 10 + 20 = "+ suma);
        //Tambien se puede imprimir asi:
        System.out.println("Suma: 10 + 20 = "+ (a+b));

        /*Operadores de comparacion
          ==(igual a),<=(menor o igual que),<(menor que),>(mayor que),>= (mayor o igual que),!=(diferente o igual que)
        Condicional if-else sirve para comparar condiciones "si se cumple esta condicion (lo que esta dentro del if) pasa esto,
         caso contrario ocurre esto"
        */
        int edad=20;
        if(edad >= 18){
            System.out.println("Ya eres mayor de edad, tu edad es: "+edad);
        }else{
            System.out.println("No eres mayor de edad, tu edad es: "+edad);
        }

        /*Operador ?
        es un if resumido en una linea ((condicion)?valor si es verdadero: valor si es falso) */
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Esto es el resultado del operador ?");   
        System.out.println(mensaje);

        System.out.println("");
        /*Operadores logicos
          &&(and), ||(or), !(not)
          sirven para comparar valores y devuelven un booleano dependiendo del resultado de la comparacion.
        */
       //Bucle while, sirve para repetir una accion en especifico mientras se cumpla una condicion
         //Este es un ejemplo de utilizar un operdor logico y un bucle while
        int x=10,y=15;
        System.out.println("Lo siguiente es resultado del bucle while "); 

        while( x<=20||y<=20){
            System.out.println("Este es el valor de x: "+x);  
            System.out.println("Este es el valor de y: "+y);
            System.out.println(" "); 
            x++;
            y++;
        }

        /*Java dispone de un mecanismo de capturar (catch) ciertos tipos de errores que solo pueden ser detectados en tiempo de ejecución del programa.
        Y para esto se utiliza try-catch
        */
        System.out.println("Esto es una excepcion");
        try {
            int[] numeros = {1, 2};
            System.out.println(numeros[5]); // Lanza ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrio un error: "+e.getMessage());
        } finally {
            System.out.println("Bloque finally siempre se ejecuta");
        }

        /* DIFICULTAD EXTRA (opcional):
            Crea un programa que imprima por consola todos los números comprendidos
            entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3.
        */
        System.out.println("Esto es el resultado del ejercicio extra");
        //Bucle for, al igual que while se repite una accion mientras se cumpla una condicion
        for(int i=10;i<=55;i++){//(contador;condicion;iteracion)
            if (i == 16){  
                continue;//sirve para saltarse una iteracion dependiendo la condicion, en este caso, si el num es 16 se salta este salto y continua con el siguiente.
            }else if(i % 3 == 0){
                continue;   
            }
            System.out.println(i);
        }
       
    }
    
}