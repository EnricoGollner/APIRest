/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dev.enrico.apirest.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
essa classe usa o mecanismo de ferramentas do Spring para
prover uma forma fácil de interagir com dados da nossa aplicação  


a anotação Repository insere uma classe anônima gerenciada pela aplicação
que traz métodos para inserir, excluir etc entidades
do tipo Tarefa
 
 */

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    
}
