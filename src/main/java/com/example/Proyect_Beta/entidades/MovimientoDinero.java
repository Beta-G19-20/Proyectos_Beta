package com.example.Proyect_Beta.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;


@Entity
@Table(name="MovimientosDinero")

public class MovimientoDinero{

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idMovimiento",nullable = true)
    private int idMovimiento;

    @Column(name="monto",nullable = false)
    private double monto;

    @Column(name="concepto",nullable = false, length = 40)
    private String concepto;

    @Column(name="fecha",nullable = false, length = 15)
    private String fecha;

    @Column(name="usuario",nullable = false, length = 30)
    private String usuario;

    //@Column(unique = true,nullable = false,length = 30,name="empleado")
    //private Empleado empleado;

    /*@ManyToOne
    @JoinColumn(name="id_empleado",referencedColumnName = "idEmpleado")
    Empleado idEmpleado;
*/
   /* @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="id_empleado",nullable = false)
    private Empleado idEmpleado;*/

  /*  @ManyToOne (fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="idEmpresa",nullable = false)
    private Empresa idEmpresa;*/

    //
    //
    //    //CONSTRUCTOR

   /* public MovimientoDinero(int idMovimiento, double monto, String concepto, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.concepto = concepto;
        //this.empleado = empleado;
    }
*/

    public MovimientoDinero(int idMovimiento, double monto, String concepto, String fecha, String usuario) {
        this.idMovimiento = idMovimiento;
        this.monto = monto;
        this.concepto = concepto;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public MovimientoDinero() {
    }

    public int getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(int idMovimiento) {
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

   /* public Empleado getEmp() {
        return idEmpleado;
    }

    public void setEmp(Empleado id_empleado) {
        this.idEmpleado = id_empleado;
    }
*/
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}