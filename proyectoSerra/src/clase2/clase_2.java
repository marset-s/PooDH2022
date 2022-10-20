package clase2;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;


public class clase_2  {

    //ejericio 3

    static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB){
        return (unTextoA != unTextoB);
    }


    // ejercicio 2

    static Integer maximoDeDosNumeros(Integer a, Integer b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }

    static  Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC){
        Integer resultFuncion = maximoDeDosNumeros(unNumeroA, unNumeroB);
        if(resultFuncion>unNumeroC){
            return resultFuncion;
        }else {
            return unNumeroC;
        }
    }


    // ejercicio 1
    static boolean esDivisible(int n,int divisor){

        return (n % divisor == 0);
    }

    static boolean esPrimo(int num){

        for(int i = 2; i < num; i++ ){
            if(esDivisible(num, i)){
                return false;
            };

        }
        return true ;
    }

    public static void main(String[] args) {

// ejericio 1

 /*
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int numero = scanner.nextInt();

        System.out.println(esPrimo(numero));
    */

        // System.out.println(esDivisible(3, 2));

        //  System.out.println(maximoEntreTresNumeros(4, 5, 6));


        // ejercicio 2



        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Ingrese tres numeros entero: " );
        Integer numero1 = scanner1.nextInt();
        Integer numero2 = scanner1.nextInt();
        Integer numero3 = scanner1.nextInt();

        System.out.println("El número mayor es: " + maximoEntreTresNumeros(numero1, numero2, numero3));

//ejericio 3
        System.out.println(cadenasDeTextoDistintas("holas", "hola"));


    }

}


