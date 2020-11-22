package br.com.fluxocaixa.view.adicionar;

import br.com.fluxocaixa.dao.TipoLancamentoDAO;
import br.com.fluxocaixa.model.TipoLancamento;
import javax.swing.JOptionPane;

public class NovoTipoLancamentoForm extends javax.swing.JDialog {

    private TipoLancamentoDAO tipoLancamentoDAO = new TipoLancamentoDAO();
    
    private String acao;
    
    public NovoTipoLancamentoForm(String acao) {
        initComponents();
        
        this.acao = acao;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblCodigo = new javax.swing.JLabel();
        txfCodigo = new javax.swing.JTextField();
        lblSituacao = new javax.swing.JLabel();
        cbxMovimentacao = new javax.swing.JComboBox<>();
        lblDescricao = new javax.swing.JLabel();
        txfDescricao = new javax.swing.JTextField();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 50, 0, 0);
        getContentPane().add(lblCodigo, gridBagConstraints);

        txfCodigo.setEditable(false);
        txfCodigo.setColumns(5);
        txfCodigo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 80;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(92, 5, 0, 0);
        getContentPane().add(txfCodigo, gridBagConstraints);

        lblSituacao.setText("Movimentação*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(95, 122, 0, 0);
        getContentPane().add(lblSituacao, gridBagConstraints);

        cbxMovimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRADA", "SAÍDA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(92, 5, 0, 0);
        getContentPane().add(cbxMovimentacao, gridBagConstraints);

        lblDescricao.setText("Descrição*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 50, 0, 0);
        getContentPane().add(lblDescricao, gridBagConstraints);

        txfDescricao.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 365;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 0, 46);
        getContentPane().add(txfDescricao, gridBagConstraints);

        bntGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/oie_transparent (14).png"))); // NOI18N
        bntGravar.setText("Gravar");
        bntGravar.setMaximumSize(new java.awt.Dimension(99, 33));
        bntGravar.setMinimumSize(new java.awt.Dimension(99, 27));
        bntGravar.setPreferredSize(new java.awt.Dimension(105, 33));
        bntGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGravarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 47, 90, 0);
        getContentPane().add(bntGravar, gridBagConstraints);

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/oie_transparent (13).png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setMaximumSize(new java.awt.Dimension(99, 33));
        btnCancelar.setPreferredSize(new java.awt.Dimension(105, 33));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 10, 90, 0);
        getContentPane().add(btnCancelar, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if(txfDescricao.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        TipoLancamento tipoLancamento = new TipoLancamento(
                txfDescricao.getText().toUpperCase(),
                cbxMovimentacao.getSelectedIndex() == 0 ? "ENTRADA" : "SAÍDA"
        );
        
        if(acao.equals("I")){
            tipoLancamentoDAO.inserir(tipoLancamento);
        }else{
            tipoLancamento.setIdTipoLancamento(new Integer(txfCodigo.getText()));
            tipoLancamentoDAO.atualizar(tipoLancamento);
        }
        
        
        dispose();
        
    }//GEN-LAST:event_bntGravarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxMovimentacao;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfDescricao;
    // End of variables declaration//GEN-END:variables

    public void alterarTipoLancamento(TipoLancamento obj) {
        txfCodigo.setText(String.valueOf(obj.getIdTipoLancamento()));
        txfDescricao.setText(obj.getDescricao());
        cbxMovimentacao.setSelectedIndex(obj.getMovimentacao().equals("ENTRADA") ? 0 : 1);
        
    }
    
}
