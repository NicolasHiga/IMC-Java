/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package nicolastakemoto.br.edu.fateclins.imc.view;

import nicolastakemoto.br.edu.fateclins.imc.model.Imc;
import java.awt.Color;

/**
 *
 * @author nicolastakemoto
 */
public class FrmIMC extends javax.swing.JFrame {

    /**
     * Creates new form FrmIMC
     */
    public FrmIMC() {
        initComponents();
        //Define o título do programa:
        setTitle("Cálculo do IMC - índice de Massa Corporal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        pnlCampos = new javax.swing.JPanel();
        lblAltura = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        lblPeso = new javax.swing.JLabel();
        lblMC = new javax.swing.JLabel();
        txtIMC = new javax.swing.JTextField();
        lblTabelaIMC = new javax.swing.JLabel();
        pnlResultado = new javax.swing.JPanel();
        lblTituloResultado = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        pnlResultado1 = new javax.swing.JPanel();
        lblTituloRecomendacao = new javax.swing.JLabel();
        lblRecomendacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlTitulo.setBackground(new java.awt.Color(0, 153, 204));

        lblTitulo.setBackground(new java.awt.Color(0, 153, 204));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Cálculo do IMC - Índice de Massa Corporal");
        lblTitulo.setOpaque(true);

        javax.swing.GroupLayout pnlTituloLayout = new javax.swing.GroupLayout(pnlTitulo);
        pnlTitulo.setLayout(pnlTituloLayout);
        pnlTituloLayout.setHorizontalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTituloLayout.setVerticalGroup(
            pnlTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTituloLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCampos.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblAltura.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAltura.setText("Altura:");

        txtAltura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtPeso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPeso.setText("Peso:");

        lblMC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMC.setText("IMC:");

        txtIMC.setEditable(false);
        txtIMC.setBackground(new java.awt.Color(218, 217, 217));
        txtIMC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblTabelaIMC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nicolastakemoto/br/edu/fateclins/imc/res/TabelaIMC.png"))); // NOI18N

        javax.swing.GroupLayout pnlCamposLayout = new javax.swing.GroupLayout(pnlCampos);
        pnlCampos.setLayout(pnlCamposLayout);
        pnlCamposLayout.setHorizontalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAltura)
                    .addComponent(lblPeso, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMC, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                    .addComponent(txtIMC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPeso)
                    .addComponent(txtAltura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTabelaIMC)
                .addGap(24, 24, 24))
        );
        pnlCamposLayout.setVerticalGroup(
            pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamposLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTabelaIMC)
                    .addGroup(pnlCamposLayout.createSequentialGroup()
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAltura)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPeso))
                        .addGap(36, 36, 36)
                        .addGroup(pnlCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMC)
                            .addComponent(txtIMC, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pnlResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloResultado.setText("Resultado:");

        lblResultado.setBackground(new java.awt.Color(204, 204, 204));
        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setToolTipText("");
        lblResultado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblResultado.setOpaque(true);

        javax.swing.GroupLayout pnlResultadoLayout = new javax.swing.GroupLayout(pnlResultado);
        pnlResultado.setLayout(pnlResultadoLayout);
        pnlResultadoLayout.setHorizontalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloResultado)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlResultadoLayout.setVerticalGroup(
            pnlResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTituloResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlResultado1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblTituloRecomendacao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTituloRecomendacao.setText("Recomendação:");

        lblRecomendacao.setBackground(new java.awt.Color(204, 204, 204));
        lblRecomendacao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRecomendacao.setForeground(new java.awt.Color(255, 255, 255));
        lblRecomendacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecomendacao.setToolTipText("");
        lblRecomendacao.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lblRecomendacao.setOpaque(true);

        javax.swing.GroupLayout pnlResultado1Layout = new javax.swing.GroupLayout(pnlResultado1);
        pnlResultado1.setLayout(pnlResultado1Layout);
        pnlResultado1Layout.setHorizontalGroup(
            pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloRecomendacao)
                    .addComponent(lblRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlResultado1Layout.setVerticalGroup(
            pnlResultado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultado1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTituloRecomendacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblRecomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlResultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(pnlCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlResultado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Ação do botão Calcular
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        
        //Classe objeto
        Imc imc = new Imc();
        
        //Captura os dados do formulário (altura e peso)
        imc.setAltura(Float.parseFloat(txtAltura.getText()));
        imc.setPeso(Float.parseFloat(txtPeso.getText()));
        
        //Calcula o IMC
        imc.setImc(imc.calcularImc(imc.getAltura(), imc.getPeso()));
        //Converte o IMC para String e imprime
        txtIMC.setText(String.valueOf(imc.getImc()));
        //Formata o IMC para apenas uma casa decimal e substitui a vírgula pelo ponto
        String imcString = String.format("%.1f", imc.getImc()).replace("," , ".");
       
        //Chama a função de Resultado
        lblResultado.setText("O resultado do seu IMC é igual a " + imcString + " , portanto você está na faixa de \"" + CalcularResultado(imc.getImc()) + "\"");
        //Chama a função de Recomendação
        lblRecomendacao.setText(CalcularRecomendacao(imc.getImc()));
    }//GEN-LAST:event_btnCalcularActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIMC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FrmIMC().setVisible(true);
            }
        });
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel lblAltura;
    private javax.swing.JLabel lblMC;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRecomendacao;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTabelaIMC;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloRecomendacao;
    private javax.swing.JLabel lblTituloResultado;
    private javax.swing.JPanel pnlCampos;
    private javax.swing.JPanel pnlResultado;
    private javax.swing.JPanel pnlResultado1;
    private javax.swing.JPanel pnlTitulo;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtIMC;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
    
    //A cor de foreground e o opaco já estão configurados pelas propriedades do label
    //É necessário apenas definir a cor do background
    private String CalcularResultado(double valorIMC){
        String resultadoIMC = "";
        
        if(valorIMC < 19){
            resultadoIMC = "Abaixo do Peso Normal";
            lblResultado.setBackground(new Color(183,205,38));
        } else if((19.1 <= valorIMC) && (valorIMC <= 24.9)) {
            resultadoIMC = "Peso Normal";
            lblResultado.setBackground(new Color(243,183,3));
        } else if((25 <= valorIMC) && (valorIMC <= 29.9)) {
            resultadoIMC = "Sobrepeso";
            lblResultado.setBackground(new Color(243,146,12));
        } else if((30 <= valorIMC) && (valorIMC <= 34.9)) {
            resultadoIMC = "Obesidade Grau I";
            lblResultado.setBackground(new Color(236,88,29));
        } else if ((35 <= valorIMC) && (valorIMC <= 39.9)) {
            resultadoIMC = "Obesidade Grau II";
            lblResultado.setBackground(new Color(233,28,29));
        } else {
            resultadoIMC = "Obesidade Mórbida";
            lblResultado.setBackground(new Color(198,24,28));
        }
        
        return resultadoIMC;
    }
    
    private String CalcularRecomendacao(double valorIMC){
        String recomendacao = "";
        
        if(valorIMC < 25){
            recomendacao = "Não precisa fazer regime.";
            lblRecomendacao.setBackground(new Color(0,128,0));
        } else {
            recomendacao = "Sim, é necessário fazer regime.";
            lblRecomendacao.setBackground(new Color(255,0,0));
        }
        
        return recomendacao;
    } 
}
