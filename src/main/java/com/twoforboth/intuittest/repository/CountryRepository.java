package com.twoforboth.intuittest.repository;

import com.twoforboth.intuittest.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

    public Optional<Country> findByName(String countryName);

}
