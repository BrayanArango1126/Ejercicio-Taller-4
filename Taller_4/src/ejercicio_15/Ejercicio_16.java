package ejercicio_15;
import javax.swing.*;
public class Ejercicio_16 {

    /*
    Dada las horas trabajadas por un empleado determinar cuánto gana semanalmente y mensualmente, 
    si el trabajador debe trabajar mínimo 38h semanales y un máximo de 56h.  Se debe pedir la cantidad de horas 
    trabajadas y verificar que esté dentro del rango permitido, también se debe pedir el precio de la hora.  
    Imprimir la cantidad de horas trabajadas y el pago
     */
    public static void main(String[] args) {
        /*DATOS DE ENTRADA: Horas laboradas, precio de la hora
          DATOS DE SALIDA: Cuanto gana semanalmente, mensualmente, cantidad de horas laboradas
        */
        
        String cantHor;
        int cantidadHoras;
        String valHor;
        double valorHora;
        
        cantHor = JOptionPane.showInputDialog("Por favor ingrese la cantidad de horas: ");
        cantidadHoras = Integer.parseInt(cantHor);
        while(cantidadHoras<38 || cantidadHoras>56){
            cantHor = JOptionPane.showInputDialog("Por favor ingrese una cantidad valida de horas ");
            cantidadHoras = Integer.parseInt(cantHor);
        }
        valHor = JOptionPane.showInputDialog("Por favor ingrese el valor de la hora: ");
        valorHora = Double.parseDouble(valHor);
        
        JOptionPane.showMessageDialog(null, "La cantidad de horas laboradas son: "+ cantidadHoras + " Horas", "Cantidad de horas laboradas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El salario semanal es de " + (valorHora*cantidadHoras) + " pesos", "Salario semanalmente", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El salario mensual es: " + (cantidadHoras*4*valorHora) + " pesos", "Salario mensual", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
