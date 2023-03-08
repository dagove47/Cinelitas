/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.service;

import Cinelitas.entity.Pelicula;
import Cinelitas.repository.PeliculaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author dagov
 */
@Service
public class PeliculaService implements IPeliculaService {
    
    @Autowired
    private PeliculaRepository peliculaRepository;
    
    @Override
    public List<Pelicula> listMovie() {
        return (List<Pelicula>)peliculaRepository.findAll();
    }
    
}
