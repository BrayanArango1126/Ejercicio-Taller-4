package ejercicio_15;
import javax.swing.*;
 class Ejercicio_18 {

    /*
     Realizar un algoritmo que calcule el salarioa pagarde un empleado según los siguientes parámetros: 
     •Si gana menos de 700.000, descuento de pensión =-2%, descuento de salud =-4% y más Aux. de transporte= +11%.
     •Si gana entre 741.000 y 999.999, descuento de pensión =-4%, descuento de salud =-6% y más Aux. de transporte= +9%.
     •Si gana más 1.000.000 y menos 1.800.000, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-6% y más Aux. de transporte= +9%.
     •Si gana más de 1.800.000 y menos de 2.500.000, descuento por pensión es -6%, descuento de seguro de vida 5%, descuento de salud =-8% y más Aux. de transporte= +8%.
     •Si gana más de 2.500.000, descuento por pensión es -8%, descuento de seguro de vida 6%, descuento de salud =-10% y más Aux. de transporte= +9%.
     */
    public static void main(String[] args) {
        /*DATOS DE ENTRADA: Salario
          DATOS DE SALIDA: descuento de pension, descuento de salid, auxilio de transporte, salario total+ auxilio de transporte
        */
        
        String salar;
        double salario;
        double pension;
        double descuentoPension;
        double salud;
        double descuentoSalud;
        double auxTransp;
        double aumentoAuxTransp;
        double totalSalarioMasAuxTrans;
        double segVida;
        double descuentoSegVida;
        salar = JOptionPane.showInputDialog("Por favor escriba su salario: ");
        salario = Double.parseDouble(salar);
        
        if(salario < 700000){
            pension = 2;
            salud = 4;
            auxTransp = 11;
            descuentoPension = (salario * pension)/100;
            descuentoSalud = (salario * salud)/100;
            aumentoAuxTransp = (salario * auxTransp)/100;
            totalSalarioMasAuxTrans = (salario-descuentoPension-descuentoSalud+aumentoAuxTransp); 
            JOptionPane.showMessageDialog(null, "El descuento de la pensión es de: " + pension + " %"+ " y su descuento total es de: " + descuentoPension + " pesos", "Pensión", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "El descuento de la salud es de: " + salud + " %" + " y su descuento total es de: " + descuentoSalud + " pesos", "Salud", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "El auxilio de transporte es de: " + auxTransp + " y su aumento en el salario es de: " + aumentoAuxTransp + " pesos", "Auxilio de transporte", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null, "El salario final con descuentos y mas el auxilio de transporte es de: " + totalSalarioMasAuxTrans + " pesos", "SALARIO FINAL MAS AUXILIO DE TRANSPORTE", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            if(salario > 741000 && salario < 999999){
                pension = 4;
                salud = 6;
                auxTransp = 9;
                descuentoPension = (salario * pension)/100;
                descuentoSalud = (salario * salud)/100;
                aumentoAuxTransp = (salario * auxTransp)/100;
                totalSalarioMasAuxTrans = (salario-descuentoPension-descuentoSalud+aumentoAuxTransp);
                JOptionPane.showMessageDialog(null, "El descuento de la pensión es de: " + pension + " %" + " y su descuento total es de: " + descuentoPension + " pesos", "Pensión", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento de la salud es de: " + salud + " %" + " y su descuento total es de: " + descuentoSalud + " pesos", "Salud", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El auxilio de transporte es de: " + auxTransp + " y su aumento en el salario es de: " + aumentoAuxTransp + " pesos", "Auxilio de transporte", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El salario final con descuentos y mas el auxilio de transporte es de: " + totalSalarioMasAuxTrans + " pesos", "SALARIO FINAL MAS AUXILIO DE TRANSPORTE", JOptionPane.INFORMATION_MESSAGE);
            }
            if(salario > 1000000 && salario < 1800000){
                pension = 6;
                salud = 6;
                auxTransp = 9;
                segVida = 5;
                descuentoPension = (salario * pension)/100;
                descuentoSalud = (salario * salud)/100;
                aumentoAuxTransp = (salario * auxTransp)/100;
                descuentoSegVida = (salario * segVida)/100;
                totalSalarioMasAuxTrans = (salario-descuentoPension-descuentoSalud-descuentoSegVida+aumentoAuxTransp);
                JOptionPane.showMessageDialog(null, "El descuento de la pensión es de: " + pension + " %" + " y su descuento total es de: " + descuentoPension + " pesos", "Pensión", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento de la salud es de: " + salud + " %" + " y su descuento total es de: " + descuentoSalud + " pesos", "Salud", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento del seguro de vida es de: " + segVida + " y su descuento total es de: " + descuentoSegVida + " pesos", "Seguro de vida", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El auxilio de transporte es de: " + auxTransp + " y su aumento en el salario es de: " + aumentoAuxTransp + " pesos", "Auxilio de transporte", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El salario final con descuentos y mas el auxilio de transporte es de: " + totalSalarioMasAuxTrans + " pesos", "SALARIO FINAL MAS AUXILIO DE TRANSPORTE", JOptionPane.INFORMATION_MESSAGE);
            }   
            if(salario > 1800000 && salario < 2500000){
                pension = 6;
                salud = 8;
                auxTransp = 8;
                segVida = 5;
                descuentoPension = (salario * pension)/100;
                descuentoSalud = (salario * salud)/100;
                aumentoAuxTransp = (salario * auxTransp)/100;
                descuentoSegVida = (salario * segVida)/100;
                totalSalarioMasAuxTrans = (salario-descuentoPension-descuentoSalud-descuentoSegVida+aumentoAuxTransp);
                JOptionPane.showMessageDialog(null, "El descuento de la pensión es de: " + pension + " %" + " y su descuento total es de: " + descuentoPension + " pesos", "Pensión", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento de la salud es de: " + salud + " %" + " y su descuento total es de: " + descuentoSalud + " pesos", "Salud", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento del seguro de vida es de: " + segVida + " y su descuento total es de: " + descuentoSegVida + " pesos", "Seguro de vida", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El auxilio de transporte es de: " + auxTransp + " y su aumento en el salario es de: " + aumentoAuxTransp + " pesos", "Auxilio de transporte", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El salario final con descuentos y mas el auxilio de transporte es de: " + totalSalarioMasAuxTrans + " pesos", "SALARIO FINAL MAS AUXILIO DE TRANSPORTE", JOptionPane.INFORMATION_MESSAGE);
            }
            if(salario > 2500000){
                pension = 8;
                salud = 10;
                auxTransp = 9;
                segVida = 6;
                descuentoPension = (salario * pension)/100;
                descuentoSalud = (salario * salud)/100;
                aumentoAuxTransp = (salario * auxTransp)/100;
                descuentoSegVida = (salario * segVida)/100;
                totalSalarioMasAuxTrans = (salario-descuentoPension-descuentoSalud-descuentoSegVida+aumentoAuxTransp);
                JOptionPane.showMessageDialog(null, "El descuento de la pensión es de: " + pension + " %" + " y su descuento total es de: " + descuentoPension + " pesos", "Pensión", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento de la salud es de: " + salud + " %" + " y su descuento total es de: " + descuentoSalud + " pesos", "Salud", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El descuento del seguro de vida es de: " + segVida + " y su descuento total es de: " + descuentoSegVida + " pesos", "Seguro de vida", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El auxilio de transporte es de: " + auxTransp + " y su aumento en el salario es de: " + aumentoAuxTransp + " pesos", "Auxilio de transporte", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "El salario final con descuentos y mas el auxilio de transporte es de: " + totalSalarioMasAuxTrans + " pesos", "SALARIO FINAL MAS AUXILIO DE TRANSPORTE", JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
                
    }
    
}
