/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.dao.Itb_departamentoDao;
import gt.edu.umg.registroNB.tb_Departamento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Luis
 */
@Service
public class tb_DepartamentoServiceImpl implements tb_DepartamentoService{
    
    @Autowired
    private Itb_departamentoDao Itb_departamentoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<tb_Departamento> listatb_Departamento() {
        return (List <tb_Departamento>) Itb_departamentoDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    @Transactional
    public void guardarD(tb_Departamento tb_departamento) {
        Itb_departamentoDao.save(tb_departamento); //sera correcto con Departamentos
    }
    
    @Override
    @Transactional
    public void eliminarD(tb_Departamento tb_departamento) {
        Itb_departamentoDao.delete(tb_departamento); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    @Transactional(readOnly=true)
    public tb_Departamento encontrarDepartamento(tb_Departamento tb_departamento) {//ver si no cambiar nombre a todos
        
        tb_Departamento dep = new tb_Departamento();
        
        dep.setDESCRIPCION_DEPTO("None");//ver si esto se cambia por Departamentos
        
        return Itb_departamentoDao.findById(tb_departamento.getID_DEPTO()).orElse(dep); //To change body of generated methods, choose Tools | Templates.
    }
    
}
