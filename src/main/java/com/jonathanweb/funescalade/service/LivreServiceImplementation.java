package com.jonathanweb.funescalade.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathanweb.funescalade.model.Genre;
import com.jonathanweb.funescalade.model.Livre;
import com.jonathanweb.funescalade.repository.LivreRepository;

@Service
public class LivreServiceImplementation implements LivreServiceInterface {
	
	@Autowired
	protected LivreRepository livreRepository;
	
	@Autowired
	protected GenreServiceHelper genreServiceHelper;

	public Livre saveLivre(Livre livre) {
		
		return livreRepository.save(livre);
	}

	public Boolean deleteLivre(Long livreId) {
		Livre livre =livreRepository.getOne(livreId);
		if(livre !=null){
			livreRepository.delete(livre);
			 return true;
		}
		return false;
	}

	public Livre editLivre(Livre livre) {
		return livreRepository.save(livre);
	}

	public Livre findLivre(Long livreId) {
	
		return livreRepository.getOne(livreId);
	}

	public List<Livre> getAllLivres() {
	
		return  livreRepository.findAll();
		
	}

	public List<Genre> getAllGenres() {
		
		return genreServiceHelper.findAll();
	}

}