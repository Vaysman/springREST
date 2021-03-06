package com.springRest.demo.service;

import com.springRest.demo.model.Director;
import com.springRest.demo.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DirectorService {

    @Autowired
    private DirectorRepository directorRepository;

    public Director save(Director director) {
        return directorRepository.save(director);
    }

    public Director getById(Long id_director) {
        return directorRepository.findById(id_director).get();
    }

    public List<Director> findAll() {
        List<Director> directors = directorRepository.findAll();
        return directors != null ? directors : new ArrayList<>();
    }

    public void delete(Long id_director) {
        directorRepository.deleteById(id_director);
    }
}
