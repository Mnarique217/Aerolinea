package cr.ac.una.prograiv.agenda.domain;
// Generated May 25, 2017 9:24:05 PM by Hibernate Tools 4.3.1


import java.util.Date;


/**
 * Ciudad generated by hbm2java
 */
public class Ciudad  implements java.io.Serializable {


     private Integer pkId;
     private String nombre;
     private String ultUsuario;
     private Date ultModificacion;


    public Ciudad() {
    }

	
    public Ciudad(String nombre) {
        this.nombre = nombre;
    }
    public Ciudad(String nombre, String ultUsuario, Date ultModificacion) {
       this.nombre = nombre;
       this.ultUsuario = ultUsuario;
       this.ultModificacion = ultModificacion;

    }
   
    public Integer getPkId() {
        return this.pkId;
    }
    
    public void setPkId(Integer pkId) {
        this.pkId = pkId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUltUsuario() {
        return this.ultUsuario;
    }
    
    public void setUltUsuario(String ultUsuario) {
        this.ultUsuario = ultUsuario;
    }
    public Date getUltModificacion() {
        return this.ultModificacion;
    }
    
    public void setUltModificacion(Date ultModificacion) {
        this.ultModificacion = ultModificacion;
    }
}


