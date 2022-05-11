package com.twoforboth.intuittest.controller;

import com.twoforboth.intuittest.entity.Country;
import com.twoforboth.intuittest.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public ResponseEntity<List<String>> getAllCountries() {
        return ResponseEntity.ok(countryService.getAllCountryNames());
    }

    @GetMapping("/country")
    public ResponseEntity<Country> getCountryByString(
            @RequestParam("name") String name) {

        return ResponseEntity.ok(countryService.getCountryByName(name));
    }

}
