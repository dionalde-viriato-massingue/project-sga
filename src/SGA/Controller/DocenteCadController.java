
package SGA.Controller;

import SGA.Model.DocenteCadDAO;
import SGA.Model.DocenteCadVO;
import java.util.ArrayList;

public class DocenteCadController {
    DocenteCadVO docenteVO;
    DocenteCadDAO docenteDAO = new DocenteCadDAO();
    public DocenteCadController(int id,String nome, String data, String sexo,String cadeira,String facul,String pais,String prov,String contacto){
     docenteVO = new DocenteCadVO();
     
     docenteVO.setId(id);
     docenteVO.setNome(nome);
     docenteVO.setData(data);
     docenteVO.setSexo(sexo);
     docenteVO.setCadeira(cadeira);
      docenteVO.setFacul(facul);
     docenteVO.setPais(pais);
     docenteVO.setProvincia(prov);
     docenteVO.setContacto(contacto);
     
     DocenteCadDAO docDAO = new DocenteCadDAO();
     docDAO.CadDocente(docenteVO);
    }

    public DocenteCadController() {}
      public ArrayList<DocenteCadVO> countDocentes(){ 
        ArrayList<DocenteCadVO> listarCountDocentes = docenteDAO.countDocentes();
        return listarCountDocentes;
    }
    
}
