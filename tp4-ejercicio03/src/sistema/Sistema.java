/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;
import modelo.Cuenta;
/**
 *
 * @author Diego Raul Fernandez
 */

/*Escriba un programa de prueba que cree una cuenta con tasa de interés anual del 5,00%,
saldo de $ 1.000 e id 1234 a nombre de Florencia. Deposite $ 30, $ 40 y $ 50 en la
cuenta y retire $ 5, $ 4 y $ 2 de la cuenta. Imprima un resumen de cuenta que muestre el
nombre del titular de la cuenta, la tasa de interés, el saldo y todas las transacciones.
*/
public class Sistema {
    public static void main(String agrs[]){
        Cuenta unaCuenta = new Cuenta(1234, "Florencia", 5000);
        unaCuenta.settasaInteresAnual(5.0);
        unaCuenta.depositar(30.0);
        unaCuenta.depositar(40.0);
        unaCuenta.depositar(50.0);
        unaCuenta.retirar(5.0);
        unaCuenta.retirar(4.0);
        unaCuenta.retirar(2);
        
        System.out.println("Resumen de cuenta: \n" + unaCuenta.toString());
    }
}
