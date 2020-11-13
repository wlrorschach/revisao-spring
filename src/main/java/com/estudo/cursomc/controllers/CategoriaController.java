package com.estudo.cursomc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Categoria")
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping()
    @ApiOperation(value = "Realizar consulta de categorias", response = String.class)
    public String listar() {
        return "Rest esta fucnionando!";
    }
}
