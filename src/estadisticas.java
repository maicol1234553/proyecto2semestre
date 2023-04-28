
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MAICOL
 */
public class estadisticas extends javax.swing.JFrame {

    /**
     * Creates new form estadisticas
     */
    public estadisticas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    boolean bandera = false;// determinar cuando graficar y no
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_correctas = new javax.swing.JTextField();
        txt_incorrectas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("preguntas correctas e incorrectas");

        jLabel2.setText("correctas");

        jLabel3.setText("incorrectas ");

        txt_correctas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_correctasActionPerformed(evt);
            }
        });

        jButton1.setText("GRAFICAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_correctas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_incorrectas, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                                .addComponent(jButton1)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_correctas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_incorrectas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_correctasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_correctasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_correctasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bandera=true;
        repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estadisticas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt_correctas;
    private javax.swing.JTextField txt_incorrectas;
    // End of variables declaration//GEN-END:variables
public int mayorvalor(int correctas,int incorrectas){
    if (correctas>incorrectas){
        return correctas; // se llama la funcio de correctas para saber cual es la grafica mayor
    }
    else {
        return incorrectas;
    
        
        
    } 
}
public void paint (Graphics g){
    super.paint (g);//para dibujar en el jframe
    if(bandera==true){ //se ejecuta el boton
        
        String String_correctas = txt_correctas.getText(); //guardando los valores 
        String String_incorrectas = txt_incorrectas.getText();
        
        int int_correctas=Integer.parseInt(String_correctas); //conviertiendo 
        int int_incorrectas=Integer.parseInt(String_incorrectas);
        
        double promedio=int_correctas/5.0;
        double promedio2=int_incorrectas/5.0 ; 
        
        double porcentaje=promedio*100;
        double porcentaje2=promedio2*100;
        
        
        int valor_mayor= mayorvalor(int_correctas,int_incorrectas);//guarda los elementos y los manda a al metodo
        
        int largo_correctas=int_correctas*400/valor_mayor; //calcular el largo de la barra 
        int largo_incorrectas=int_incorrectas*400/valor_mayor;
        
        g.setColor(new Color(255,0,0)); // color rojo 
        g.fillRect(100,100,largo_correctas,40);//creacion del rectangulo
        g.drawString("correctas",10,125);//poner el texto
        
        g.setColor(new Color(0,130,0));
        g.fillRect(100,150,largo_incorrectas,40);
        g.drawString("incorrectas",10,175);
         
        
        if (porcentaje >=30 && porcentaje<=40){
        JOptionPane.showMessageDialog(null,"segun el grafico y el porcentaje de   preguntas acertadas del "+porcentaje+"% se puede concluir que el niño presenta leves sintomas de TDHA");
    }
        if (porcentaje >0 && porcentaje<30){
        JOptionPane.showMessageDialog(null,"segun el grafico y el porcentaje de preguntas acertadas del "+porcentaje+"% se puede concluir que el niño presenta  sintomas de TDHA");
    }
        if (porcentaje >40 && porcentaje<=75){
        JOptionPane.showMessageDialog(null,"segun el grafico y el porcentaje de preguntas acertadas del "+porcentaje+"% se puede concluir que el niño presenta una buena concentracion pero puede mejorar");
    }
         if (porcentaje >75 && porcentaje<=100){
        JOptionPane.showMessageDialog(null,"segun el grafico y el porcentaje de preguntas acertadas del "+porcentaje+"% se puede concluir que el niño no presenta TDHA");
    }
         
       
        
    }
    
   
}
           

}


