/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.service;

import Cinelitas.entity.Sala;
import java.util.List;

/**
 *
 * @author dagov
 */
public interface ISalaService {
    public List<Sala> getAllSala ();
    public Sala getSalaById (long id);
    public void saveSala (Sala sala);
    public void delete (long id);
}
