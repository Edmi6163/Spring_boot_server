package com.TwebPostgres.TwebProject.repository;

import com.TwebPostgres.TwebProject.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {


    //sono implementati i metodi di default di JpaRepository che permettono di fare query al database
    //per esempio, se volessi fare una query per cercare un giocatore per nome, dovrei scrivere un metodo


}
