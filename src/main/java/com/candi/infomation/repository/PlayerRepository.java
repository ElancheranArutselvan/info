package com.candi.infomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candi.infomation.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
