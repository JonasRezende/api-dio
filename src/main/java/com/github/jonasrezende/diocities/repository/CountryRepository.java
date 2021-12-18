package com.github.jonasrezende.diocities.repository;

import com.github.jonasrezende.diocities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
