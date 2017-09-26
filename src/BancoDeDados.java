import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BancoDeDados {
    
     public Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Leonardo/Desktop/Unifacs/Projetos/Projeto1/Contatos Telefonicos/ContatosTelefonicos/ContatosTelefonicos.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            //System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
        } 
    
      public void criaTabela (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS contato(";
                sql += "id           int PRIMARY KEY,";
                sql += "nome         char(100) NOT NULL,";
                sql += "numero       char(10) NOT NULL,";
                sql += "email        char(30)";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
      
        public void insereDados (Connection conn, int id, String nome, String numero, String email) {
        String sql = "INSERT INTO contato VALUES(?,?,?,?)";
        
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
                pstmt.setInt(1, id);
                pstmt.setString(2, nome);
                pstmt.setString(3, numero);
                pstmt.setString(4, email);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
        
        public void selecionaDados (Connection conn) {
        
        String sql = "SELECT id, nome, numero, email "
                     + "FROM contato;";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs = comandoSql.executeQuery(sql);
            
            //loop no resultado
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" + 
                                   rs.getString("nome") + "\t" +
                                   rs.getString("numero") + "\t" +
                                   rs.getString("email"));
                }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        }  
        
        public static void main(String[] args) {

        BancoDeDados bd = new BancoDeDados();
        
       Connection conn = bd.connect();
        
        bd.criaTabela(conn);
        
        bd.insereDados(conn, 0, "Leonardo", "99642568", "leonardo.coluz@hotmail.com");
        
        bd.insereDados(conn, 1, "Caio", "98237547", "caiovinius@hotmail.com");
        
        bd.insereDados(conn, 2, "Luis", "99546443", "luisfilipeos@outlook.com");
        
        bd.insereDados(conn, 3, "Yan", "24242424", "gordoarrombado@gmail.com");
        
        bd.selecionaDados (conn);
    }
}
