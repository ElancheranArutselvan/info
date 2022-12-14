package com.candi.infomation.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.candi.infomation.entity.Sport;
import com.candi.infomation.service.SportService;

@RestController
@RequestMapping("/route")
public class SportsController {
	
	@Autowired
	private SportService sportService;
	
	@PostMapping("/saveSport")
    public String save(@RequestBody Sport sport) {
        sportService.save(sport);
        return "saved";
    }

    @GetMapping("/getSport")
    public List<Sport> getAll() {
       return sportService.getAll();
    }
    @GetMapping("/getSport/{}")
    public Optional<Sport> getById(@PathVariable int sportId) {
        return sportService.getById(sportId);
    }
    @PutMapping("/updateSport/{sportId}")
    public String update(@PathVariable int sportId,@RequestBody Sport sport){
       sportService.save(sport);
        return "Updated";
    }

    @DeleteMapping("/deleteSport/{sportId}")
    public String delete(@PathVariable int sportId){
        sportService.deleteById(sportId);
        return "deleted";
    }

}
