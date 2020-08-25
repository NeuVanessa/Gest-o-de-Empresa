package br.unirb.gestao.views;

import br.unirb.gestao.dao.ColaboradorDao;
import br.unirb.modelo.Colaborador;
import java.awt.CardLayout;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ListagemColaborador extends javax.swing.JPanel {

    private CardLayout cl;
    private int idCol;
    private int linha;

    public ListagemColaborador() {
        initComponents();

        this.add(painelListagem, "painelListagem");
        this.add(painelEdicao, "painelEdicao");

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelListagem");

        this.popularTabela();

    }

    private void popularTabela() {
        ColaboradorDao cl = new ColaboradorDao();
        List<Colaborador> listaColaborador;

        try {
            listaColaborador = cl.listarColaboradores();

            DefaultTableModel model = (DefaultTableModel) tblColaborador.getModel();
            List<Object> lista = new ArrayList<Object>();

            for (int i = 0; i < listaColaborador.size(); i++) {
                Colaborador c = listaColaborador.get(i);
                lista.add(new Object[]{c.getIdCol(), c.getNomCol(),
                    c.getEndCol(), c.getNumCol(), c.getBaiCol(),
                    c.getCepCol(), c.getComCol(), c.getCpfCol(),
                    c.getCelCol(), c.getTipoCol(), c.getUsuCol(),
                    c.getSenCol(), c.getUltAcCol(), c.getEquCol(),c.getDddCol()});

            }

            for (int idx = 0; idx < lista.size(); idx++) {
                model.addRow((Object[]) lista.get(idx));
            }

        } catch (SQLException ex) {
            String msg = "Ocorreu um erro ao obter os clientes do banco de dados!";
            JOptionPane.showMessageDialog(null, msg);
            Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void limparTabela() {
        //JTable table1 = new JTable(new DefaultTableModel());
        //while (table1.getRowCount() > 0) table1.remove(0);

        ((DefaultTableModel) tblColaborador.getModel()).setNumRows(0);
        tblColaborador.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menPopUpTbl = new javax.swing.JPopupMenu();
        menPopEditar = new javax.swing.JMenuItem();
        menPopEliminar = new javax.swing.JMenuItem();
        painelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblColaborador = new javax.swing.JTable();
        painelEdicao = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpUsuCol = new javax.swing.JTextField();
        cpSenCol = new javax.swing.JTextField();
        cpEquCol = new javax.swing.JFormattedTextField();

        menPopEditar.setText("Editar");
        menPopEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPopEditarActionPerformed(evt);
            }
        });
        menPopUpTbl.add(menPopEditar);

        menPopEliminar.setText("Eliminar");
        menPopEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menPopEliminarMouseClicked(evt);
            }
        });
        menPopEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menPopEliminarActionPerformed(evt);
            }
        });
        menPopUpTbl.add(menPopEliminar);

        setLayout(new java.awt.CardLayout());

        tblColaborador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "Número", "Bairro", "CEP", "Complemento", "CPF", "Celular", "Tipo", "Usuário", "Senha", "Último Acesso", "Equipe", "DDD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblColaborador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblColaborador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblColaboradorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblColaborador);
        if (tblColaborador.getColumnModel().getColumnCount() > 0) {
            tblColaborador.getColumnModel().getColumn(12).setPreferredWidth(140);
        }

        javax.swing.GroupLayout painelListagemLayout = new javax.swing.GroupLayout(painelListagem);
        painelListagem.setLayout(painelListagemLayout);
        painelListagemLayout.setHorizontalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        painelListagemLayout.setVerticalGroup(
            painelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        add(painelListagem, "card3");

        painelEdicao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        labelCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelCadastroCliente.setText("Atualizar Dados");

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

        labelTituloContato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTituloContato.setText("Contato");

        lbCelularCol.setText("Celular:");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("Nome de Usuário:");

        jLabel2.setText("Senha:");

        try {
            cpEquCol.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpEquCol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpEquColActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelEdicaoLayout = new javax.swing.GroupLayout(painelEdicao);
        painelEdicao.setLayout(painelEdicaoLayout);
        painelEdicaoLayout.setHorizontalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbNomCol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpNomCol))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCadastroCliente)
                                    .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelEdicaoLayout.createSequentialGroup()
                                            .addComponent(lbEquCol)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpEquCol))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelEdicaoLayout.createSequentialGroup()
                                            .addComponent(lbCpfCol)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cpCpfCol, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(50, 50, 50))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(labelEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpEndCol))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addComponent(lbNumCol)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpNumCol, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelEnderecoLocalizacao)
                                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                                        .addComponent(labelBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpBaiCol, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(labelCep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpCepCol, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addContainerGap())
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTituloContato)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbCelularCol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpCelCol, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(lbDddCol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpDddCol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpSenCol, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpUsuCol, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelEdicaoLayout.createSequentialGroup()
                                .addComponent(labelComplemento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpComCol, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTituloContato1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelEdicaoLayout.setVerticalGroup(
            painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEdicaoLayout.createSequentialGroup()
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelEdicaoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(labelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbNomCol)
                            .addComponent(cpNomCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCpfCol)
                            .addComponent(cpCpfCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEquCol)
                    .addComponent(cpEquCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEnderecoLocalizacao)
                .addGap(18, 18, 18)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEndereco)
                    .addComponent(cpEndCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpBaiCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBairro)
                    .addComponent(labelCep)
                    .addComponent(cpCepCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumCol)
                    .addComponent(cpNumCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpComCol, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTituloContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDddCol)
                    .addComponent(cpDddCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCelularCol)
                    .addComponent(cpCelCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTituloContato1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpUsuCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelEdicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpSenCol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(painelEdicao, "card4");
    }// </editor-fold>//GEN-END:initComponents

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

        String codigo = tblColaborador.getValueAt(this.linha, 0).toString();
        int codigoColaborador = Integer.parseInt(codigo);

        col.setIdCol(codigoColaborador);

        //Inseri o cliente no banco de dados
        ColaboradorDao cliDao = new ColaboradorDao();
        try {

            cliDao.alterar(col);
            JOptionPane.showMessageDialog(null, "Cadastro atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao atualizar cadastro !");
            Logger.getLogger(CadastroColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void preencherFormulario(int idCol) {

        ColaboradorDao colab = new ColaboradorDao();
        try {
            Colaborador col = colab.getColaborador(idCol);
            cpNomCol.setText(col.getNomCol());
            cpEndCol.setText(col.getEndCol());
            cpNumCol.setText("" + col.getNumCol());
            cpBaiCol.setText(col.getBaiCol());
            cpComCol.setText(col.getComCol());
            cpCepCol.setText("" + col.getCepCol());
            cpCelCol.setText("" + col.getCelCol());
            cpCpfCol.setText("" + col.getCpfCol());
            cpDddCol.setText("" + col.getDddCol());
            cpEquCol.setText("" + col.getEquCol());
            cpUsuCol.setText(col.getUsuCol());
            cpSenCol.setText(col.getSenCol());

        } catch (SQLException ex) {
            Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
        }

        this.idCol = idCol;

    }

    private void cpNomColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpNomColActionPerformed

    }//GEN-LAST:event_cpNomColActionPerformed

    private void comboLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboLoginActionPerformed

    private void menPopEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPopEliminarActionPerformed

        Object[] options = {"Sim", "Não"};
        int opcaoSelecionada = JOptionPane.showOptionDialog(null, "Deseja realmente eliminar este funcionáio?",
                "Atenção!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);

        if (opcaoSelecionada == 0) {
            ColaboradorDao colDao = new ColaboradorDao();
            try {

                String codigo = tblColaborador.getValueAt(this.linha, 0).toString();
                int codigoColaborador = Integer.parseInt(codigo);

                colDao.eliminar(codigoColaborador);
                limparTabela();
                popularTabela();
                JOptionPane.showMessageDialog(null, "Cadastro apagado com sucesso!");

            } catch (SQLException ex) {
                Logger.getLogger(ListagemColaborador.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Erro ao apagar cadastro!", "ATENÇÃO!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_menPopEliminarActionPerformed

    private void menPopEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menPopEditarActionPerformed

        this.cl = (CardLayout) this.getLayout();
        this.cl.show(this, "painelEdicao");

    }//GEN-LAST:event_menPopEditarActionPerformed

    private void tblColaboradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblColaboradorMouseClicked
        if ((evt.getModifiers() & evt.BUTTON3_MASK) != 0) {
            this.linha = tblColaborador.getSelectedRow();
            menPopUpTbl.show(tblColaborador, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tblColaboradorMouseClicked

    private void menPopEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menPopEliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menPopEliminarMouseClicked

    private void cpEquColActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpEquColActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpEquColActionPerformed

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
            java.util.logging.Logger.getLogger(ListagemColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListagemColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListagemColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListagemColaborador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListagemColaborador().setVisible(true);
            }
        });
    }


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JMenuItem menPopEditar;
    private javax.swing.JMenuItem menPopEliminar;
    private javax.swing.JPopupMenu menPopUpTbl;
    private javax.swing.JPanel painelEdicao;
    private javax.swing.JPanel painelListagem;
    private javax.swing.JTable tblColaborador;
    // End of variables declaration//GEN-END:variables
}
