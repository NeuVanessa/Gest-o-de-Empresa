package br.unirb.gestao.dao;

import br.unirb.modelo.Colaborador;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDao extends ConnectionFactory {

    private Connection con;

    public ColaboradorDao() {
        this.con = this.getConnection();
    }

    public void inserir(Colaborador col) throws SQLException {

        String sql = "insert into colaborador "
                + "(nomCol, endCol, numCol, "
                + "baiCol, cepCol, comCol, cpfCol, "
                + "celCol, tipoCol,usuCol, senCol, equCol, dddCol) "
                + "values (?, ?, ?, ?, ?, ?, ?, ? ,? ,? , ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
           
            st.setString(1, col.getNomCol());
            st.setString(2, col.getEndCol());
            st.setInt(3, (int) col.getNumCol());
            st.setString(4, col.getBaiCol());
            st.setInt(5, (int) col.getCepCol());
            st.setString(6, col.getComCol());
            st.setInt(7, (int) col.getCpfCol());
            st.setInt(8, (int) col.getCelCol());
            st.setString(9, col.getTipoCol());
            st.setString(10, col.getUsuCol());
            st.setString(11, col.getSenCol());
            st.setInt(12, (int) col.getEquCol());
            st.setInt(13, (int) col.getDddCol());
            
            
            
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void eliminar(int idCol) throws SQLException {

        String sql = "delete from colaborador where idCol = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {

            st.setInt(1, idCol);
            st.execute();
            st.close();
        }

        this.con.close();

    }

    public void alterar(Colaborador col) throws SQLException {

        String sql = "update colaborador set nomCol = ?, endCol = ?, numCol= ?, baiCol = ?,cepCol= ?, "
                + "comCol = ?, cpfCol=?, celCol = ?, tipoCol=?, usuCol=?, senCol=?,"
                + "equCol=?, dddCol=? where idCol = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {

            st.setString(1, col.getNomCol());
            st.setString(2, col.getEndCol());
            st.setInt(3, (int) col.getNumCol());
            st.setString(4, col.getBaiCol());
            st.setInt(5, (int) col.getCepCol());
            st.setString(6, col.getComCol());
            st.setInt(7, (int) col.getCpfCol());
            st.setInt(8, (int) col.getCelCol());
            st.setString(9, col.getTipoCol());
            st.setString(10, col.getUsuCol());
            st.setString(11, col.getSenCol());
            st.setInt(12, (int) col.getEquCol());
            st.setInt(13, (int) col.getDddCol());
            st.setInt(14, (int) col.getIdCol());

            st.execute();
            st.close();
        }

        this.con.close();

    }

    public List<Colaborador> listarColaboradores() throws SQLException {
        String sql = "select * from colaborador";
        List<Colaborador> colaboradores = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            colaboradores = new ArrayList<Colaborador>();

            while (rs.next()) {
                Colaborador c = new Colaborador();
                c.setIdCol((int) rs.getLong("idCol"));
                c.setNomCol(rs.getString("nomCol"));
                c.setEndCol(rs.getString("endCol"));
                c.setNumCol((int) rs.getLong("numCol"));
                c.setBaiCol(rs.getString("baiCol"));
                c.setCepCol((int) rs.getLong("cepCol"));
                c.setComCol(rs.getString("comCol"));
                c.setCpfCol((int) rs.getLong("cpfCol"));
                c.setCelCol((int) rs.getLong("celCol"));
                c.setTipoCol(rs.getString("tipoCol"));
                c.setUsuCol(rs.getString("usuCol"));
                c.setSenCol(rs.getString("senCol"));
                c.setUltAcCol(rs.getTimestamp("ultAcCol"));
                c.setEquCol((int) rs.getLong("equCol"));
                c.setDddCol((int) rs.getLong("dddCol"));
                colaboradores.add(c);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return colaboradores;
    }

    public Colaborador validarColaborador(String senCol, String usuCol) throws SQLException {
        String sql = "select * from colaborador where senCol = ? and usuCol = ?";
        Colaborador col = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, senCol);
            st.setString(2, usuCol);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    col = new Colaborador();
                    col.setIdCol((int) rs.getLong("idCol"));
                    col.setNomCol(rs.getString("nomCol"));
                    col.setEndCol(rs.getString("endCol"));
                    col.setNumCol((int) rs.getLong("numCol"));
                    col.setBaiCol(rs.getString("baiCol"));
                    col.setCepCol((int) rs.getLong("cepCol"));
                    col.setComCol(rs.getString("comCol"));
                    col.setCpfCol((int) rs.getLong("cpfCol"));
                    col.setCelCol((int) rs.getLong("celCol"));
                    col.setTipoCol(rs.getString("tipoCol"));
                    col.setUsuCol(rs.getString("usuCol"));
                    col.setSenCol(rs.getString("senCol"));
                    col.setUltAcCol(rs.getTimestamp("ultAcCol"));
                    col.setEquCol((int) rs.getLong("Equipe_idEqui"));
                    col.setDddCol((int) rs.getLong("dddCol"));
                }
            }
            st.close();
        }

        this.con.close();
        return col;
    }

    public Colaborador getColaborador(int idCol) throws SQLException {
        String sql = "select * from colaborador where idCol = ?";
        Colaborador colaborador = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setLong(1, idCol);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    colaborador = new Colaborador();
                   
                     colaborador.setIdCol(rs.getInt("idCol"));
                colaborador.setNomCol(rs.getString("nomCol"));
                colaborador.setEndCol(rs.getString("endCol"));
                colaborador.setNumCol(rs.getInt("numCol"));
                colaborador.setBaiCol(rs.getString("baiCol"));
                colaborador.setCepCol(rs.getInt("cepCol"));
                colaborador.setComCol(rs.getString("comCol"));
                colaborador.setCpfCol(rs.getInt("cpfCol"));
                colaborador.setCelCol(rs.getInt("celCol"));
                colaborador.setTipoCol(rs.getString("tipoCol"));
                colaborador.setUsuCol(rs.getString("usuCol"));
                colaborador.setSenCol(rs.getString("senCol"));
                colaborador.setUltAcCol(rs.getTimestamp("ultAcCol"));
                colaborador.setEquCol(rs.getInt("equCol"));
                colaborador.setDddCol(rs.getInt("dddCol"));

                }
            }
            st.close();

        }
        this.con.close();
        return colaborador;

    }

    public void validarColaborador(Type String) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    }

