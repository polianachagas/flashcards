package com.polianachagas.flashcards.core.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Category {
	
	@Id
	@GeneratedValue
	private Long id;
	String name;
	
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "category_id", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Deck> decks;

}
