package com.polianachagas.flashcards.infrastructure.cards;

import com.polianachagas.flashcards.core.domain.Flashcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlashcardsRepository extends JpaRepository<Flashcard, Long> {

}
