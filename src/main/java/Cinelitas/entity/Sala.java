/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cinelitas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author dagov
 */
@Entity
@Table (name="salas")
public class Sala implements Serializable {
        @Id
        @GeneratedValue (strategy=GenerationType.IDENTITY)
        private long id;
        private String sala;
        private long capacidad;
        
        @ManyToOne
        @JoinColumn (name="peliculas_id")
        private Pelicula pelicula;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getSala() {
            return sala;
        }

        public void setSala(String sala) {
            this.sala = sala;
        }

        public long getCapacidad() {
            return capacidad;
        }

        public void setCapacidad(long capacidad) {
            this.capacidad = capacidad;
        }

        public Pelicula getPelicula() {
            return pelicula;
        }

        public void setPelicula(Pelicula pelicula) {
            this.pelicula = pelicula;
        }
        
}
