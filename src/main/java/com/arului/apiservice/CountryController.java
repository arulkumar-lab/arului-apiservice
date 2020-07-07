package com.arului.apiservice;

import com.arului.apiservice.modal.Country;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class CountryController {

    private static final String TEMPLATE = "Hello, %s!";

    @RequestMapping ("/country")
    public HttpEntity< Country > country (
            @RequestParam (value = "name", defaultValue = "World") String name ) {

        Country country = new Country (String.format (TEMPLATE, name));
        country.add (linkTo (methodOn (CountryController.class).country (name)).withSelfRel ( ));

        return new ResponseEntity<> (country, HttpStatus.OK);
    }
}