package com.player.crud.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.player.crud.entity.Player;

//Customer repo extending JpaRepository
public interface PlayerRepositary extends JpaRepository<Player, Integer> {

	@Query("select p from Player p where p.playerName = ?1")
	List<Player> getPlayername(String playerName);

	@Query("select p from Player p where p.age = ?1")
	Player getAge(int age);

	@Query("select p from Player p where p.nationality = ?1")
	List<Player> getNationality(String nationality);

	@Query("select p from Player p where p.role = ?1")
	List<Player> getRole(String role);

	@Query("select p from Player p where p.battingStyle = ?1")
	List<Player> getBattingstyle(String battingStyle);

	@Query("select p from Player p where p.bowlingStyle = ?1")
	List<Player> getBowlingstyle(String bowlingStyle);

}