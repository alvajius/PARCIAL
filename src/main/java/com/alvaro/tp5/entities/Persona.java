package com.alvaro.tp5.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class  Persona extends BaseEntidad {

  @NotNull
  @Column(name = "apellido")
  private String apellido;

  @NotNull
  @Column(name = "nombre")
  private String nombre;

  @NotNull
  @Column(name = "dni")
  private int dni;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "fk_domicilio")
  private Domicilio domicilio;

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
  @JoinTable(
          name = "persona_libro",
          joinColumns = @JoinColumn(name = "persona_id"),
          inverseJoinColumns = @JoinColumn(name= "libro_id")
  )
  private List<Libro> libros = new ArrayList<>();

}
