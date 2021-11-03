/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB;

import gt.edu.umg.registroNB.servicio.tb_DepartamentoService;
import gt.edu.umg.registroNB.servicio.tb_UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Luis
 */
@Controller
public class ControladordeInicio {
    
    
    @Autowired
    private tb_UsuariosService tb_UsuariosService;
    
    @GetMapping("/")
    public String inicio(Model model) {

        var usuarios = tb_UsuariosService.listatb_Usuarios();
        model.addAttribute("usuarios",usuarios);
        
        return "Index";

    }
    
    @GetMapping("/agregar")
    public String agregar(@ModelAttribute("tb_usuarios") tb_Usuarios tb_usuarios){//cambie el tb_usuarios por usuarios
        
        return "modificar";
        
    }
    
    @PostMapping("/guardar")
    public String guardar(tb_Usuarios tb_usuarios){
    
        tb_UsuariosService.guardar(tb_usuarios);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{ID_USUARIO}")
    public String editar(tb_Usuarios tb_usuarios, Model model){
        
        tb_usuarios= tb_UsuariosService.encontrarUsuario(tb_usuarios);
        model.addAttribute("tb_usuarios",tb_usuarios);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{ID_USUARIO}")
    public String eliminar(tb_Usuarios tb_usuarios){
        
        tb_UsuariosService.eliminar(tb_usuarios);
        
        return "redirect:/";
    }
    
    //division de codigo
   
}
