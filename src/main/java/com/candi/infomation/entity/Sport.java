package com.candi.infomation.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sport")
public class Sport {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="s_name")
	private String sName;
	@Column(name="s_type")
	private String sType;
	@Column(name="players_req")
	private int playersReq;
	private String field;
	
	@OneToMany(mappedBy = "sport",fetch = FetchType.LAZY)
	private List<Player>players;
		

}
