/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaestudiantes;

/**
 *
 * @author Wendy Soto
 */
public class Estudiante {
    private String Nombre;
    private String Apellido;
    private int Nota1;
    private int Nota2;
    private int Nota3;
    float promedio=0;
    float suma=0;
    public Estudiante(String Nombre, String Apellido, int Nota1, int Nota2, int Nota3) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNota1() {
        return Nota1;
    }

    public void setNota1(int Nota1) {
        this.Nota1 = Nota1;
    }

    public int getNota2() {
        return Nota2;
    }

    public void setNota2(int Nota2) {
        this.Nota2 = Nota2;
    }

    public int getNota3() {
        return Nota3;
    }

    public void setNota3(int Nota3) {
        this.Nota3 = Nota3;
    }

    @Override
    public String toString() {
        
        suma=Nota1+Nota2+Nota3;
        promedio=suma/3;
        return  Nombre +"          " +
                Apellido +"          " + 
                Nota1  +"          "  +
                Nota2 +"          "+
                Nota3  +"          "+
                promedio ;
    }

    
    
    
}
