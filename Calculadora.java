import java.util.Scanner;

public class Calculadora {

    public static float sumar(float x, float y) {
        return x + y;
    }

    public static float restar(float x, float y) {
        return x - y;
    }

    public static float multiplicar(float x, float y) {
        return x * y;
    }

    public  static float divir(float x, float y) {
        return x / y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        float x, y;
        boolean exit = true;
        System.out.println("Bienvenido a la calculdora Selecciona una opcion: ");
        while (exit) {
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa un numero");
                    x = sc.nextFloat();
                    System.out.println("Ingresa un numero");
                    y = sc.nextFloat();
                    System.out.println(Calculadora.sumar(x, y));
                    break;
                case 2:
                    System.out.println("Ingresa un numero");
                    x = sc.nextFloat();
                    System.out.println("Ingresa un numero");
                    y = sc.nextFloat();
                    System.out.println(Calculadora.restar(x, y));
                    break;
                case 3:
                    System.out.println("Ingresa un numero");
                    x = sc.nextFloat();
                    System.out.println("Ingresa un numero");
                    y = sc.nextFloat();
                    System.out.println(Calculadora.multiplicar(x, y));
                    break;
                case 4:
                    System.out.println("Ingresa un numero");
                    x = sc.nextFloat();
                    System.out.println("Ingresa un numero");
                    y = sc.nextFloat();
                    if (y == 0) {
                        System.out.println("No se puede dividir entre 0!");
                        break;
                    }
                    System.out.println(Calculadora.divir(x, y));
                    break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.println("Selecciona una opcion valida");
                    break;

            }
        }

    }
}
