package com.pastasciuttapizzaria.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ValorModel {

    private int tipo_sabor_id;

    private int tamanho_id_tamanho;

    private float valor;

}
