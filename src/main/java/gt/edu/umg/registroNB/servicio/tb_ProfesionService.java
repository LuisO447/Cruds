/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.tb_Profesion;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface tb_ProfesionService {
    
    public List <tb_Profesion> listatb_Profesion();
    public void guardarPro(tb_Profesion tb_profesion);//ojito con estos antes eran persona
    public void eliminarPro(tb_Profesion tb_profesion);
    public tb_Profesion encontrarProfesion (tb_Profesion tb_profesion);
}
