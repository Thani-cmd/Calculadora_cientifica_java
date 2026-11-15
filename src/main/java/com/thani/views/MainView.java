
package com.thani.views;

import com.thani.clases.Calculator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author tarde
 */
public class MainView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainView.class.getName());
    //Se haran los cálculos con este objeto
    private final Calculator calc = new Calculator();
    //Es true sí lo que hay en la pantalla es un resultado ya calculado
    private boolean mostrandoResultado = false;
    
    public MainView() {
        initComponents();
        configurar();
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

        //Lo que hace es conectar los botones y teclado
        private void configurar() {
        //Añade un oyente a cada boton
        btnC.addActionListener(e -> pulsar("C"));
        btnMod.addActionListener(e -> pulsar("Mod"));
        btnPorcentaje.addActionListener(e -> pulsar("%"));
        btnDividir.addActionListener(e -> pulsar("÷"));
        jButton6.addActionListener(e -> pulsar("7"));
        jButton5.addActionListener(e -> pulsar("8"));
        jButton7.addActionListener(e -> pulsar("9"));
        btnMultiplicar.addActionListener(e -> pulsar("x"));
        jButton9.addActionListener(e -> pulsar("4"));
        jButton16.addActionListener(e -> pulsar("5"));
        jButton12.addActionListener(e -> pulsar("6"));
        btnRestar.addActionListener(e -> pulsar("-"));
        jButton20.addActionListener(e -> pulsar("3"));
        jButton13.addActionListener(e -> pulsar("2"));
        jButton15.addActionListener(e -> pulsar("1"));
        btnSumar.addActionListener(e -> pulsar("+"));
        btn0.addActionListener(e -> pulsar("0"));
        btnComa.addActionListener(e -> pulsar(","));
        btnAns.addActionListener(e -> pulsar("Ans"));
        btnIgual.addActionListener(e -> pulsar("="));

        txtPantalla.setFocusable(false);
        
        txtPantalla.setText("");
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (Character.isDigit(c)) {
                    pulsar("" + c);
                } else if (c == ',' || c == '.') {
                    pulsar(",");
                } else if (c == '*' || c == 'x' || c == 'X') {
                    pulsar("x");
                } else if (c == '/') {
                    pulsar("÷");
                } else if (c == '+' || c == '-' || c == '%') {
                    pulsar("" + c);
                } else if (c == '\n') {
                    pulsar("=");
                } else if (c == '\b') {
                    retroceder();
                }
            }
        });
    }
    
    //Lo llaman los botones y teclados
    private void pulsar(String t){ 
        if (t.equals("=")) {
            igual();
            requestFocus();
            return;
        }
        
        String p = txtPantalla.getText();
        if (p.equals("Error")) {
            p = "";
        }
        
        boolean operador = t.equals("Mod") || t.equals("÷") || t.equals("x") || t.equals("-") || t.equals("+");
        if (mostrandoResultado && !operador && !t.equals("%")) {
            p = "";
        }
        mostrandoResultado = false;
        
        boolean trasOperador = p.endsWith(" ") && !p.endsWith("% ");
        String ultimo = p.substring(p.lastIndexOf(' ') + 1);//Ultimo trozo de texto, po rsi tiene coma o Ans
                switch (t) {
            case "C":
                p = "";
                calc.reset();
                break;

            case "Mod":
            case "÷":
            case "x":
            case "-":
            case "+":
                //si no acaba ya en operador
                if (!p.isEmpty() && !trasOperador) {
                    p = p.trim() + " " + t + " ";
                }
                break;

            case "%":
                //Solo detrás de un número o de Ans
                if (!p.isEmpty() && !p.endsWith(" ")) {
                    p = p + " % ";
                }
                break;

            case "Ans":
                //Solo al principio o tras un operador
                if (p.isEmpty() || trasOperador) {
                    p = p + "Ans";
                }
                break;

            case ",":
                if (p.isEmpty() || trasOperador) {
                    p = p + "0,";   //si le usuario le da , sin ningñun numero, se pone 0, por defecto
                } else if (!p.endsWith(" ") && !ultimo.contains(",") && !ultimo.equals("Ans")) {
                    p = p + ",";
                }
                break;

            default:
                //no se pegan detrás de Ans ni de %
                if (!p.endsWith("Ans") && !p.endsWith("% ")) {
                    p = p + t;
                }
        }
        txtPantalla.setText(p);
        requestFocus();
    }
    
    
    private void retroceder(){
    String p = txtPantalla.getText();
    if(mostrandoResultado || p.equals("Error")){
        p = "";
        mostrandoResultado = false;
    }else if (p.endsWith(" ")){//op o %
        p = p.replaceAll(" \\S+ $", "");
        } else if (p.endsWith("Ans")) {
            p = p.replaceAll("Ans$", "");
        } else {
            p = p.replaceAll(".$", "");
        }
        txtPantalla.setText(p);
    }
    
    private String formatear(double d){  
        //comprueba si es entero, elimina los decimales  y lo convierte e nentero
        if (d == Math.rint(d)) {
            return String.valueOf((int) d);
        }
        //Y si tiene decimales, cambia el punto por coma
        return String.valueOf(d).replace('.', ',');
    }
    
    //Cuando se pulse el =, esta función salta y recoge el texto de la pantalla y hace las excepciones
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
