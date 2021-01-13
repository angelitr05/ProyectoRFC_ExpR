package RFC;
import java.util.Scanner;
public class ProyectoRFC {

    public static void main(String[] args) {
        /*
        RFC´s validos
        PEGM9007151H0
        MELM830528RNA
        AYDR9911051H0
        CHUA0010313N1
        */
        Scanner leer=new Scanner(System.in);
        String rfc;
        System.out.print("Ingrese RFC: ");
        //lee la linea ingresada que va validar 
        rfc=leer.nextLine();
        //En este if al mismo tiempo de comparar si es verdad se envia la cadena al método el cual retornara si es valida
        //la cadena se envia en mayusculas, si el usuario no la ingreso en mayusculas esta se vuelve en mayuscula
        if(ValidarRFC(rfc.toUpperCase())){
            //imprime si es valido
            System.out.println("\033[42mEl RFC es valido");
        }else{
            //imprime si no es valido
            System.out.println("\033[41mEl RFC no es valido");
        }
    }
    //Metodo estatico que acepta una cadena y retorna un boolean
    public static boolean ValidarRFC(String rfc){
        System.out.println(rfc);
        /*
        Formulación de la Expresión regular
        ^([A-Z]{4}) Primeras cuatro letras
        ([0-9]{2}) Año
        (0[1-9]|1[0-2]) Mes
        (0[1-9]|([1|2][0-9])|3[0|1]) Dia
        ([A-Z|0-9]{3}) Homoclave
        */
        //Compara la cadena con la expresión regular con el metodo matches y retornara verdad si es aceptada  false si no lo es
      return rfc.matches("^([A-Z]{4})([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|([1|2][0-9])|3[0|1])([A-Z|0-9]{3})$");
        
        //Esta expresión regular comentada fue la primera que elaboramos pero aceptaba RFC que que empezaran con una letra de la A-Z y despues tenia que ir una vocal AEIOU
        //pero no todos los rfc cumplen con esta regla ya que las primeras dos letras del RFC son las dos primeras de tu apellido paterno y hay apellidos que no llevan vocal en seguida
        //por ejemplo Chula y Ayala
       //return rfc.matches("^([A-Z](A|E|I|O|U))([A-Z]{2})([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|([1|2][0-9])|3[0|1])([A-Z|0-9]{3})$");
    }
}
