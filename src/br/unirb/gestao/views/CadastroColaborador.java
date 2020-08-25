package br.unirb.gestao.views;

import br.unirb.gestao.dao.ColaboradorDao;
import br.unirb.modelo.Colaborador;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroColaborador extends javax.swing.JPanel {

    public CadastroColaborador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCadastroCliente = new javax.swing.JLabel();
        lbNomCol = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cpNomCol = new javax.swing.JTextField();
        labelEnderecoLocalizacao = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        labelEndereco = new javax.swing.JLabel();
        cpEndCol = new javax.swing.JTextField();
        labelBairro = new javax.swing.JLabel();
        cpBaiCol = new javax.swing.JTextField();
        labelCep = new javax.swing.JLabel();
        cpCepCol = new javax.swing.JFormattedTextField();
        labelComplemento = new javax.swing.JLabel();
        cpComCol = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        labelTituloContato = new javax.swing.JLabel();
        lbCelularCol = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        btnSalvar = new javax.swing.JButton();
        cpCelCol = new javax.swing.JFormattedTextField();
        lbNumCol = new javax.swing.JLabel();
        lbCpfCol = new javax.swing.JLabel();
        cpCpfCol = new javax.swing.JFormattedTextField();
        lbDddCol = new javax.swing.JLabel();
        labelTituloContato1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbEquCol = new javax.swing.JLabel();
        comboLogin = new javax.swing.JComboBox<>();
        cpDddCol = new javax.swing.JFormattedTextField();
        cpNumCol = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpUsuCol = new javax.swing.JTextField();
        cpSenCol = new javax.swing.JTextField();
        cpEquCol = new javax.swing.JFormattedTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroCliente.setText("Cadastro");

        lbNomCol.setText("Nome:");

        cpNomCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpNomColActionPerformed(evt);
            }
        });

        labelEnderecoLocalizacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelEnderecoLocalizacao.setText("Endereço e localização");

        labelEndereco.setText("Endereço:");

        labelBairro.setText("Bairro:");

        labelCep.setText("CEP:");

        try {
            cpCepCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        labelComplemento.setText("Complemento:");

        cpComCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpComColActionPerformed(evt);
            }
        });

        labelTituloContato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloContato.setText("Contato");

        lbCelularCol.setText("Celular:");

        btnSalvar.setText("Confirmar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        try {
            cpCelCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbNumCol.setText("Número:");

        lbCpfCol.setText("CPF:");

        try {
            cpCpfCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbDddCol.setText("DDD:");

        labelTituloContato1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloContato1.setText("Login");

        lbEquCol.setText("Código da Equipe:");

        comboLogin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Colaborador" }));
        comboLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboLoginActionPerformed(evt);
            }
        });

        try {
            cpDddCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cpNumCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel1.setText("Nome de Usuário:");

        jLabel2.setText("Senha:");

        try {
            cpEquCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpEquCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEquColActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbNomCol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpNomCol))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelCadastroCliente)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCpfCol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpCpfCol, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbEquCol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpEquCol)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpEndCol))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbNumCol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNumCol, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelComplemento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpComCol, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(labelEnderecoLocalizacao)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbDddCol)
                                                .addGap(1, 1, 1)
                                                .addComponent(cpDddCol, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbCelularCol)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cpCelCol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(labelBairro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cpBaiCol, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(labelCep)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cpCepCol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 51, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTituloContato)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpSenCol, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTituloContato1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpUsuCol, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomCol)
                    .addComponent(cpNomCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpfCol)
                    .addComponent(cpCpfCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEquCol)
                    .addComponent(cpEquCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEnderecoLocalizacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(cpEndCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpBaiCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro)
                    .addComponent(labelCep)
                    .addComponent(cpCepCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumCol)
                    .addComponent(cpNumCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelComplemento)
                    .addComponent(cpComCol, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTituloContato)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelularCol)
                    .addComponent(cpCelCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDddCol)
                    .addComponent(cpDddCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTituloContato1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpUsuCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpSenCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cpNomColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomColActionPerformed

    }//GEN-LAST:event_cpNomColActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Colaborador col = new Colaborador();
        col.setNomCol(cpNomCol.getText());
        col.setEndCol(cpEndCol.getText());
        col.setBaiCol(cpBaiCol.getText());
        col.setComCol(cpComCol.getText());
        col.setUsuCol(cpUsuCol.getText());
        col.setSenCol(cpSenCol.getText());
        col.setTipoCol((String) comboLogin.getSelectedItem());

        String cep = cpCepCol.getText();
        cep = cep.replaceAll("[^0-9]", "");

        String celular = cpCelCol.getText();
        celular = celular.replaceAll("[^0-9]", "");

        String numero = cpNumCol.getText();
        numero = numero.replaceAll("[^0-9]", "");

        String cpf = cpCpfCol.getText();
        cpf = cpf.replaceAll("[^0-9]", "");

        String ddd = cpDddCol.getText();
        ddd = ddd.replaceAll("[^0-9]", "");

        String equipe = cpEquCol.getText();
        equipe = equipe.replaceAll("[^0-9]", "");
        col.setCepCol((int) Long.parseLong(cep));
        col.setCelCol((int) Long.parseLong(celular));
        col.setNumCol((int) Long.parseLong(numero));
        col.setCpfCol((int) Long.parseLong(cpf));
        col.setDddCol((int) Long.parseLong(ddd));
        col.setEquCol((int) Long.parseLong(equipe));
        //Inseri o funcionario no banco de dados
        ColaboradorDao colDao = new ColaboradorDao();
        try {
            colDao.inserir(col);
            JOptionPane.showMessageDialog(null, "Funcionáio inserido com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Falha ao inserir Funcionáio!");

        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void comboLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLoginActionPerformed

    private void cpEquColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEquColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEquColActionPerformed

    private void cpComColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpComColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpComColActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> comboLogin;
    private javax.swing.JTextField cpBaiCol;
    private javax.swing.JFormattedTextField cpCelCol;
    private javax.swing.JFormattedTextField cpCepCol;
    private javax.swing.JTextField cpComCol;
    private javax.swing.JFormattedTextField cpCpfCol;
    private javax.swing.JFormattedTextField cpDddCol;
    private javax.swing.JTextField cpEndCol;
    private javax.swing.JFormattedTextField cpEquCol;
    private javax.swing.JTextField cpNomCol;
    private javax.swing.JFormattedTextField cpNumCol;
    private javax.swing.JTextField cpSenCol;
    private javax.swing.JTextField cpUsuCol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelBairro;
    private javax.swing.JLabel labelCadastroCliente;
    private javax.swing.JLabel labelCep;
    private javax.swing.JLabel labelComplemento;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelEnderecoLocalizacao;
    private javax.swing.JLabel labelTituloContato;
    private javax.swing.JLabel labelTituloContato1;
    private javax.swing.JLabel lbCelularCol;
    private javax.swing.JLabel lbCpfCol;
    private javax.swing.JLabel lbDddCol;
    private javax.swing.JLabel lbEquCol;
    private javax.swing.JLabel lbNomCol;
    private javax.swing.JLabel lbNumCol;
    // End of variables declaration//GEN-END:variables
}
