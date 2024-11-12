package com.jaum1981.dslist.repositories;

import com.jaum1981.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
