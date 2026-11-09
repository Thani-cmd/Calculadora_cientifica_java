
package com.thani.views;

import com.thani.clases.Calculator;

/**
 *
 * @author tarde
 */
public class MainView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainView.class.getName());
    private final Calculator calc = new Calculator();
    private boolean mostrandoResultado = false;
    
    public MainView() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPantalla = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnC = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnPorcentaje = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPantalla.setEditable(false);
        txtPantalla.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPantalla.addActionListener(this::txtPantallaActionPerformed);
        getContentPane().add(txtPantalla, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(5, 4, 5, 5));

        btnC.setBackground(new java.awt.Color(204, 204, 204));
        btnC.setText("C");
        btnC.addActionListener(this::btnCActionPerformed);
        jPanel1.add(btnC);

        btnMod.setBackground(new java.awt.Color(204, 204, 204));
        btnMod.setText("Mod");
        jPanel1.add(btnMod);

        btnPorcentaje.setBackground(new java.awt.Color(204, 204, 204));
        btnPorcentaje.setText("%");
        jPanel1.add(btnPorcentaje);

        btnDividir.setBackground(new java.awt.Color(204, 204, 204));
        btnDividir.setText("÷");
        btnDividir.addActionListener(this::btnDividirActionPerformed);
        jPanel1.add(btnDividir);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setText("7");
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jPanel1.add(jButton6);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setText("8");
        jPanel1.add(jButton5);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setText("9");
        jPanel1.add(jButton7);

        btnMultiplicar.setBackground(new java.awt.Color(204, 204, 204));
        btnMultiplicar.setText("x");
        jPanel1.add(btnMultiplicar);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setText("4");
        jPanel1.add(jButton9);

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setText("5");
        jPanel1.add(jButton16);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setText("6");
        jPanel1.add(jButton12);

        btnRestar.setBackground(new java.awt.Color(204, 204, 204));
        btnRestar.setText("-");
        jPanel1.add(btnRestar);

        jButton20.setBackground(new java.awt.Color(204, 204, 204));
        jButton20.setText("3");
        jPanel1.add(jButton20);

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setText("2");
        jPanel1.add(jButton13);

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setText("1");
        jPanel1.add(jButton15);

        btnSumar.setBackground(new java.awt.Color(204, 204, 204));
        btnSumar.setText("+");
        jPanel1.add(btnSumar);

        btn0.setBackground(new java.awt.Color(204, 204, 204));
        btn0.setText("0");
        jPanel1.add(btn0);

        btnComa.setBackground(new java.awt.Color(204, 204, 204));
        btnComa.setText(",");
        jPanel1.add(btnComa);

        btnAns.setBackground(new java.awt.Color(204, 204, 204));
        btnAns.setText("Ans");
        jPanel1.add(btnAns);

        btnIgual.setBackground(new java.awt.Color(204, 204, 204));
        btnIgual.setText("=");
        jPanel1.add(btnIgual);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPantallaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDividirActionPerformed

    

    
    private String formatear(double d){  
        //comprueba si es entero, elimina los decimales  y lo convierte e nentero
        if (d == Math.rint(d)) {
            return String.valueOf((int) d);
        }
        //Y si tiene decimales, cambia el punto por coma
        return String.valueOf(d).replace('.', ',');
    }
    
    //Cuando se aprete el =, esta función salta y recoge el texto de la pantalla y hace excepciones
    private void igual(){
        String pantalla = txtPantalla.getText();
        if(pantalla.isEmpty()){
        return;
        }
        try{
            double r = calc.calcular(pantalla);
            if(Double.isNaN(r) || Double.isInfinite(r)){
                txtPantalla.setText("Error");
            } else {
                txtPantalla.setText(formatear(r));
            }
        
        }catch(Exception e){
            txtPantalla.setText("Error");
        }
        mostrandoResultado = true;
        
    }
    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPorcentaje;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables
}
