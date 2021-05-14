package com.pets.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "pet_status")
@Proxy(lazy = false)
public class PetStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pet_status_id")
	private int pet_status_id;

	@Column(name = "pet_status", length = 15, unique = true)
	private String pet_status;

	public PetStatus() {
	}
}
