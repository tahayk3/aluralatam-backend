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

        /*  ejercicio 7
        System.out.print("Ingrese el valor del préstamo: ");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("El valor " + valor + " está dentro del intervalo permitido para el préstamo.");
        } else {
            System.out.println("El valor " + valor + " no está dentro del intervalo permitido para el préstamo.");
        }

        scanner.close();
        * */


        /* ejercicio 8
        System.out.print("Ingrese el primer lado: ");
        int lado1 = scanner.nextInt();

        System.out.print("Ingrese el segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.print("Ingrese el tercer lado: ");
        int lado3 = scanner.nextInt();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }

        scanner.close();
        * */

        /* ejercicio 9
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad del donante: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el peso del donante (en kg): ");
        double peso = scanner.nextDouble();

        boolean edadValida = edad >= 18 && edad <= 65;
        boolean pesoValido = peso > 50;

        if (edadValida && pesoValido) {
            System.out.println("El donante es compatible para donar sangre.");
        } else {
            System.out.println("El donante no es compatible. Motivo:");
            if (!edadValida) {
                System.out.println("- Debe tener entre 18 y 65 años.");
            }
            if (!pesoValido) {
                System.out.println("- Debe pesar más de 50 kg.");
            }
        }
        scanner.close();
        * */


        /*ejercicio final
        Scanner scanner = new Scanner(System.in);
        int codigoCorrecto = 2023;
        int nivelPermisoMinimo = 1;
        int nivelPermisoMaximo = 3;

        System.out.print("Ingrese el código de acceso: ");
        int codigoDigitado = scanner.nextInt();

        System.out.print("Ingrese el nivel de permiso: ");
        int nivelPermiso = scanner.nextInt();

        boolean codigoValido = codigoDigitado == codigoCorrecto;
        boolean permisoValido = nivelPermiso >= nivelPermisoMinimo && nivelPermiso <= nivelPermisoMaximo;

        if (codigoValido && permisoValido) {
            System.out.println("Acceso permitido. ¡Bienvenido al sistema!");
        } else {
            System.out.println("Acceso denegado. Motivo(s):");
            if (!codigoValido) {
                System.out.println("- Código de acceso incorrecto.");
            }
            if (!permisoValido) {
                System.out.println("- Nivel de permiso inválido.");
            }
        }

        * */
    }
}
