package com.example.Proyect_Beta.entidades;

import javax.persistence.*;


@Entity
@Table(name="empresas")
public class Empresa {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmpresa;
    @Column(unique = true,nullable = false,length = 30)
    private String nit;
    @Column(unique = true,nullable = false,length = 30)
    private String nombreEmpresa;
    @Column()
    private String direccion;
    @Column()
    private String telefono;


    //CONSTRUCTOR

    public Empresa(String nit, String nombreEmpresa, String direccion, String telefono) {
        this.nit = nit;
        this.nombreEmpresa = nombreEmpresa;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Empresa() {
    }

    //METODOS

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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }





}
