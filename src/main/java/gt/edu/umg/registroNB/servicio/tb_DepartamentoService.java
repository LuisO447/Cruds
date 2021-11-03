/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB.servicio;

import gt.edu.umg.registroNB.tb_Departamento;
import java.util.List;

/**
 *
 * @author Luis
 */
public interface tb_DepartamentoService {
    
    public List <tb_Departamento> listatb_Departamento();
    public void guardarD(tb_Departamento tb_departamento);//ojito con estos antes eran tb_usuarios
    public void eliminarD(tb_Departamento tb_departamento);
    public tb_Departamento encontrarDepartamento (tb_Departamento tb_departamento);//LOS CAMBIE DE TB_usuarios en minusculas
    
}
