package com.boticaverde.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boticaverde.services.DolenciasService;

@RestController
@RequestMapping("api/dolencias")

public class DolenciasController {
    @Autowired
    private DolenciasService dolenciasService;

    @GetMapping
    public List<DolenciasResponse> getAllDolencias() {
        return dolenciasService.getAllDolencias();
    }
}