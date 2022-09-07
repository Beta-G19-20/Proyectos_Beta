package com.example.Proyect_Beta.entidades;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name="MovimientosDinero")

public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMovimiento;

    @Column(name="concepto",nullable = false)
    private double monto;

    @Column(name="concepto",nullable = false, length = 40)
    private String concepto;

    @Column(unique = true,nullable = false,length = 30,name="empleado")
    private Empleado empleado;

    //CONSTRUCTOR


    public MovimientoDinero(long idMovimiento, double monto, String concepto, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
    }

    public MovimientoDinero() {
    }

    //GET & SET


    public long getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(long idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }



}
