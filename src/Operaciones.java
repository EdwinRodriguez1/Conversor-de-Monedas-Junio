public class Operaciones {

    public static void main(String[] args) {
        double dolar = 1000.0;
        double pesoArg = 897.66;
        double convertirDolarAPesoArg = dolar * pesoArg;
        System.out.println("" + dolar + " dolares equivalen a: " + convertirDolarAPesoArg + " pesos Argentinos");
        double convertirPesoArgADolar = dolar / pesoArg;
        System.out.println("" + dolar + " pesos Argentinos equivalen  a: " + convertirPesoArgADolar + " dolares");


    }
}