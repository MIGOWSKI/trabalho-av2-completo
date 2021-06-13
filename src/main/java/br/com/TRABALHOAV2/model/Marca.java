/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.TRABALHOAV2.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas
 */
@Entity
public class Marca implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long idMarca;
    private String nome;

    /**
     * @return the idProduto
     */
    public long getIdMarca() {
        return idMarca;
    }

    /**
     * @param idMarca the idProduto to set
     */
    public void setIdMarca(long idMarca) {
        this.idMarca = idMarca;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
