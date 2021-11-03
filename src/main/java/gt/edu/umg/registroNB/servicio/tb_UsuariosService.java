/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.tb_Usuarios;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface tb_UsuariosService {
    
    public List <tb_Usuarios> listatb_Usuarios();
    public void guardar(tb_Usuarios tb_usuarios);//ojito con estos antes eran persona
    public void eliminar(tb_Usuarios tb_usuarios);
    public tb_Usuarios encontrarUsuario (tb_Usuarios tb_usuarios);//LOS CAMBIE DE TB_usuarios en minusculas
    
}
