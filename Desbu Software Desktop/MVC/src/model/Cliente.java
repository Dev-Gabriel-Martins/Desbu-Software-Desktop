/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * cod nome cnpj endereco telefone cel ema
 * @author gabs
 */
public class Cliente {
    
    private int idCli;
    private String Cnpj;
    private String nomeCli;
    private String enderecoCli;
    private String telefoneCli;
    private String celularCli;
    private String emailCli;
    
    public Cliente(){}
      public Cliente(int idCli, String nomeCli){
      this.idCli = idCli;
      this.nomeCli = nomeCli;
      }
    
    public Cliente(int idCli, String Cnpj, String nomeCli, String enderecoCli,String telefoneCli, String celularCli, String emailCli){
    this.idCli = idCli;    
    this.Cnpj = Cnpj;
    this.nomeCli = nomeCli;
    this.enderecoCli = enderecoCli;
    this.telefoneCli = telefoneCli;
    this.celularCli = celularCli;
    this.emailCli = emailCli;
    
    }
    
    //Sobrecarga sem o idCli
    public Cliente(String Cnpj, String nomeCli, String enderecoCli,String telefoneCli, String celularCli, String emailCli){
   
    this.Cnpj = Cnpj;
    this.nomeCli = nomeCli;
    this.enderecoCli = enderecoCli;
    this.telefoneCli = telefoneCli;
    this.celularCli = celularCli;
    this.emailCli = emailCli;
    
    }
    
    public Cliente(String nomeCli, String enderecoCli,String telefoneCli, String celularCli, String emailCli){
   
    this.nomeCli = nomeCli;
    this.enderecoCli = enderecoCli;
    this.telefoneCli = telefoneCli;
    this.celularCli = celularCli;
    this.emailCli = emailCli;
    
    }

   
    public void setCnpj(String Cnpj) {
        this.Cnpj = Cnpj;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public void setEnderecoCli(String enderecoCli) {
        this.enderecoCli = enderecoCli;
    }

    public void setTelefoneCli(String telefoneCli) {
        this.telefoneCli = telefoneCli;
    }

    public void setCelularCli(String celularCli) {
        this.celularCli = celularCli;
    }

    public void setEmailCli(String emailCli) {
        this.emailCli = emailCli;
    }

    public int getIdCli() {
        return idCli;
    }

    public String getCnpj() {
        return Cnpj;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public String getEnderecoCli() {
        return enderecoCli;
    }

    public String getTelefoneCli() {
        return telefoneCli;
    }

    public String getCelularCli() {
        return celularCli;
    }

    public String getEmailCli() {
        return emailCli;
    }
    
    
}
