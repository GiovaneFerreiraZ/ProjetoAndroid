package com.example.rango.Model;

public class Comidas {
    private Integer id;
    private String comida1;
    private String comida2;
    private String comida3;

    public Comidas(Integer id,String comida1,String comida2,String comida3){
        this.id = id;
        this.comida1 = comida1;
        this.comida2 = comida2;
        this.comida3 = comida3;
    }
    public Integer getId(){
        return id;
    }
    public  String getComida1(){
        return  comida1;
    }
    public  String getComida2(){
        return  comida2;
    }
    public String getComida3(){
        return  comida3;
    }
}
