package br.com.fluxocaixa.view;

import br.com.fluxocaixa.dao.TipoLancamentoDAO;
import br.com.fluxocaixa.model.TipoLancamento;
import br.com.fluxocaixa.view.adicionar.NovoTipoLancamentoForm;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class TipoLancamentoForm extends javax.swing.JInternalFrame {

    private DefaultTableModel tabelaModelo;
    private Integer sizeTab = 1145;

    private static TipoLancamentoForm testeframe;
    
    private TipoLancamentoDAO tipoLancamentoDAO = new TipoLancamentoDAO();

    public static TipoLancamentoForm getInstancia() {
        testeframe = new TipoLancamentoForm();
        return testeframe;
    }

    public TipoLancamentoForm() {
        initComponents();
        setResizable(false);
        tabela.setModel((new DefaultTableModel(null, new Object[]{"Código", "Descrição", "Movimentação"})));
        tamanho_colunas();
        readJTable();
    }

    public void readJTable() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);
        
        for (TipoLancamento tipoLancamento : tipoLancamentoDAO.buscar()) {
            tabelaModelo.addRow(new Object[]{
                tipoLancamento.getIdTipoLancamento(),
                tipoLancamento.getDescricao(),
                tipoLancamento.getMovimentacao()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        bntNovo = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Tipo Lançamento");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.setRowHeight(25);
        tabela.setRowMargin(5);
        tabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabela);

        bntNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/novo.png"))); // NOI18N
        bntNovo.setText("Novo");
        bntNovo.setMaximumSize(new java.awt.Dimension(95, 27));
        bntNovo.setMinimumSize(new java.awt.Dimension(95, 27));
        bntNovo.setPreferredSize(new java.awt.Dimension(95, 27));
        bntNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovoActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(95, 27));
        btnAlterar.setMinimumSize(new java.awt.Dimension(95, 27));
        btnAlterar.setPreferredSize(new java.awt.Dimension(95, 27));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setMaximumSize(new java.awt.Dimension(95, 27));
        btnExcluir.setMinimumSize(new java.awt.Dimension(95, 27));
        btnExcluir.setPreferredSize(new java.awt.Dimension(95, 27));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bntNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        NovoTipoLancamentoForm janelaNovo = new NovoTipoLancamentoForm("I");
        janelaNovo.setTitle("Tipo Lançamento");
        janelaNovo.setModal(true);
        janelaNovo.setLocationRelativeTo(null);
        janelaNovo.setVisible(true);

        readJTable();

    }//GEN-LAST:event_bntNovoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (tabela.getSelectedRow() != -1) {
            TipoLancamento obj = tipoLancamentoDAO.buscarId(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));

            NovoTipoLancamentoForm janela = new NovoTipoLancamentoForm("A");
            janela.setTitle("Tipo Lançamento");
            janela.setModal(true);
            janela.setLocationRelativeTo(null);
            janela.alterarTipoLancamento(obj);
            janela.setVisible(true);
            
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para alterar.", "Alteração de dados", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != -1) {
            Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                TipoLancamento obj = tipoLancamentoDAO.buscarId(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                tipoLancamentoDAO.deletar(obj);

                DefaultTableModel atividadeExluir = (DefaultTableModel) tabela.getModel();
                atividadeExluir.removeRow(tabela.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para exluir.", "Exlcusão de dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tamanho_colunas() {
        DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
        rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
        rendererDireita.setHorizontalAlignment(SwingConstants.RIGHT);

        DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
        rendererEsquerda.setHorizontalAlignment(SwingConstants.LEFT);

        JTableHeader header = tabela.getTableHeader();
        DefaultTableCellRenderer centralizado = (DefaultTableCellRenderer) header.getDefaultRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        header.setPreferredSize(new Dimension(0, 20));   // define a largura do cabeçalho
        TableColumnModel modeloDaColuna = tabela.getColumnModel();

        modeloDaColuna.getColumn(0).setCellRenderer(rendererDireita);
        modeloDaColuna.getColumn(1).setCellRenderer(rendererEsquerda);
        modeloDaColuna.getColumn(2).setCellRenderer(rendererCentro);

        modeloDaColuna.getColumn(0).setMaxWidth((sizeTab * 10) / 100);
        modeloDaColuna.getColumn(1).setMaxWidth((sizeTab * 50) / 100);
        modeloDaColuna.getColumn(2).setMaxWidth((sizeTab * 40) / 100);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
