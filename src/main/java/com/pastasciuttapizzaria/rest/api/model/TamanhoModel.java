package com.pastasciuttapizzaria.rest.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TamanhoModel {

    int id_tamanho;

    String tamanho;

    String sigla;
}
