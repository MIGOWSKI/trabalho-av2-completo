/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.TRABALHOAV2.controller;

import br.com.TRABALHOAV2.model.Marca;
import br.com.TRABALHOAV2.repository.MarcaRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Lucas
 */
@Controller
public class MarcaController {
    @Autowired
    private MarcaRepository MarcaRepository;

    @GetMapping("/gerenciarMarcas")
    public String listarMarcas(Model model) {
        model.addAttribute("listaMarcas", MarcaRepository.findAll());
        return "gerenciar_Marcas";
    }

    @GetMapping("/novaMarca")
    public String novaMarca(Model model) {
        model.addAttribute("marca", new Marca());
        return "editar_marca";
    }

    @GetMapping("/editarMarca/{id}")
    public String editarMarca (@PathVariable("id") long idMarca, Model model) {
        Optional<Marca> marca = MarcaRepository.findById(idMarca);
        model.addAttribute("marca", marca.get());
        return "editar_marca";
    }

    @PostMapping("/salvarMarca")
    public String salvarMarca(Marca marca, BindingResult result) {
        if (result.hasErrors()) {
            return "editar_marca";
        }
        MarcaRepository.save(marca);
        return "redirect:/gerenciarMarcas";
    }

    @GetMapping("/excluirMarca/{id}")
    public String excluirMarca(@PathVariable("id") long idMarca) {
        MarcaRepository.deleteById(idMarca);
        return "redirect:/gerenciarMarcas";
    }
}


