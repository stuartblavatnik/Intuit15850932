package com.twoforboth.intuittest.service;

import com.twoforboth.intuittest.entity.Country;

import java.util.List;

public interface CountryService {
    List<String> getAllCountryNames();

    Country getCountryByName(String name);

}
