/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.dao.Itb_usuariosDao;
import gt.edu.umg.registroNB.tb_Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Luis
 */

@Service
public class tb_UsuariosServiceImpl implements tb_UsuariosService{
    
    @Autowired
    private Itb_usuariosDao Itb_usuariosDao;

    @Override
    @Transactional(readOnly=true)
    public List<tb_Usuarios> listatb_Usuarios() {
        return (List<tb_Usuarios>) Itb_usuariosDao.findAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional
    public void guardar(tb_Usuarios usuarios) {
        Itb_usuariosDao.save(usuarios); //cambie de usuarios a tb_usuarios
    }

    @Override
    @Transactional
    public void eliminar(tb_Usuarios usuarios) {
        Itb_usuariosDao.delete(usuarios); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    @Transactional(readOnly=true)
    public tb_Usuarios encontrarUsuario(tb_Usuarios usuarios) {
        tb_Usuarios usu = new tb_Usuarios();
        
        usu.setID_DEPTO(0);
        usu.setID_PROFESION(0);
        usu.setNOMBRE("None");
        usu.setAPELLIDO("None");
        usu.setCORREO_ELECTRONICO("None");
        usu.setTELEFONO("None");
        usu.setFECHA_NACIMIENTO("None");
        usu.setLONGITUD(Float.NaN);//sera poner un 0 o un 0.0?
        usu.setLATITUD(Float.NaN);
        usu.setFECHA_REGISTRO("None");
        
        return Itb_usuariosDao.findById(usuarios.getID_USUARIO()).orElse(usu); //aca hice un conversion con Long.valueof() pero por alguna razon decia string espero que eso no me moleste
        
    }
    
    
    
}
