package com.example.Proyect_Beta.entidades;

import lombok.*;

import javax.persistence.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="MovimientosDinero")

public class MovimientoDinero{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idMovimiento;

    @Column(name="monto",nullable = false)
    private double monto;

    @Column(name="concepto",nullable = false, length = 40)
    private String concepto;

    @ManyToOne
    @JoinColumn(name="id_empleado",nullable = false,referencedColumnName = "idEmpleado")
    private Empleado empleadoM;

    @ManyToOne
    @JoinColumn(name="mov_empresa",nullable = false,referencedColumnName = "idEmp")
    private Empresa empresaM;



}