package com.example.Proyect_Beta.entidades;

import javax.persistence.*;


@Entity
@Table(name="empresas")
public class Empresa {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmp;
    @Column(unique = true,nullable = false,length = 30)
    private int nit;
    @Column(unique = true,nullable = false,length = 30)
    private String nombreEmpresa;
    @Column(nullable = false, length = 25)
    private String direccion;
    @Column(nullable = false, length = 15)
    private String telefono;

    //CONSTRUCTOR

    public Empresa(int idEmp, int nit, String nombreEmpresa, String direccion, String telefono) {
        this.idEmp = idEmp;
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Empresa() {
    }

    //METODOS


    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
