package com.example.Proyect_Beta.entidades;



import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false, length = 40)
    private String correo;

    @Column(nullable = false,length = 30)
    private String rol;

    @ManyToOne
    @JoinColumn(name="id_empresa",referencedColumnName = "idEmp")
    private Empresa empresa;

    public Empleado()
    {
    }

    public Empleado(String nombre, String correo,  String rol, Empresa empresa)
    {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.empresa=empresa;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}// fin clase Empleado








/*package com.example.Proyect_Beta.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.*;

@Entity
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idEmpleado;

    @Column(unique = true,nullable = false, length = 40)
    private String correo;
    @Column(nullable = false, length = 40)
    private String nombre;

    @Column()
    private String rol;

   /* @ManyToOne
    @JoinColumn(name="id_Empresa",referencedColumnName = "idEmpresa")
    Empleado idEmpresa;*/

   /* @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "idEmpleado")
    private Set<MovimientoDinero> movimientoDineros;*/

    //private list<MovimientoDinero> movimientoDineros;


   /* public Empleado()
    {
    }

    public Empleado(int idEmpleado, String correo, String nombre, String rol) {
        this.idEmpleado = idEmpleado;
        this.correo = correo;
        this.nombre = nombre;

        this.rol = rol;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

   /* public Empleado getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empleado idEmpresa) {
        this.idEmpresa = idEmpresa;
    }*/
/*}// fin clase Empleado*/