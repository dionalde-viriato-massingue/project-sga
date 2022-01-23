
package SGA.Controller;

import SGA.Model.EstudanteCadDAO;
import SGA.Model.EstudanteCadVO;
import java.util.ArrayList;

public class EstudanteCadController {
    EstudanteCadVO estudanteVO;
    String cod;
    EstudanteCadDAO estudanteDAO = new EstudanteCadDAO();
    public EstudanteCadController(int id,String nome, String data, String sexo,String cadeira,String facul,String pais,String prov,int contacto){
     estudanteVO = new EstudanteCadVO();
     
     estudanteVO.setId(id);
     estudanteVO.setNome(nome);
     estudanteVO.setData(data);
     estudanteVO.setSexo(sexo);
     estudanteVO.setCadeira(cadeira);
     estudanteVO.setFacul(facul);
     estudanteVO.setPais(pais);
     estudanteVO.setProvincia(prov);
     estudanteVO.setContacto(contacto);
    
     
     EstudanteCadDAO estDAO = new EstudanteCadDAO();
     estDAO.CadDEstudante(estudanteVO);
    }
      public EstudanteCadController(String cod){this.cod=cod;}
      
     public EstudanteCadController(){this(0,"","","","","","","",0);}
     
    public ArrayList<EstudanteCadVO> getDados(){ 
        ArrayList<EstudanteCadVO> listarDadosE = estudanteDAO.recuperarEstudante(cod);      
        return listarDadosE;
    }
    
     public ArrayList<EstudanteCadVO> countEstudantes(){ 
        ArrayList<EstudanteCadVO> listarCountEst = estudanteDAO.countEstudantes();      
        return listarCountEst;
    }
    
}
