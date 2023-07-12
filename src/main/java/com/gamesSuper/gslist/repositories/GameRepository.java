package com.gamesSuper.gslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesSuper.gslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
