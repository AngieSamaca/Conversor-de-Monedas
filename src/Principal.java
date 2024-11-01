import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args)  {
        int opcionCambio = 0;
        double valorFinal = 0;
        String menu = """
                \n*******************************************************
                Bienvenido/a al conversor de monedas :
                
                Selecciona la moneda que deseas convertir:
                
                1) - Dolar => Peso Colombiano
                2) - Peso Colombiano => Dolar
                3) - Euro => Peso Colombiano
                4) - Dirham de los Emiratos => Dolar
                5) - Libra Esterlina => Franco Suizo
                6) - Euro => Dolar Australiano
                7) - Peso Argentino => Peso Colombiano
                8) - Franco Suizo => Peso Chileno
                9) - Salir
                
                Elija una opcion valida:
                *******************************************************
                """;

        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();

        while (opcionCambio != 9) {
            try {
            System.out.println(menu);
            opcionCambio = lectura.nextInt();

                switch (opcionCambio) {
                    case 1:
                        System.out.println("Ingresa el valor de dolar que deseas convertir:");
                        double valor = lectura.nextDouble();
                        Moneda moneda = conversor.convertirMonedas("USD", "COP", valor);
                        valorFinal = moneda.getConversion_result();
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 2:
                        System.out.println("Ingresa el valor de peso colombiano que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("COP", "USD", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 3:
                        System.out.println("Ingresa el valor de euro que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("EUR", "COP", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 4:
                        System.out.println("Ingresa el valor de dirham de los Emiratos que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("AED", "USD", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 5:
                        System.out.println("Ingresa el valor de Libra Esterlina que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("GBP", "CHF", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 6:
                        System.out.println("Ingresa el valor de euro que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("EUR", "AUD", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 7:
                        System.out.println("Ingresa el valor de peso argentino que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("ARS", "COP", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 8:
                        System.out.println("Ingresa el valor de franco suizo que deseas convertir:");
                        valor = lectura.nextDouble();
                        moneda = conversor.convertirMonedas("CHF", "CLP", valor);
                        System.out.println("El valor " + valor + " " + moneda.getBase_code() + " corresponde al valor final de =>>> " +
                                valorFinal + " " + moneda.getTarget_code());
                        System.out.println("Tasa de cambio: " + moneda.getConversion_rate());
                        break;

                    case 9:
                        System.out.println("Saliendo del conversor de monedas.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta otra opcion.");
                }
            }catch (InputMismatchException e){
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                lectura.nextLine();
            }
        }
        lectura.close();
    }
    }

