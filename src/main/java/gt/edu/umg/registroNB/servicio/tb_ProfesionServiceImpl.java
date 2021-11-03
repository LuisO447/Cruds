/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.dao.Itb_profesionDao;
import gt.edu.umg.registroNB.tb_Profesion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Luis
 */
@Service
public class tb_ProfesionServiceImpl implements tb_ProfesionService{
    
    @Autowired
    private Itb_profesionDao Itb_profesionDao;

    @Override
    @Transactional(readOnly=true)
    public List<tb_Profesion> listatb_Profesion() {
         return (List<tb_Profesion>) Itb_profesionDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void guardarPro(tb_Profesion tb_profesion) {
        Itb_profesionDao.save(tb_profesion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void eliminarPro(tb_Profesion tb_profesion) {
        Itb_profesionDao.delete(tb_profesion); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public tb_Profesion encontrarProfesion(tb_Profesion tb_profesion) {
        tb_Profesion pro = new tb_Profesion();
        
        pro.setDESCRIPCION_PROFESION("None");
        
        return Itb_profesionDao.findById(tb_profesion.getID_PROFESION()).orElse(pro);
    }
    
}
