package RFC;
import java.util.Scanner;
public class ProyectoRFC {

    public static void main(String[] args) {
        /*
        PEGM9007151H0
        MELM830528RNA
        AYDR9911051H0
        CHUA0010313N1
        */
        Scanner leer=new Scanner(System.in);
        String rfc;
        System.out.print("Ingrese RFC: ");
        rfc=leer.nextLine();
        if(ValidarRFC(rfc.toUpperCase())){
            System.out.println("\033[42mEl RFC es valido");
        }else{
            System.out.println("\033[41mEl RFC no es valido");
        }
    }
    public static boolean ValidarRFC(String rfc){
        System.out.println(rfc);
        /*
        ^([A-Z]{4}) Primeras cuatro letras
        ([0-9]{2}) Año
        (0[1-9]|1[0-2]) Mes
        (0[1-9]|([1|2][0-9])|3[0|1]) Dia
        ([A-Z|0-9]{3}) Homoclave
        */
      return rfc.matches("^([A-Z]{4})([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|([1|2][0-9])|3[0|1])([A-Z|0-9]{3})$");
       //return rfc.matches("^([A-Z](A|E|I|O|U))([A-Z]{2})([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|([1|2][0-9])|3[0|1])([A-Z|0-9]{3})$");
    }
}
