package com.personal.demo.modeloMC;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NotasMC {

    @Id
    private int id;
    private String titulo;
    private String descripcion;
    private String fecha;
    private String usuario;

    public NotasMC(){ }

    public NotasMC(int id, String titulo, String descripcion, String fecha, String usuario){
        super();
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
}
