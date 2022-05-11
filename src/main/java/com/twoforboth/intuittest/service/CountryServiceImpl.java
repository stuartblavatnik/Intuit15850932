package com.twoforboth.intuittest.service;

import com.twoforboth.intuittest.entity.Country;
import com.twoforboth.intuittest.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<String> getAllCountryNames() {

        List<String> countryNames = new ArrayList<>();

        for(Country country : countryRepository.findAll()) {
            countryNames.add(country.getName());
        }

        return countryNames;
    }

    @Override
    public Country getCountryByName(String name) {
        Optional<Country> country = countryRepository.findByName(name);

        return country.isPresent() ? country.get() : new Country();

    }


}
