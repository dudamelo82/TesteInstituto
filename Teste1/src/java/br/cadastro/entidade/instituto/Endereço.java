
package br.cadastro.entidade.instituto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Endereço {
    private String rua;
    private String cidade;
    private String bairro;
    private String UF;
    private int numero;
    
    public String getRua(){
        return rua;
    }
    
    public void setRua(){
        this.rua = rua;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setCidade(){
        this.cidade = cidade;
    }
    
    public String getBairro(){
        return bairro;
    }
    
    public void setBairro(){
        this.bairro = bairro;
    }
    
    public String getUF(){
        return UF;
    }
    
    public void setUF(){
        this.UF = UF;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(){
        this.numero = numero;
    }
    
    
            
    
}
