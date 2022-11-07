package com.player.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player { // entity class

	// declare instances variables
	@Id
	private int pid;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter name")
	private String playerName;

	@Column(length = 2, nullable = false)
	@NotNull(message = "please enter age")
	private int age;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "please enter nationality")
	private String nationality;

	@Column(length = 20, nullable = false)
	@NotBlank(message = "please enter player role")
	private String role;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "enter batting style")
	private String battingStyle;

	@Column(length = 30, nullable = false)
	@NotBlank(message = "enter bowling style")
	private String bowlingStyle;

}