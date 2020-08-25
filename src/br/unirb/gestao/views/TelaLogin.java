package br.unirb.gestao.views;

import br.unirb.gestao.dao.ColaboradorDao;
import br.unirb.gestao.jframe.sistemagestajFrame;
import br.unirb.modelo.Colaborador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class TelaLogin extends javax.swing.JPanel {

    private Connection con;
    private String tipo = "";
    private Colaborador col = new Colaborador();
    public Long idCol = col.getIdCol();
    public Long idEqu = col.getEquCol();

    /**
     * Creates new form TelaPadrao
     */
    public TelaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labTit = new javax.swing.JLabel();
        labFiesc = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        labelSenha = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        cpSenha = new javax.swing.JPasswordField();
        cpUsuario = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(null);

        labTit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labTit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labTit.setText("SISTEMA DE GESTÃO");

        labFiesc.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        labFiesc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labFiesc.setText("UNIRVERSIDADE REGIONAL DA BAHIA");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        labelSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelSenha.setText("Senha:");

        labelUsuario.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        labelUsuario.setText("Usuário:");

        cpSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpSenhaActionPerformed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labTit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labFiesc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(labelSenha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogin)
                        .addGap(350, 350, 350))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(labTit)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(labFiesc)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsuario)
                    .addComponent(cpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha)
                    .addComponent(cpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Colaborador getC() throws SQLException {
        ColaboradorDao col = new ColaboradorDao();
        Colaborador c;

        c = col.validarColaborador(cpSenha.getText(), cpUsuario.getText());

        return c;

    }

    private void setCol(Colaborador c) {

        this.col = c;
    }

    public Colaborador getCol() {
        return col;
    }

    public Long getIdCol() {
        return idCol;
    }

    public Long getIdEqu() {
        return idEqu;
    }


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        sistemagestajFrame sis = null;
        try {
            sis = new sistemagestajFrame();
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            Colaborador c;
            c = getC();
            setTipo(c.getTipoCol());
            setCol(c);
            if (c != null) {
                String usuario, senha;
                usuario = cpUsuario.getText();
                senha = cpSenha.getText();
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                ColaboradorDao dao = new ColaboradorDao();
                dao.validarColaborador(usuario, senha);
                setVisible(false);
              

            } else {
                JOptionPane.showMessageDialog(null, "Usuário não autenticado!");

            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao fazer Login!");
        }


    }//GEN-LAST:event_btnLoginActionPerformed


    private void cpSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpSenhaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField cpSenha;
    private javax.swing.JTextField cpUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labFiesc;
    private javax.swing.JLabel labTit;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

}
