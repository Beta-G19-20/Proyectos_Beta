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
@Table(name="empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long idEmpleado;

    @Column(nullable = false, length = 40)
    private String nombre;

    @Column(nullable = false, length = 40, unique=true)
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Rol_Empleado rol;

    @ManyToOne
    @JoinColumn(name="id_empresa",referencedColumnName = "idEmp")
    private Empresa empresaE;


}// fin clase Empleado







