package com.example.Proyect_Beta.entidades;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpleado;

    @Column(unique = true,name="concepto",nullable = false, length = 40)
    private String correo;

    @Column(unique = true,name="concepto",nullable = false, length = 40)
    private String correo;

    @Column(unique = true,nullable = false,length = 30,name="empleado")
    private Empleado empleado;

    private String nombre;
    @Column(unique = true,nullable = false,length = 30)
    private String correo;

    @Column()
    private String rol;








}
