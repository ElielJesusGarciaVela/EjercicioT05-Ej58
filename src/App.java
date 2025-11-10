public class App {
    public static void main(String[] args) throws Exception {
        boolean correcto = false;
        long numero = 0;
        while (!correcto){
            try{
                numero = Long.parseLong(System.console().readLine("Por favor, introduzca un número entero positivo: "));
                correcto = (numero >= 10)?true:false;
                if (!correcto)
                    System.out.println("Introduzca un número entero positivo.");
            } catch (NumberFormatException ex){
                System.out.println("Introduzca un número valido.");
            } catch (Exception e){
                System.out.println("Ha ocurrido un error inesperado");
            }
        }
        long aux1 = numero * 10 + 1;
        long volteado = 0;
        double contador = 0;
        double suma = 0;
        while (aux1 > 0){
            volteado = (volteado * 10)+(aux1 % 10);
            aux1 /=10;
        }
        while (volteado > 1){
            aux1 = (aux1 * 10)+(volteado % 10);
            suma += (volteado % 10); 
            volteado /=10;
            contador++;
        }
        System.out.println("La media de sus dígitos es "+(suma/contador));
    }
}