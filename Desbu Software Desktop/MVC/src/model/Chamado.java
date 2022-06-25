/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabs
 */
public class Chamado {
        
        private int idCham;
        private String descAberturaCham; 
        private String descEncerramentoCham;
        private int estadoCham;
        private String prioridadeCham;
        private int idCli;
        
     public Chamado(){}
   
    
    
    
    public Chamado( int idCham,String descEncerramentoCham, int idCli){
    
    this.idCham = idCham;
    this.descEncerramentoCham = descEncerramentoCham;
    this.idCli = idCli;
    
    
   }
        
    public Chamado(int idCham,String descAberturaCham,String descEncerramentoCham, int estadoCham, String prioridadeCham ){
    this.idCham = idCham;
    this.descAberturaCham = descAberturaCham;
    this.descEncerramentoCham = descEncerramentoCham;
    this.estadoCham = estadoCham;
    this.prioridadeCham = prioridadeCham;
    
   }
   
   public Chamado(String descAberturaCham, int estadoCham, String prioridadeCham ){
  
    this.descAberturaCham = descAberturaCham;
    this.estadoCham = estadoCham;
    this.prioridadeCham = prioridadeCham;
    
   }
   public Chamado(int idCham,String descAberturaCham, int estadoCham, String prioridadeCham ){
    this.idCham = idCham;
    this.descAberturaCham = descAberturaCham;
    this.estadoCham = estadoCham;
    this.prioridadeCham = prioridadeCham;
    
   }
   
   public Chamado(int idCham,String descAberturaCham,String prioridadeCham, int idCli ){
    this.idCham = idCham;   
    this.descAberturaCham = descAberturaCham;
    this.prioridadeCham = prioridadeCham;
    this.idCli = idCli;
    
   }

    

    public void setIdCham(int idCham) {
        this.idCham = idCham;
    }

    public void setDescAberturaCham(String descAberturaCham) {
        this.descAberturaCham = descAberturaCham;
    }

    public void setDescEncerramentoCham(String descEncerramentoCham) {
        this.descEncerramentoCham = descEncerramentoCham;
    }

    public void setEstadoCham(int estadoCham) {
        this.estadoCham = estadoCham;
    }

    public void setPrioridadeCham(String prioridadeCham) {
        this.prioridadeCham = prioridadeCham;
    }

    public int getIdCham() {
        return idCham;
    }

    public String getDescAberturaCham() {
        return descAberturaCham;
    }

    public String getDescEncerramentoCham() {
        return descEncerramentoCham;
    }

    public int getEstadoCham() {
        return estadoCham;
    }

    public String getPrioridadeCham() {
        return prioridadeCham;
    }
    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }
   
   
   
}
