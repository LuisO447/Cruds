/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Luis
 */
//Originalmente esta clase se llamaba Usuario
@Data
@Entity
@Table(name="tb_usuarios")
public class tb_Usuarios implements Serializable {
    
    private static final long serialVersionUI = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    //esto primero estaba en minusculas
    private Long ID_USUARIO;
    private int ID_DEPTO;
    private int ID_PROFESION;
    private String NOMBRE;
    private String APELLIDO;
    private String CORREO_ELECTRONICO;
    private String TELEFONO;
    //importar java date o sql date?
    private String FECHA_NACIMIENTO;//importe el util.date de momento y posiblemente cambiar a varchar o string
    private Float LONGITUD;
    private Float LATITUD;
    private String FECHA_REGISTRO;//posiblemente cambiar a varchar o string
    
    //poner aca las tablas foraneas?
    
}
