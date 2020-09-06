package br.desen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.desen.models.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {
 // interface repositorio que será injetado pelo sring mvc	
}
