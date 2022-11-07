package com.player.crud.service;

import java.util.List;

import com.player.crud.entity.Player;

//abstract method for performing CRUD on Player entity
public interface PlayerService {

	// saving details of Player entity
	Player savePlayer(Player player);

	// getting all details of Player
	List<Player> getAllPlayers();

	// getting details of Player based on pid
	Player getPlayerById(int pid);

	// getting details of Player based on pid & change mentioned details
	Player updatePlayerById(Player player, int pid);

	// getting details of Customer based on pid & delete mentioned details
	void deletePlayerById(int pid);

	List<Player> getPlayername(String playerName);

	Player getAge(int age);

	List<Player> getNationality(String nationality);

	List<Player> getRole(String role);

	List<Player> getBattingstyle(String battingStyle);

	List<Player> getBowlingstyle(String bowlingStyle);

}