
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yael_
 */
public class Deuda implements Serializable {
    private String Acreedor, Titulo;
    private int Monto;

    public Deuda(String Acreedor, String Titulo, int Monto) {
        this.Acreedor = Acreedor;
        this.Titulo = Titulo;
        this.Monto = Monto;
    }//Constuctor

    public int getMonto() {
        return Monto;
    }

    public void setMonto(int Monto) {
        this.Monto = Monto;
    }

    public String getAcreedor() {
        return Acreedor;
    }

    public void setAcreedor(String Acreedor) {
        this.Acreedor = Acreedor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return  "Acreedor: " + Acreedor + "\n Titulo: " + Titulo + "\n Monto: " + Monto;
    }
    
}
