package br.com.fluxocaixa.view;

import br.com.fluxocaixa.util.GerenteDeJanelas;

public class TelaPrincipal extends javax.swing.JFrame {
    
    GerenteDeJanelas gerenteDeJanelas;

    public TelaPrincipal() {
        initComponents();
        this.gerenteDeJanelas = new GerenteDeJanelas(jDesktopPane1);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmLancamento = new javax.swing.JMenuItem();
        jmTpLancamento = new javax.swing.JMenuItem();
        jmTpPagamento = new javax.swing.JMenuItem();
        jmUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fluxo Caixa");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jDesktopPane1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1445, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        jMenu1.setText("Menu");

        jmLancamento.setText("Lançamento");
        jmLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLancamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jmLancamento);

        jmTpLancamento.setText("Tipo Lançamento");
        jmTpLancamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTpLancamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jmTpLancamento);

        jmTpPagamento.setText("Tipo Pagamento");
        jmTpPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTpPagamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jmTpPagamento);

        jmUsuario.setText("Usuário");
        jmUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmUsuarioActionPerformed(evt);
            }
        });
        jMenu1.add(jmUsuario);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLancamentoActionPerformed
        gerenteDeJanelas.abrirJanelas(LancamentoForm.getInstancia());
    }//GEN-LAST:event_jmLancamentoActionPerformed

    private void jmTpLancamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTpLancamentoActionPerformed
        gerenteDeJanelas.abrirJanelas(TipoLancamentoForm.getInstancia());
    }//GEN-LAST:event_jmTpLancamentoActionPerformed

    private void jmUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmUsuarioActionPerformed
        gerenteDeJanelas.abrirJanelas(UsuarioForm.getInstancia());
    }//GEN-LAST:event_jmUsuarioActionPerformed

    private void jmTpPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTpPagamentoActionPerformed
        gerenteDeJanelas.abrirJanelas(TipoPagamentoForm.getInstancia());
    }//GEN-LAST:event_jmTpPagamentoActionPerformed

    private void jDesktopPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDesktopPane1MouseReleased
    }//GEN-LAST:event_jDesktopPane1MouseReleased

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmLancamento;
    private javax.swing.JMenuItem jmTpLancamento;
    private javax.swing.JMenuItem jmTpPagamento;
    private javax.swing.JMenuItem jmUsuario;
    // End of variables declaration//GEN-END:variables
}
