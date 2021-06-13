/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.TRABALHOAV2.repository;

import br.com.TRABALHOAV2.model.Marca;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Lucas
 */
public interface MarcaRepository extends CrudRepository<Marca,Long> {
    
}
