/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB;

import gt.edu.umg.registroNB.servicio.tb_ProfesionService;
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
public class ControladorProfesiones {
    
    @Autowired
    private tb_ProfesionService tb_ProfesionService;
    
    @GetMapping("/crudPro")
    public String crudPro(Model model2){
        
        var Profesion = tb_ProfesionService.listatb_Profesion();
        model2.addAttribute("Profesion",Profesion);
        
        return "crudPro";
        
    }
    
    @GetMapping("/agregarPro")
    public String agregarPro(@ModelAttribute("tb_profesion") tb_Profesion tb_profesion){
        
        return "modificarPro";
        
    }
    
    @PostMapping("/guardarPro")
    public String guardarPro(tb_Profesion tb_profesion){
    
        tb_ProfesionService.guardarPro(tb_profesion);
        return "redirect:/crudPro";
    }
    
    @GetMapping("/editarPro/{ID_PROFESION}")
    public String editarPro(@ModelAttribute("tb_profesion") tb_Profesion tb_profesion, Model model){
        
        tb_profesion = tb_ProfesionService.encontrarProfesion(tb_profesion);
        model.addAttribute("tb_usuarios",tb_profesion);
        return "modificarPro";
    }
    
    @GetMapping("/eliminarPro/{ID_PROFESION}")
    public String eliminarD(tb_Profesion tb_profesion){
        
        tb_ProfesionService.eliminarPro(tb_profesion);
        
        return "redirect:/crudPro";
    }
    
}
