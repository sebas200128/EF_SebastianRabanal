/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Frm_Ejercicio5 extends javax.swing.JFrame {

    int[] numeros;
    int indice;

    /**
     * Creates new form Frm_Ejercicio5
     */
    public Frm_Ejercicio5() {
        initComponents();
        numeros = new int[4];
        indice = 0;
    }

    public void Agregar(int num) {
        if (indice < numeros.length) {
            numeros[indice] = num;
            indice++;
            txtIngresar.setText(null);
        } else {
            JOptionPane.showMessageDialog(null, "VECTOR LLENO");
        }
    }

    public void Mostrar() {
        for (int i = 0; i < indice; i++) {
            txaArea.append("POS [" + (i + 1) + "]-->" + numeros[i] + "\n");
        }
    }

    public int Buscar(int nbus) {
        int pos = -1;
        for (int i = 0; i < indice; i++) {
            if (numeros[i] == nbus) {
                pos = i;
            }
        }
        return pos;
    }

    public void Modificar(int pos, int vMod) {
        numeros[pos] = vMod;
        JOptionPane.showMessageDialog(null, "VALOR MODIFICADO");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtModificar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        txtIngresar = new javax.swing.JTextField();
        txtValorBuscado = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtModificar.setBorder(javax.swing.BorderFactory.createTitledBorder("MODIFICAR POR"));
        getContentPane().add(txtModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 60));

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 140, 50));

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 220, 50));

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 150, 50));

        txtIngresar.setBorder(javax.swing.BorderFactory.createTitledBorder("INGRESAR UN NUMERO"));
        getContentPane().add(txtIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 60));

        txtValorBuscado.setBorder(javax.swing.BorderFactory.createTitledBorder("VALOR BUSCADO"));
        getContentPane().add(txtValorBuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 60));

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 150, 50));

        txaArea.setColumns(20);
        txaArea.setRows(5);
        jScrollPane1.setViewportView(txaArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 340, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        String tex = txtIngresar.getText();
        if (tex.compareTo("") != 0) {
            int numeros = Integer.parseInt(txtIngresar.getText());
            Agregar(numeros);
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE UN NUMERO POR FAVOR");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // TODO add your handling code here:
        Mostrar();
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        int numB = Integer.parseInt(txtValorBuscado.getText());
        int pos = Buscar(numB);
        if (pos != -1) {
            JOptionPane.showMessageDialog(null, "NUMERO ENCONTRADO");
        } else {
            JOptionPane.showMessageDialog(null, "NUMERO NO ENCONTRADO");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int vMod = Integer.parseInt(txtModificar.getText());
        int numB = Integer.parseInt(txtValorBuscado.getText());
        int pos = Buscar(numB);
        if(pos!= -1){
            Modificar(pos, vMod);
        }else{
            JOptionPane.showMessageDialog(null, "NO SE PUEDE MODIFICAR");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Ejercicio5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaArea;
    private javax.swing.JTextField txtIngresar;
    private javax.swing.JTextField txtModificar;
    private javax.swing.JTextField txtValorBuscado;
    // End of variables declaration//GEN-END:variables
}
