package com.example.lab3.entity;


import jakarta.persistence.*;
import jdk.jfr.Enabled;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Integer edad;
    private String genero;
    private String diagnostico;
    private String fecha_cita;
    private Integer numero_habitacion;
    private Integer doctor_id;
    private Integer hospital_id;


}
