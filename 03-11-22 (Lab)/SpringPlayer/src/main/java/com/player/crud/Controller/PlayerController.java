package com.player.crud.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.player.crud.entity.Player;
import com.player.crud.service.PlayerService;

//Player controller to handling all rest api incoming request
@RestController
public class PlayerController {

	@Autowired
	private PlayerService ps;

	// save Player save in db table using rest api PostMapping
	@PostMapping("/saveP")
	public ResponseEntity<Player> savePlayer(@Valid @RequestBody Player player) {
		return new ResponseEntity<Player>(ps.savePlayer(player), HttpStatus.CREATED);
	}

	// fetch Player details from the db table using rest api GetMapping
	@GetMapping("/getAllP")
	public List<Player> getAll() {
		return ps.getAllPlayers();
	}

	// fetch Player details from db table using rest api GetMapping based on id
	@GetMapping("/getP/{pid}")
	public ResponseEntity<Player> getU(@PathVariable("pid") int pid) {
		return new ResponseEntity<Player>(ps.getPlayerById(pid), HttpStatus.OK);
	}

	// update Player details in db table using rest api PutMapping based on id
	@PutMapping("/updateP/{pid}")
	public ResponseEntity<Player> updatePlayer(@PathVariable("pid") int pid, @RequestBody Player Player) {
		return new ResponseEntity<Player>(ps.updatePlayerById(Player, pid), HttpStatus.OK);
	}

	// delete Player details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteP/{pid}")
	public ResponseEntity<String> deletePlayer(@PathVariable("pid") int pid) {
		ps.deletePlayerById(pid);
		return new ResponseEntity<String>("Delete Player succesfully", HttpStatus.OK);
	}

	// fetch player details from db table using rest api GetMapping based on name
	@GetMapping("/getpn/{playerName}")
	List<Player> getPlayername(String playerName) {
		return null;
	}

	// fetch player details from db table using rest api GetMapping based on age
	@GetMapping("/getage/{age}")
	Player getAge(int age) {
		return null;
	}

	// fetch player details from db table using rest api GetMapping based on
	// nationality
	@GetMapping("/getnationality/{nationality}")
	List<Player> getNationality(String nationality) {
		return null;
	}

	// fetch player details from db table using rest api GetMapping based on role
	@GetMapping("/getrole/{role}")
	List<Player> getRole(String role) {
		return null;
	}

	// fetch player details from db table using rest api GetMapping based on
	// batting style
	@GetMapping("/getbat/{battingStyle}")
	List<Player> getBattingstyle(String battingStyle) {
		return null;
	}

	// fetch player details from db table using rest api GetMapping based on
	// bowling style
	@GetMapping("/getball/{bowlingStyle}")
	List<Player> getBowlingstyle(String bowlingStyle) {
		return null;
	}

}