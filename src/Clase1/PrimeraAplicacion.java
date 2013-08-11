package Clase1;

public class PrimeraAplicacion {

    public static void main(String[] args) {

       PrimeraAplicacion.Ejercicio8(2);

    }

    public static void Ejercicio4() {

        int numeroX = 10, numeroY = 20;
        int numtemp = numeroX;

        numeroX = numeroY;
        numeroY = numtemp;

        System.out.println("X = " + numeroX);
        System.out.println("Y = " + numeroY);

    }

    public static void Ejercicio5() {

        int x = 5;
        int y = 8;
        int z = 6;
        int solucion = x + y - 3 * z;

        System.out.println(solucion);

    }

    public static void Ejercicio6() {

        double solucion1 = 7 * (15 + 1) * 2 % 2;
        boolean solucion2 = 0.0 / 0.0 == 0.0 / 0.0;
        boolean solucion3 = (!true && false);
        boolean solucion4 = ((3 * 4 >= 12) && (3.5 > 1 + 2f)) || (4 < 8);
        boolean solucion5 = !(true == false);
        boolean solucion6 = (!true == false);

        System.out.println(solucion1);
        System.out.println(solucion2);
        System.out.println(solucion3);
        System.out.println(solucion4);
        System.out.println(solucion5);
        System.out.println(solucion6);

    }

    public static void Ejercicio7(int edad) {

        double descuento = 0;


        if (edad < 18) {
            descuento = 0.30;
        } else if (edad > 60) {
            descuento = 0.15;

        }

        System.out.println(descuento);


    }

    public static void Ejercicio8(int mes) {

        int[] diasmes = {31,28,31,30,31,30,31,31,30,31,30,31};
    
        if (mes <= diasmes.length){
        
        System.out.println(diasmes[mes-1]);
        
        }
    }

    public static void Ejercicio9() {

        String animal1 = "perro";
        String animal2 = "gato";

        boolean compara = animal1.equals(animal2);


        System.out.println(compara);

    }

    public static void Ejercicio10() {

        int diaSemana = 6;
        String textoSemana = "";

        switch (diaSemana) {
            case 1:
                textoSemana = "Domingo";
                break;
            case 6:
                textoSemana = "viernes";
                break;
            default:
                textoSemana = "Otros";
                break;


        }

        System.out.println(textoSemana);

    }

    public static void Ejercicio11() {

        int contador = 0;

        while (contador < 10) {

            System.out.println(contador);
            ++contador;

        }

    }

    public static void Ejercicio12() {

        int contador = 0;

        do {
            System.out.println(contador);
            ++contador;
        } while (contador < 10);


    }

    public static void Ejercicio13() {

        int contador = 0;

        while (contador < 10) {

            System.out.println(contador);
            ++contador;

            if (contador == 6) {
                break;
            }

        }

    }

    public static void Ejercicio14() {

        int contador = 0;

        while (contador < 10) {

            System.out.println(contador);
            ++contador;

            if (contador == 6) {
                ++contador;
                continue;
            }

        }

    }

    public static void Ejercicio15() {

        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println(i);
        }

    }

    
  /*  
    
   public static void Ejercicio16() {

       
       int[] matrizNumeros = new int[5];
       matrizNumeros[0] = 100;
       matrizNumeros[1] = 200;
       matrizNumeros[2] = 300;
       matrizNumeros[3] = 400;
       matrizNumeros[4] = 500;
       
        for (int i = 0; i < matrizNumeros.length; i++) {
          System.out.println(matrizNumeros[i]);
           
       }

       
       int[][] matrizBiDimensional = new int[5][2] 
        
       matrizBiDimensional[0][0] = 11;
       matrizBiDimensional[0][1] = 1111;
       matrizBiDimensional[0][2] = 2222;
       
       for (int i = 0; i < matrizBiDimensional.length; i++) {
            for (int j = 0; j < matrizBiDimensional.length; j++) {
                System.out.println(matrizBiDimensional[i][j]);
            }
       }
       
        
    }  
    
    
   
   */
    
    public static void Ejercicio55() {
        float alturacentimetros = 1.68f;
        String sexo = "Femenino";
        Integer alturametros = 2;



    }
}