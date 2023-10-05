package com.alvaro.tp5.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "autor")
public class Autor extends BaseEntidad {
    @NotNull
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Column(name = "biografia")
    private String biografia;

    @NotNull
    @Column(name = "nombre")
    private String nombre;
}
