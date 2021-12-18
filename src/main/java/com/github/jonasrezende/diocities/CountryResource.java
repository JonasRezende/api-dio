package com.github.jonasrezende.diocities;

import com.github.jonasrezende.diocities.countries.Country;
import com.github.jonasrezende.diocities.repository.CountryRepository;
import com.github.jonasrezende.diocities.countries.Country;
import com.github.jonasrezende.diocities.repository.CountryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {
    private CountryRepository repository;

    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Country> contries() {

        return repository.findAll();
    }

}