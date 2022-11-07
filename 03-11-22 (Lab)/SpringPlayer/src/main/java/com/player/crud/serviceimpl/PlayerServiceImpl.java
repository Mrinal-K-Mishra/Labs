package com.player.crud.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.player.crud.entity.Player;
import com.player.crud.exception.PlayerNotFoundException;
import com.player.crud.repositary.PlayerRepositary;
import com.player.crud.service.PlayerService;

@Service
public class PlayerServiceImpl implements PlayerService {
	// implements all method of Player service
	@Autowired
	PlayerRepositary prepo;

	// saving Player details using save() if jpaRepositary
	@Override
	public Player savePlayer(Player player) {

		return prepo.save(player);
	}

	// fetching all player details using finalAll() of JpaRepository
	@Override
	public List<Player> getAllPlayers() {

		return prepo.findAll();
	}

	// fetching player details based on id using findById() of JpaRepository,
	// if not found then throw exception
	@Override
	public Player getPlayerById(int pid) {

		return prepo.findById(pid).orElseThrow(() -> new PlayerNotFoundException("no player exists in table"));
	}
	// fetching player details based on id using findById() of JpaRepository,
	// if not found then throw exception
	// update age & role of player

	@Override
	public Player updatePlayerById(Player player, int pid) {

		Player newPlayer = prepo.findById(pid)
				.orElseThrow(() -> new PlayerNotFoundException("no player exsits in table"));
		newPlayer.setAge(player.getAge());
		newPlayer.setRole(player.getRole());
		prepo.save(newPlayer);
		return newPlayer;
	}
	// delete player details based on id using findById() of JpaRepository,
	// if not found then throw exception

	@Override
	public void deletePlayerById(int pid) {

		prepo.findById(pid).orElseThrow(() -> new PlayerNotFoundException("no player exists in table"));
		prepo.deleteById(pid);
	}

	@Override
	public List<Player> getPlayername(String playerName) {

		return prepo.getPlayername(playerName);
	}

	@Override
	public Player getAge(int age) {

		return prepo.getAge(age);
	}

	@Override
	public List<Player> getNationality(String nationality) {

		return prepo.getNationality(nationality);
	}

	@Override
	public List<Player> getRole(String role) {

		return prepo.getRole(role);
	}

	@Override
	public List<Player> getBattingstyle(String battingStyle) {

		return prepo.getBattingstyle(battingStyle);
	}

	@Override
	public List<Player> getBowlingstyle(String bowlingStyle) {

		return prepo.getBowlingstyle(bowlingStyle);
	}

}