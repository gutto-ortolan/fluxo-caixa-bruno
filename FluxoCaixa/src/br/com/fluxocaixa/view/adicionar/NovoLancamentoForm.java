package br.com.fluxocaixa.view.adicionar;

import br.com.fluxocaixa.dao.LancamentoDAO;
import br.com.fluxocaixa.dao.TipoLancamentoDAO;
import br.com.fluxocaixa.dao.TipoPagamentoDAO;
import br.com.fluxocaixa.model.Lancamento;
import br.com.fluxocaixa.model.TipoLancamento;
import br.com.fluxocaixa.model.TipoPagamento;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class NovoLancamentoForm extends javax.swing.JDialog {
    
    private final String defaultFormatDate = ("dd/MM/yyyy");
    
    private String acao;
    private TipoLancamentoDAO tipoLancamentoDAO = new TipoLancamentoDAO();
    private TipoPagamentoDAO tipoPagamentoDAO = new TipoPagamentoDAO();
    private LancamentoDAO lancamentoDAO = new LancamentoDAO();
    
    public NovoLancamentoForm(String acao) {
        initComponents();
        this.acao = acao;
        
        dtcLancamento.setDate(new Date());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lblCodigo = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblCusto = new javax.swing.JLabel();
        lblSituacao = new javax.swing.JLabel();
        txfCodigo = new javax.swing.JTextField();
        txfDescricao = new javax.swing.JTextField();
        txfValor = new javax.swing.JFormattedTextField();
        cbxMovimentacao = new javax.swing.JComboBox<>();
        bntGravar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbxTpLancamento = new javax.swing.JComboBox<>();
        cbxTpPagamento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dtcLancamento = new JDateChooser(defaultFormatDate, false);
        lblCusto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lblCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 0);
        getContentPane().add(lblCodigo, gridBagConstraints);

        lblDescricao.setText("Descrição*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        getContentPane().add(lblDescricao, gridBagConstraints);

        lblCusto.setText("Data*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblCusto, gridBagConstraints);

        lblSituacao.setText("Movimentação*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        getContentPane().add(lblSituacao, gridBagConstraints);

        txfCodigo.setEditable(false);
        txfCodigo.setColumns(5);
        txfCodigo.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(txfCodigo, gridBagConstraints);

        txfDescricao.setColumns(15);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 160;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfDescricao, gridBagConstraints);

        txfValor.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 56;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(txfValor, gridBagConstraints);

        cbxMovimentacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRADA", "SAÍDA" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        getContentPane().add(cbxMovimentacao, gridBagConstraints);

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
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
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
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 0, 0, 0);
        getContentPane().add(btnCancelar, gridBagConstraints);

        jLabel3.setText("Tipo Lançamento*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 4);
        getContentPane().add(jLabel3, gridBagConstraints);

        cbxTpLancamento.setModel(new DefaultComboBoxModel(tipoLancamentoDAO.buscar().toArray()));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxTpLancamento, gridBagConstraints);

        cbxTpPagamento.setModel(new DefaultComboBoxModel(tipoPagamentoDAO.buscar().toArray()));
        cbxTpPagamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTpPagamentoItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(cbxTpPagamento, gridBagConstraints);

        jLabel5.setText("Tipo Pagamento*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 4);
        getContentPane().add(jLabel5, gridBagConstraints);

        dtcLancamento.setName("dtProxima"); // NOI18N
        dtcLancamento.setPreferredSize(new java.awt.Dimension(150, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(dtcLancamento, gridBagConstraints);

        lblCusto1.setText("Valor*");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(lblCusto1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGravarActionPerformed
        if (txfDescricao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Os campos obrigatórios(*) devem ser preenchidos.", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Lancamento lancamento = new Lancamento(
                txfDescricao.getText().toUpperCase(),
                new Double(txfValor.getText()),
                cbxMovimentacao.getSelectedIndex() == 0 ? "ENTRADA" : "SAÍDA",
                ((TipoLancamento)cbxTpLancamento.getSelectedItem()).getIdTipoLancamento(),
                ((TipoPagamento)cbxTpPagamento.getSelectedItem()).getIdTipoPagamento(),
                dtcLancamento.getDate(),
                22 //usuario
        );
        
        
        
        
    }//GEN-LAST:event_bntGravarActionPerformed
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cbxTpPagamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTpPagamentoItemStateChanged
    }//GEN-LAST:event_cbxTpPagamentoItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGravar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxMovimentacao;
    private javax.swing.JComboBox<String> cbxTpLancamento;
    private javax.swing.JComboBox<String> cbxTpPagamento;
    com.toedter.calendar.JDateChooser dtcLancamento;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblCusto1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JTextField txfCodigo;
    private javax.swing.JTextField txfDescricao;
    private javax.swing.JFormattedTextField txfValor;
    // End of variables declaration//GEN-END:variables
}
