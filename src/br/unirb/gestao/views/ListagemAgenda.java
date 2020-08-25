/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirb.gestao.views;

import br.unirb.gestao.dao.AgendaDao;
import br.unirb.gestao.dao.ColaboradorDao;
import br.unirb.modelo.Agenda;
import br.unirb.modelo.Colaborador;
import br.unirb.gestao.views.ListagemColaborador;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class ListagemAgenda extends javax.swing.JPanel {
 private CardLayout ag;
    private int idAg;

    public ListagemAgenda() {
        initComponents();
        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.ag = (CardLayout) this.getLayout();
        this.ag.show(this, "painelListagem");
    }
     private void popularTabela() {
        AgendaDao ag = new AgendaDao();
        List<Agenda> listaTarefa;

        try {
            listaTarefa = ag.listarTarefas();

            DefaultTableModel model = (DefaultTableModel) tblTarefas.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaTarefa.size(); i++) {
                Agenda a = listaTarefa.get(i);
                lista.add(new Object[]{a.getCodColAge(), a.getCodEquAge(),
                    a.getDatComAge(),a.getDatCriAge(), a.getDesAge(),
                    a.getIdCol(),a.getIdEqu(),a.getTitAge()});
            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter as tarefas do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      private void limparTabela() {
        ((DefaultTableModel) tblTarefas.getModel()).setNumRows(0);
        tblTarefas.updateUI();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelListagem = new javax.swing.JPanel();
        painelEdicao = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTarefas = new javax.swing.JTable();

        setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(painelListagem, "card2");

        tblTarefas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTarefas);

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        add(painelEdicao, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblTarefas;
    // End of variables declaration//GEN-END:variables
}
