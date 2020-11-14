package com.estudo.cursomc.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.cursomc.model.entity.CategoriaEntity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "Categoria")
@RestController
@RequestMapping(value = "/categorias")
public class CategoriaController {

    @GetMapping()
    @ApiOperation(value = "Realizar consulta de categorias", response = CategoriaEntity.class)
    public ResponseEntity<CategoriaEntity> listar() {
        CategoriaEntity dto = new CategoriaEntity();
        dto.setId(1);
        dto.setNome("Duda");

        return ResponseEntity.ok(dto);
    }
}
