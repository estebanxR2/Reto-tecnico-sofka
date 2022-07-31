package spacecraft;

/**
 * Creacion de naves espaciales atraves de POO
 * @autor Jair Rincon  -  jairesrival2@gmail.com
 */

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args Array de Strings que debe aparecer obligatoriamente como argumento del método main
     */
    public static void main(String[] args) {
        /* se crea una variable x entero para utilizar en el while si x es menor que 4 se cumplira otro ciclo hasta que este sea mayor que la condicion */
        boolean x = true;
        int contador= 1;
        /* variable booleana para crear el sistema infinito */

        /* input: lectura de seleccion del usuario y es esta variable es de tipo char */
        Scanner input= new Scanner(System.in);


        while (x) {
                /*
                 + se impprime las opciones para le seleccion del usuario
                 */
            System.out.println("//NOTA: Solo puedes crear 4 naves espaciales//\n");
            System.out.println("Selecione un tipo para la " + contador + " nave espacial:");
            System.out.print("""
                        a.VEHICULOS LANZADERA\s
                        b.NAVE ESPACIAL NO TRIPULADA
                        c.NAVE ESPACIAL TRIPULADA
                        (a/b/c) R/:""");
            char option1 = input.next().charAt(0);
            /* switch case: forma sencilla de enviar la ejecución a diferentes partes del código segun la seleccion del usuario*/
            shuttle_vehicles shuttle_vehicles1 = null;
            switch (option1) {
                case 'a' -> {/* si el usuario copia c entraria a una nave espacial vehiculo lanzadera*/
                    System.out.print("\n/////VEHICULOS LANZADERA/////");
                    System.out.print("\nIngrese el modelo del vehiculo lanzadera: ");
                    String model = input.next();
                    System.out.print("\nIngrese el tipo de gasolina: ");
                    String fuel = input.next();
                    System.out.print("\nIngrese el peso(#): ");
                    int weight = input.nextInt();
                    shuttle_vehicles1 = new shuttle_vehicles(model, fuel, weight);
                    System.out.println(shuttle_vehicles1.show());
                    shuttle_vehicles1.full();
                }
                /* si el usuario copia b entraria a crear una nave espacial no tripulada*/
                case 'b' -> {
                    System.out.print("\n/////NAVE ESPACIAL NO TRIPULADA/////");
                    System.out.print("\nIngrese el modelo de la nave espacial no tripulada: ");
                    String model = input.next();
                    System.out.print("\nIngrese el tipo de gasolina: ");
                    String fuel = input.next();
                    System.out.print("\nIngrese los planetas que puede llegar esta nave espacial: ");
                    String planets = input.next();
                    unmanned_spacecraft unmanned_spacecraft = new unmanned_spacecraft(model, fuel, false, planets);
                    System.out.println(unmanned_spacecraft.show());
                }
                /* si el usuario copia c entraria a crear una nave espacial tripulada*/
                case 'c' -> {
                    System.out.print("\n/////NAVE ESPACIAL TRIPULADA/////");
                    System.out.print("\nIngrese el modelo de la nave espacial tripulada: ");
                    String model = input.next();
                    System.out.print("\nIngrese el tipo de gasolina: ");
                    String fuel = input.next();
                    manned_spacecraft manned_spacecraft = new manned_spacecraft(model, fuel, true);
                    System.out.println(manned_spacecraft.show());
                }
                default -> System.out.print("Ha introducido una opción incorrecta\n");
            }

                 /*
              si es usiario escoge y : continua el ciclo creando otras 4 naves espaciales
                  si el usuario escoge n se terminaria el ciclo
                */
            System.out.print("\n¿Quieres continuar? (y/n): \s\n");
            char option2 = input.next().charAt(0);
            /*input.close();  */
            switch (option2) {
                case 'y' -> x = true;
                case 'n' -> x = false;
                default -> System.out.print("Ha introducido una opción incorrecta\n");
            }
            /* se agrea el +1 al contador de naves */
            contador++;

            if (contador == 4) {
                System.out.print("\n¿Quieres crear otras 4 naves espaciales? (y/n): \s\n");
                char option3 = input.next().charAt(0);
                switch (option2) {
                    case 'y' -> {
                        x = true;
                        contador = 1;
                    }
                    case 'n' -> {
                        x = false;
                        contador = 4;
                    }
                    default -> System.out.print("Ha introducido una opción incorrecta\n");
                }

            }
        }
    }
}