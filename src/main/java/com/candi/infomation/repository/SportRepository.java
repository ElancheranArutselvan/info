package com.candi.infomation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candi.infomation.entity.Sport;

public interface SportRepository extends JpaRepository<Sport, Integer> {

}
