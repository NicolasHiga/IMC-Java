/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nicolastakemoto.br.edu.fateclins.imc;

import java.util.Scanner;
import nicolastakemoto.br.edu.fateclins.imc.model.Imc;
import javax.swing.JOptionPane;

/**
 *
 * @author nicolastakemoto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void ocultmain(String[] args) {
        //Declarar variáveis de altura (a) e peso (p)
        float a , p;
        
        //Criar o objeto imc da classe Imc a partir do construtor padrão.
        Imc imc = new Imc();
        
        //Definir a altura e o peso.
        imc.setAltura(1.70f);
        imc.setPeso(80.0f);
        
        //Captura para as variáveis altura e o peso.
        a = imc.getAltura();
        p = imc.getPeso();        
        
        //Acesso ao objeto imc e realizar o cálculo do IMC.
        imc.calcularImc(a, p);
        
        //Criar uma String para converter o valor do imc com duas casas decimais.        
        String imcString = String.format("%.2f", imc.getImc());
        
        //Definir para o imc o novo valor com duas casas decimais.
        imc.setImc(Double.parseDouble(imcString.replace("," , ".")));
        
        // Imprimir a saída do Imc.
        System.out.println("Resultado IMC: \n" + imc.toString());
        JOptionPane.showMessageDialog(null, 
                                      imc.toString(),
                                      "Resultado:", 
                                      JOptionPane.INFORMATION_MESSAGE);
        
        //----------------------------------------------------------------------
        //Teste do imc dinâmico em ambiente gráfico
        Scanner entrada;
        
        Imc imc2 = new Imc();
        
        entrada = new Scanner(JOptionPane.showInputDialog(null, "Altura:", "Entre com a altura:", JOptionPane.INFORMATION_MESSAGE));
        imc2.setAltura(entrada.nextFloat());
        
        entrada = new Scanner(JOptionPane.showInputDialog(null, "Peso:", "Entre com o peso:", JOptionPane.INFORMATION_MESSAGE));
        imc2.setPeso(entrada.nextFloat());
        
        //Acesso ao objeto imc e realizar o calculo do Imc
        imc2.calcularImc(imc2.getAltura(), imc2.getPeso());
        
        //Criar uma String para converter o valor do imc com duas casas decimais
        imcString = String.format("%.2f", imc2.getImc());
        
        //Definir para o imc o novo valor com duas casas decimais
        imc2.setImc(Double.parseDouble(imcString.replace("," , ".")));
        
        //Imprimir a saída do Imc2.
        System.out.println("Resultado IMC2: \n" + imc2.toString());
        JOptionPane.showMessageDialog(null, 
                                      imc2.toString(),
                                      "Resultado:", 
                                      JOptionPane.INFORMATION_MESSAGE);
    }
    
}
