
package PqUd8;


public class Alumno 
{
    //ATRIBUTOS
    private String codigo;
    private int nota;

    //CONSTRUCTOR
    public Alumno(String pCodigo, int pNota) 
    {
        this.codigo = pCodigo;
        this.nota = pNota;
    }
    
    //GETTERS & SETTERS
    public String getCodigo() 
    {
        return this.codigo;
    }

    public void setCodigo(String pCodigo) 
    {
        this.codigo = pCodigo;
    }

    public int getNota() 
    {
        return this.nota;
    }

    public void setNota(int pNota) 
    {
        this.nota = pNota;
    }

    @Override
    public String toString() 
    {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", nota=" + nota +
                '}';
    }
    
}