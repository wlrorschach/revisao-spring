package com.estudo.cursomc.model.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class CategoriaEntity implements Serializable {
    private static final long serialVersionUID = -1926276851394066944L;

//    @Id
//    @Column(name = "ID_CATEGORIA")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
//    @Column(name = "NOME")
    private String nome;
}
