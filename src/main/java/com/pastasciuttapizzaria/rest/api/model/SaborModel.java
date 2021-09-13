package com.pastasciuttapizzaria.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SaborModel {

    private int id;

    private String sabor;

    private int tipo_sabor;

}
