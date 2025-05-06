import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /* primer ejercico
        System.out.println("Ingresa un numero para saber si es par o inpar");

        int num = scanner.nextInt();

        if(num %2==0){
            System.out.println("El numero es par");
        }
        else {
            System.out.println("El numero es impar");
        }
        */

        /* segundo ejercio
           System.out.println("Ingrese la media");
        double media = scanner.nextDouble();
        if(media >= 7)
        {
            System.out.println("Aprobado con media de: "+ media);
        }
        else if(media >=5 && media <=6.9)
        {
            System.out.println("Recuperacion con : "+ media);
        }
        else if(media <= 5) {
            System.out.println("Reprobado: "+ media);
        }
        else {
            System.out.println("Error");
        }
         */

        /* ejercicio 3
         import java.util.Scanner;


                    String contrasenaCorrecta = "123456";
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Ingrese la contraseña: ");
                    String intentoContrasena = scanner.nextLine();

                    scanner.close();

                    if (intentoContrasena.equals(contrasenaCorrecta)) {
                        System.out.println("¡Acceso permitido!");
                    } else {
                        System.out.println("¡Acceso denegado!");
                    }

        * */

        /* ejercicio 4
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El número mayor es " + num1 + ".");
        } else if (num2 > num1) {
            System.out.println("El número mayor es " + num2 + ".");
        } else {
            System.out.println("Los números son iguales.");
        }

        scanner.close();
    }
         */

        /* ejercicio 5
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        if (valorCompra >= 100.0) {
            double descuento = valorCompra * 0.10;
            double valorConDescuento = valorCompra - descuento;
            System.out.printf("Descuento del 10%% aplicado.\nNuevo valor: $%.2f\n", valorConDescuento);
        } else {
            System.out.printf("Descuento no aplicado.\nValor total: $%.2f\n", valorCompra);
        }

        scanner.close();
        * */


        /* ejercicio 6
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String dia = scanner.nextLine();

        scanner.close();

        if (dia.equals("lunes") || dia.equals("martes") ||
            dia.equals("miércoles") || dia.equals("jueves") ||
            dia.equals("viernes")) {
            System.out.println(dia + " es un día hábil.");
        } else {
            System.out.println(dia + " no es un día hábil.");
        }
        * */

















    }
}
