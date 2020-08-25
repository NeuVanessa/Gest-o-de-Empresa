package br.unirb.gestao.dao;

import br.unirb.gestao.dao.ConnectionFactory;
import br.unirb.modelo.Agenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class AgendaDao extends ConnectionFactory{
    
    private Connection con;

    public AgendaDao() {
        this.con = this.getConnection();
    }
    
    public void inserir(Agenda age) throws SQLException {

        String sql = "insert into agenda "
                + "(datComAge, datCriAge, "
                + "desAge, titAge, codColAge, codEquAge, idCol, idEqu) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?);";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, age.getDatComAge());
            st.setString(2, age.getDatCriAge());
            st.setString(3, age.getDesAge());
            st.setString(4, age.getTitAge());
            st.setLong(5, age.getCodColAge());
            st.setLong(6, age.getCodEquAge());
            st.setLong(7, age.getIdCol());
            st.setLong(8, age.getIdEqu());
            
            st.execute();
            st.close();
        }

        this.con.close();

    }
    
    public void eliminar(int codColAge, int codEquAge, String datComAge, String datCriAge) throws SQLException {

        String sql = "delete from agenda where codColAge = ? and codEquAge = ? "
                + "and datComAge = ? and datCriAge = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codColAge);
            st.setInt(2, codEquAge);
            st.setString(3, datComAge);
            st.setString(4, datCriAge);
            st.execute();
            st.close();
        }

        this.con.close();

    }
    
    public void alterar(Agenda age) throws SQLException {

      

        String sql = "update cliente set datComAge = ?, datCriAge0 = ?, desAge = ?, "
                + "titAge = ?, codColAge = ?, codEquAge = ?, idCol = ?, idEqu = ? where"
                + " codColAge = ? and codEquAge = ? and datComAge = ? and datCriAge = ?";

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setString(1, age.getDatComAge());
            st.setString(2, age.getDatCriAge());
            st.setString(3, age.getDesAge());
            st.setString(4, age.getTitAge());
            st.setLong(5, age.getCodColAge());
            st.setLong(6, age.getCodEquAge());
            st.setLong(7, age.getIdCol());
            st.setLong(8, age.getIdEqu());

            st.execute();
            st.close();
        }

        this.con.close();

    }
    
    public List<Agenda> listarTarefas() throws SQLException {
        String sql = "select * from agenda";
        List<Agenda> agendas = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery();

            agendas = new ArrayList<Agenda>();

            while (rs.next()) {
                Agenda age = new Agenda();
                age.setCodColAge(rs.getInt("codColAge"));
                age.setCodEquAge(rs.getLong("codEquAge"));
                age.setDatComAge(rs.getString("datComAge"));
                age.setDatCriAge(rs.getString("datCriAge"));
                age.setDesAge(rs.getString("desAge"));
                age.setTitAge(rs.getString("titAge"));
                age.setIdCol(rs.getInt("idCol"));
                age.setIdEqu(rs.getInt("idEqu"));

                agendas.add(age);
            }

            rs.close();
            st.close();

        }

        this.con.close();
        return agendas;
    }
    
    public Agenda getAgenda(int codColAge, int codEquAge, String datComAge, String datCriAge) throws SQLException {
        String sql = "select * from agenda where codColAge = ? and codEquAge = ? and datComAge = ? and datCriAge = ?";
        Agenda agenda = null;

        try (PreparedStatement st = this.con.prepareStatement(sql)) {
            st.setInt(1, codColAge);
            st.setInt(2, codEquAge);
            st.setString(3, datComAge);
            st.setString(4, datCriAge);
            try (ResultSet rs = st.executeQuery()) {
                if (rs.next()) {
                    agenda.setCodColAge(rs.getInt("codColAge"));
                    agenda.setCodEquAge(rs.getLong("codEquAge"));
                    agenda.setDatComAge(rs.getString("datComAge"));
                    agenda.setDatCriAge(rs.getString("datCriAge"));
                    agenda.setDesAge(rs.getString("desAge"));
                    agenda.setTitAge(rs.getString("titAge"));
                    agenda.setIdCol(rs.getInt("idCol"));
                    agenda.setIdEqu(rs.getInt("idEqu"));
                }
            }
            st.close();
        }

        this.con.close();
        return agenda;
    }
    
}
