package main.java.com.example.Sprint2.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Movimiento_Dinero")

public class MovimientoDinero {
    @Id
    private double monto;

    @Column(name="concepto")
    private String concepto;

    @Column(name="empleado")
    private empleado empleado;

    public MovimientoDinero(double monto, String concepto, empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.empleado = empleado;
    }

    public MovimientoDinero() {
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

    public empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(empleado empleado) {
        this.empleado = empleado;
    }

}
