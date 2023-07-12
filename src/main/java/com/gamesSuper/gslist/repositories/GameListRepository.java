package com.gamesSuper.gslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamesSuper.gslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
}