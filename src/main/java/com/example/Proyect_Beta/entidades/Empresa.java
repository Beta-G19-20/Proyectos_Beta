package com.example.Proyect_Beta.entidades;

import lombok.*;
import java.lang.*;
import javax.persistence.*;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="empresas")
public class Empresa {
    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEmp;
    @Column(unique = true,nullable = false,length = 30)
    private int nit;
    @Column(nullable = false,length = 30)
    private String nombreEmpresa;
    @Column(nullable = false, length = 25)
    private String direccion;
    @Column(nullable = false, length = 15)
    private String telefono;


    //CONSTRUCTOR



}
