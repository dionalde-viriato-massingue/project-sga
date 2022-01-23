
package SGA.Controller;

import SGA.Model.*;
import View.Home;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class UsuarioController {
UsuarioVO pessoa;
    
    public UsuarioController(String nome, String senha) {
     pessoa = new UsuarioVO();
     pessoa.setNome_pessoa(nome);
     pessoa.setSenha_pessoa(senha);
     result();
    }
    public boolean result(){
        boolean cont = false;
        UsuarioDAO objUserDAO = new UsuarioDAO();
        ResultSet rsUserDAO = objUserDAO.autenticacaoUsuario(pessoa);
   
        try {
            if(rsUserDAO.next()){ cont = true;
             
            }else{
                JOptionPane.showMessageDialog(null, "acesso negado, cadastre-se");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
   return cont; }
}
