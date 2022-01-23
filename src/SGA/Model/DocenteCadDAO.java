
package SGA.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DocenteCadDAO {
   Connection conn;
   PreparedStatement pstm;
   ResultSet rs;
   ArrayList<DocenteCadVO> list = new ArrayList<>();
   public DocenteCadDAO(){
    
       try {
         conn = BDconexao.getConnection();
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "DocenteCadDAO Conn"+e.getMessage());
       }
   }
   public void CadDocente(DocenteCadVO docent){
   
       try {
           String sql="Insert Into Docente(idDocente,nome,dNascimento,sexo,cadeiraLeciona,Faculdade, nacionalidade,provincia, Contacto) values (?,?,?,?,?,?,?,?,?)";
           pstm= conn.prepareStatement(sql);
           pstm.setInt(1, docent.getId());
           pstm.setString(2, docent.getNome());
           pstm.setString(3, docent.getData());
           pstm.setString(4, docent.getSexo());
           pstm.setString(5, docent.getCadeira());
           pstm.setString(6, docent.getFacul());
           pstm.setString(7, docent.getPais());
           pstm.setString(8, docent.getProvincia());
           pstm.setString(9, docent.getContacto());
           
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Docente inserido com sucessio");
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Docente sql"+e.getMessage());   
       }
      
        try {
    
           String sql2="Insert Into Usuario(nome,senha,categoria) values (?,?,'Docente')";
           pstm= conn.prepareStatement(sql2);
           pstm.setString(1, docent.getNome());
           pstm.setInt(2, docent.getId());
           
           pstm.execute();
           pstm.close();
           JOptionPane.showMessageDialog(null, "Usuario inserido com sucessio");
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Usuario sql"+e.getMessage());   
       }
      
       
   }
   
   public ArrayList<DocenteCadVO> recuperarDocente(){
       String sql ="select * from Docente";
       try {
           pstm=conn.prepareStatement(sql);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               DocenteCadVO docente = new DocenteCadVO();
               docente.setId(rs.getInt("idDocente"));
               docente.setNome(rs.getString("nome"));
               docente.setData(rs.getString("dNascimento"));
               docente.setSexo(rs.getString("sexo"));
               docente.setCadeira(rs.getString("cadeiraLeciona"));
               docente.setFacul(rs.getString("faculdade"));
               docente.setPais(rs.getString("nacionalidade"));
               docente.setContacto(rs.getString("contacto"));
               
               list.add(docente);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Recuperar Docente"+e.getMessage());  
       }
   return list;}
   
     public ArrayList<DocenteCadVO> countDocentes(){
        String sql2 ="select  nome from Docente";
       try {
           pstm=conn.prepareStatement(sql2);
           rs= pstm.executeQuery();
           
           while(rs.next()){
               DocenteCadVO docente = new DocenteCadVO();
               docente.setNome(rs.getString("nome"));
  
               list.add(docente);
           
           }
       } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "count Docente"+e.getMessage());  
       }
   return list;}
   
   
   
}
