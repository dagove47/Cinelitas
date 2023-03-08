/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.controller;

import Cinelitas.entity.Pelicula;
import Cinelitas.entity.Sala;
import Cinelitas.service.IPeliculaService;
import Cinelitas.service.ISalaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author dagov
 */
@Controller
public class SalaController {
    
    @Autowired
    private ISalaService salaService;
    
    @Autowired
    private IPeliculaService peliculaService;
    
    @GetMapping("/sala")
    public String index(Model model) {
        List <Sala> listaSala = salaService.getAllSala();
        model.addAttribute("titulo", "Tabla Sala");
        model.addAttribute("sala", listaSala);
        return "salas";
    }
    
    @GetMapping("/salaN")
    public String crearSala(Model model) {
        List <Pelicula> listaPeliculas = peliculaService.listMovie();
        model.addAttribute("sala", new Sala());
        model.addAttribute("peliculas", listaPeliculas);
        return "crear";
    }
    
    @GetMapping("/delete/{id}")
    public String eliminarSala(@PathVariable("id") Long idSala) {
        salaService.delete(idSala);
        return "redirect:/sala";
    }
    
    @PostMapping("/save")
    public String guardarSala(@ModelAttribute Sala sala) {
        salaService.saveSala(sala);
        return "redirect:/sala";
    }
    
    @GetMapping("/editSala/{id}")
    public String editarSala(@PathVariable("id") Long idSala, Model model) {
        Sala sala = salaService.getSalaById(idSala);
        List<Pelicula>listaPeliculas = peliculaService.listMovie();
        model.addAttribute("sala", sala);
        model.addAttribute("peliculas", listaPeliculas);
        return "crear";
    }
    
}
