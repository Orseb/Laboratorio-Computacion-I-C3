import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 1");

        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();

        System.out.println("El primer numero es: " + num1 + ", el segundo es: " + num2);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 2");

        input.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = input.nextLine();

        System.out.println("Su nombre es: " + nombre);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 3");

        System.out.print("Ingrese un numero entero: ");
        num1 = input.nextInt();

        System.out.println("El doble de este numero es: " + num1 * 2 + ", y el triple es: " + num1 * 3);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 4");

        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 5");

        System.out.print("Ingresa el valor del radio de la circunferencia: ");
        double radio = input.nextDouble();

        double longitud = 2 * Math.PI * radio;

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área de la circunferencia: " + area);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 6");

        System.out.print("Ingresa la velocidad en kilómetros por hora (Km/h): ");
        double velocidadKmH = input.nextDouble();

        double velocidadMs = velocidadKmH * 1000 / 3600;

        System.out.println("La velocidad en metros por segundo (m/s) es: " + velocidadMs);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 7");

        System.out.print("Ingresa la longitud del primer cateto: ");
        double cateto1 = input.nextDouble();

        System.out.print("Ingresa la longitud del segundo cateto: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 8");

        System.out.print("Ingresa el radio de la esfera: ");
        radio = input.nextDouble();

        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("El volumen de la esfera con radio " + radio + " es: " + volumen);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 9");

        System.out.print("Ingresa la longitud del lado a: ");
        double a = input.nextDouble();

        System.out.print("Ingresa la longitud del lado b: ");
        double b = input.nextDouble();

        System.out.print("Ingresa la longitud del lado c: ");
        double c = input.nextDouble();

        double p = (a + b + c) / 2.0;

        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("El área del triángulo es: " + area);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 10");

        System.out.print("Ingresa un número entero de 3 cifras: ");
        int numero = input.nextInt();

        if (numero >= 100 && numero <= 999) {

            int cifra1 = numero / 100;
            int cifra2 = (numero / 10) % 10;
            int cifra3 = numero % 10;

            System.out.println("Cifra 1: " + cifra1);
            System.out.println("Cifra 2: " + cifra2);
            System.out.println("Cifra 3: " + cifra3);
        } else {
            System.out.println("El número ingresado no tiene 3 cifras.");
        }


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 11");

        System.out.print("Ingrese un número entero de 5 cifras: ");

        numero = input.nextInt();
        String numeroStr = Integer.toString(numero);

        if (numeroStr.length() != 5) {
            System.out.println("El número no tiene 5 cifras.");
        } else {
            for (int i = 1; i <= 5; i++) {
                String subNumero = numeroStr.substring(0, i);
                System.out.println(subNumero);
            }
        }


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 12");

        System.out.print("Ingrese un número entero de 5 cifras: ");

        numero = input.nextInt();
        numeroStr = Integer.toString(numero);

        if (numeroStr.length() != 5) {
            System.out.println("El número no tiene 5 cifras.");
        } else {
            for (int i = 1; i <= 5; i++) {
                String subNumero = numeroStr.substring(5 - i, 5);
                System.out.println(subNumero);
            }
        }


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 13");

        System.out.print("Ingrese su dia de nacimiento: ");
        int dia = input.nextInt();

        System.out.print("Ingrese su mes de nacimiento: ");
        int mes = input.nextInt();

        System.out.print("Ingrese su anio de nacimiento: ");
        int anio = input.nextInt();

        int suma = dia + mes + anio;

        int sumaDigitos = 0;

        while (suma > 0) {

            int digito = suma % 10;

            sumaDigitos += digito;

            suma /= 10;
        }

        System.out.println("La suma de los dígitos es: " + sumaDigitos);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 14");

        System.out.print("Ingrese el precio por unidad (sin IVA): ");
        double precioPorUnidad = input.nextDouble();

        System.out.print("Ingrese el número de productos vendidos: ");
        int cantidadVendida = input.nextInt();

        System.out.print("Ingrese el porcentaje de IVA aplicado: ");
        double porcentajeIVA = input.nextDouble();

        double precioTotalSinIVA = precioPorUnidad * cantidadVendida;

        double montoIVA = (precioTotalSinIVA * porcentajeIVA) / 100.0;

        double precioVentaTotal = precioTotalSinIVA + montoIVA;

        System.out.println("Precio total sin IVA: " + precioTotalSinIVA);
        System.out.println("Monto del IVA: " + montoIVA);
        System.out.println("Precio de venta total (con IVA): " + precioVentaTotal);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 15");

        System.out.print("Ingrese el numero a manipular: ");
        int n = input.nextInt();

        System.out.print("Ingrese la cantidad de digitos a quitarle al numero: ");
        int m = input.nextInt();

        for (int i = 1; i<=m; i++) {
            n /= 10;
        }

        System.out.println("El numero resultante es: " + n);


        // ----------------------------------------------------------
        System.out.println("EJERCICIO 16");

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double temperaturaCelsius = input.nextDouble();

        double temperaturaReaumur = temperaturaCelsius * 0.8;

        double temperaturaKelvin = temperaturaCelsius + 273;

        System.out.println("Temperatura en grados Réaumur: " + temperaturaReaumur);
        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin);
    }
}