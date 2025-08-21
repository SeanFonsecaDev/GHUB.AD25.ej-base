package miPrincipal;

import java.util.concurrent.atomic.AtomicBoolean;

public class Libro 
{
//atributos
    private String titulo;
    private String autor;
    private int ano;
//constructores
Public Libro()
{
this.titulo = "sin titulo";
this.autor = "sin autor";
this.ano = 0;
}
public Libro(String titulo, String autor, int ano)
{
this.titulo=titulo;
this.autor=autor;
this.ano=ano;
}
public String gettitulo(){
    return this.titulo;
}
public void settitulo(String titulo){
    this.titulo=titulo;
}


public String getautor(){
    return this.autor;
}
public void setautor(String autor){
    this.autor=autor;
}


public int getano(){
    return this.ano;
}
public void setano(int ano){
    this.ano=ano;
}
@Override 
public String toString(){
    return "libro: "+this.titulo+", "+this.autor+", "+this.ano;
}}