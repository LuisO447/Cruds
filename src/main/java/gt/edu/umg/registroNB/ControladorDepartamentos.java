/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB;

import gt.edu.umg.registroNB.servicio.tb_DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Luis
 */
@Controller
public class ControladorDepartamentos {
    
    @Autowired
    private tb_DepartamentoService tb_DepartamentoService;
    
    @GetMapping("/crudDepto")
    public String crudDepto(Model model1){
        
        var Departamentos = tb_DepartamentoService.listatb_Departamento();
        model1.addAttribute("Departamentos",Departamentos);
        
        return "crudDepto"; //estaba en minusculas
        
    }
    
    @GetMapping("/agregarDepto")
    public String agregarD(@ModelAttribute("tb_departamento") tb_Departamento tb_departamento){//cambie el tb_usuarios por usuarios
        
        return "modificarDepto";
        
    }
    
    @PostMapping("/guardarDepto")
    public String guardarD(tb_Departamento tb_departamento){
    
        tb_DepartamentoService.guardarD(tb_departamento);
        return "redirect:/crudDepto";
    }
    
    @GetMapping("/editarDepto/{ID_DEPTO}")
    public String editarD(@ModelAttribute("tb_departamento") tb_Departamento tb_departamento, Model model){
        
        tb_departamento= tb_DepartamentoService.encontrarDepartamento(tb_departamento);
        model.addAttribute("tb_usuarios",tb_departamento);
        return "modificarDepto";
    }
    
    @GetMapping("/eliminarDepto/{ID_DEPTO}")
    public String eliminarD(tb_Departamento tb_departamento){
        
        tb_DepartamentoService.eliminarD(tb_departamento);
        
        return "redirect:/crudDepto";
    }
    
}
