package com.ivan.generate.clazz.json.controller;

import com.ivan.generate.clazz.json.usecasses.dto.Address;
import com.ivan.generate.clazz.json.usecasses.dto.Country;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    @GetMapping(value = "/{addressId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Address> getAddress(@PathVariable Long addressId) {
        Address address = new Address();
        address.setId(addressId);
        address.setExtendedAddress("one");
        address.setStreetAddress("two");
        address.setLocality("three");
        Country country = new Country();
        country.setCode("BY");
        country.setName("Belarus");
        address.setCountry(country);
        return ResponseEntity.ok().body(address);
    }
}
