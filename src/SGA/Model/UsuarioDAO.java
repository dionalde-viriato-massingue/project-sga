
package SGA.Model;

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class UsuarioDAO {
 
   Connection conn = null;
  
   public UsuarioDAO(){

            try{
                conn=BDconexao.getConnection();
            }catch(SQLException|ClassNotFoundException ex){
                System.out.println("Erro de conexao: "+ex.getMessage());
            }
        }
   public ResultSet autenticacaoUsuario(UsuarioVO userdao){
       String nome;
       
        try {
            String sql="select * from usuario where nome=? AND senha=?";
            PreparedStatement pstm =conn.prepareStatement(sql);
            pstm.setString(1, userdao.getNome_pessoa());
            pstm.setString(2, userdao.getSenha_pessoa());
            
            ResultSet rs= pstm.executeQuery();
            
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro de UsuarioDAO"+e.getMessage());
            
            return null;
        }
   }
}
