package ejercicio_15;

import javax.swing.*;
public class Ejercicio_15 {
    /*Realizar un programa que calcule el valor a pagar por algunos galones de gasolina 
    si sabemos que cada litro de gasolina vale 9.500.
    Imprimir la cantidad de galones, precio por galón, cantidad de litros y precio a pagar.
    */
    public static void main(String[] args) {
        /*DATOS DE ENTRADA:Cantidad galones gasolina
        DATOS DE SALIDA: Precio por galon, cantidad de litros, precio a pagar
        */
        
        double valorGalon;
        double CantiGalones;
        double cantLitrosPorGalon;
        cantLitrosPorGalon = 3.78;
        valorGalon = 9500;
        String cantGal;
        cantGal = JOptionPane.showInputDialog("Por favor escriba la cantidad de galones a calcular: ");
        
        CantiGalones = Double.parseDouble(cantGal);
        
        
        JOptionPane.showMessageDialog(null, CantiGalones,"Cantidad de Galones", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El precio por galón de gasolina es de: " + valorGalon, "Precio por Galón", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "La cantidad de litros en total por la cantidad de " + CantiGalones+ " son: " + (CantiGalones*cantLitrosPorGalon)+ " Litros", "Cantidad de Litros ", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "La cantidad total a pagar es: " + (CantiGalones*valorGalon), "Precio a pagar ", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
