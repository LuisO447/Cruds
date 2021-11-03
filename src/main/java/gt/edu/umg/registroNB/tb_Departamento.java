/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.umg.registroNB;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Luis
 */

@Data
@Entity
@Table(name="tb_departamento")
public class tb_Departamento implements Serializable {
    
    private static final long serialVersionUI = 2L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Long ID_DEPTO;
    private String DESCRIPCION_DEPTO;
    
}
