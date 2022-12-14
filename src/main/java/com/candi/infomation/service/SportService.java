package com.candi.infomation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.candi.infomation.entity.Player;
import com.candi.infomation.entity.Sport;
import com.candi.infomation.repository.PlayerRepository;
import com.candi.infomation.repository.SportRepository;

@Service

public class SportService {

	@Autowired
	private PlayerRepository playerRepository;
	@Autowired
	private SportRepository sportRepository;
	
	  public String save(Sport sport){
	       sportRepository.saveAndFlush(sport);
	        for(Player obj: sport.getPlayers()){
	            obj.setSport(sport);
	           playerRepository.saveAndFlush(obj);
	        }
	        return "Saved";

	    }

	    public List<Sport> getAll(){
	        return sportRepository.findAll();
	    }

	    public Optional<Sport> getById(int sportId){
	        return sportRepository.findById(sportId);

	    }
	    public String deleteById(int sportId){
	        sportRepository.deleteById(sportId);
	        return "deleted";
	    }
}
