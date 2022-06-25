/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gabs
 */
public class Analista {
    private int idUsu;
    private String nomeUsu;
    private String senhaUsu;
    private int acessoUsu;
    
    public Analista(){}
    
    public Analista(int idUsu, String nomeUsu,String senhaUsu, int acessoUsu ){
    
        this.idUsu = idUsu;
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
        this.acessoUsu = acessoUsu;        
   
    }
    
    
    public Analista( String nomeUsu,String senhaUsu, int acessoUsu ){
         
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
        this.acessoUsu = acessoUsu;        
   
    }
    //Setters 
    public void setIdUsu(int idUsu) {
        this.idUsu = idUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public void setAcessoUsu(int acessoUsu) {
        this.acessoUsu = acessoUsu;
    }

    //Getters
    public int getIdUsu() {
        return idUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public int getAcessoUsu() {
        return acessoUsu;
    }
   
    
}
