package br.com.fluxocaixa.view;

import br.com.fluxocaixa.dao.LancamentoDAO;
import br.com.fluxocaixa.model.Lancamento;
import br.com.fluxocaixa.model.Usuario;
import br.com.fluxocaixa.view.adicionar.NovoLancamentoForm;
import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class LancamentoForm extends javax.swing.JInternalFrame {

    private DefaultTableModel tabelaModelo;
    private Integer sizeTab = 1145;

    private static LancamentoForm testeframe;
    
    private LancamentoDAO lancamentoDAO = new LancamentoDAO();
    
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    private final String defaultFormatDate = ("dd/MM/yyyy");

    public static LancamentoForm getInstancia() {
        testeframe = new LancamentoForm();
        return testeframe;
    }

    public LancamentoForm() {
        initComponents();
        setResizable(false);
        tabela.setModel((new DefaultTableModel(null, new Object[]{"Código", "Descrição", "Valor", "Data", "Movimentação"})));
        tamanho_colunas();

        inicio.setDate(getLimiteInicial(new Date(), Calendar.MONTH));
        fim.setDate(new Date());
        
        
        readJTable();
    }

    public void readJTable() {
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);

        for (Lancamento lancamento : lancamentoDAO.buscarData(inicio.getDate(), fim.getDate())) {
            tabelaModelo.addRow(new Object[]{
                lancamento.getIdLancamento(),
                lancamento.getDescricao(),
                lancamento.getValor(),
                sdf.format(lancamento.getDtLancamento()),
                lancamento.getMovimentacao()
            });
        }
    }
    
    public Date getLimiteInicial(Date date, int field) {

        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(date);
        gc.set(GregorianCalendar.HOUR_OF_DAY, 0);
        gc.clear(GregorianCalendar.MINUTE);
        gc.clear(GregorianCalendar.SECOND);
        gc.clear(GregorianCalendar.MILLISECOND);
        
        switch (field) {
            case GregorianCalendar.YEAR:
                gc.set(GregorianCalendar.MONTH, 0);
            case GregorianCalendar.MONTH:
                gc.set(GregorianCalendar.DAY_OF_MONTH, 1);
        }
        return gc.getTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        bntNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        fim = new JDateChooser(defaultFormatDate, false);
        inicio = new JDateChooser(defaultFormatDate, false);
        bntNovo1 = new javax.swing.JButton();
        btnExcluir1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Lançamento");

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

        fim.setName("dtProxima"); // NOI18N
        fim.setPreferredSize(new java.awt.Dimension(150, 25));

        inicio.setName("dtProxima"); // NOI18N
        inicio.setPreferredSize(new java.awt.Dimension(150, 25));

        bntNovo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/pesquisar.png"))); // NOI18N
        bntNovo1.setText("Pesquisar");
        bntNovo1.setMaximumSize(new java.awt.Dimension(95, 27));
        bntNovo1.setMinimumSize(new java.awt.Dimension(95, 27));
        bntNovo1.setPreferredSize(new java.awt.Dimension(95, 27));
        bntNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovo1ActionPerformed(evt);
            }
        });

        btnExcluir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/fluxocaixa/imagens/ajuda.png"))); // NOI18N
        btnExcluir1.setText("Gerar Saldo");
        btnExcluir1.setMaximumSize(new java.awt.Dimension(95, 27));
        btnExcluir1.setMinimumSize(new java.awt.Dimension(95, 27));
        btnExcluir1.setPreferredSize(new java.awt.Dimension(95, 27));
        btnExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 826, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(bntNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntNovo1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntNovo1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovoActionPerformed
        NovoLancamentoForm janelaNovo = new NovoLancamentoForm("I");
        janelaNovo.setTitle("Lançamento");
        janelaNovo.setModal(true);
        janelaNovo.setLocationRelativeTo(null);
        janelaNovo.setVisible(true);
        
        readJTable();

    }//GEN-LAST:event_bntNovoActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (tabela.getSelectedRow() != -1) {
            Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

            if (JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
                Lancamento obj = lancamentoDAO.buscarId(Integer.parseInt(tabela.getValueAt(tabela.getSelectedRow(), 0).toString()));
                lancamentoDAO.deletar(obj);

                DefaultTableModel atividadeExluir = (DefaultTableModel) tabela.getModel();
                atividadeExluir.removeRow(tabela.getSelectedRow());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma linha para exluir.", "Exlcusão de dados", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void bntNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovo1ActionPerformed
        tabelaModelo = (DefaultTableModel) tabela.getModel();
        tabelaModelo.setNumRows(0);
        
        List<Lancamento> lista = lancamentoDAO.buscarData(inicio.getDate(), fim.getDate());

        for (Lancamento lancamento : lista) {
            tabelaModelo.addRow(new Object[]{
                lancamento.getIdLancamento(),
                lancamento.getDescricao(),
                lancamento.getValor(),
                sdf.format(lancamento.getDtLancamento()),
                lancamento.getMovimentacao()
            });
        }
    }//GEN-LAST:event_bntNovo1ActionPerformed

    private void btnExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluir1ActionPerformed
        
        List<Lancamento> lista = lancamentoDAO.buscarData(inicio.getDate(), fim.getDate());
        
        Double saldo = 0.0;
        
        for (Lancamento lancamento : lista) {
            if(lancamento.getMovimentacao().startsWith("E")){
                saldo += lancamento.getValor();
            }else{
                saldo += (-lancamento.getValor());
            }
        }
        
        JOptionPane.showMessageDialog(null, "Seu saldo do período é de: \nR$" + saldo, "Saldo do período", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_btnExcluir1ActionPerformed

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
        modeloDaColuna.getColumn(2).setCellRenderer(rendererDireita);
        modeloDaColuna.getColumn(3).setCellRenderer(rendererCentro);
        modeloDaColuna.getColumn(4).setCellRenderer(rendererCentro);

        modeloDaColuna.getColumn(0).setMaxWidth((sizeTab * 10) / 100);
        modeloDaColuna.getColumn(1).setMaxWidth((sizeTab * 30) / 100);
        modeloDaColuna.getColumn(2).setMaxWidth((sizeTab * 20) / 100);
        modeloDaColuna.getColumn(3).setMaxWidth((sizeTab * 20) / 100);
        modeloDaColuna.getColumn(4).setMaxWidth((sizeTab * 20) / 100);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNovo;
    private javax.swing.JButton bntNovo1;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExcluir1;
    com.toedter.calendar.JDateChooser fim;
    com.toedter.calendar.JDateChooser inicio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
