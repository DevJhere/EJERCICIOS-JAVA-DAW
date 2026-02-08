package ejercicio1.controller;

import ejercicio1.model.Llamada;

import java.util.ArrayList;

public class Centralita {
    //Atributos
    private ArrayList<Llamada> listaLlamadas;
    private double caja;

    //Constructor
    public Centralita(){
        this.listaLlamadas =  new ArrayList<>();
    }

    //Metodos
    public void registrarLlamadas(Llamada llamada){
        listaLlamadas.add(llamada);
        //Vamos registrando las llamadas y se van sumando
        caja += llamada.getCoste();
        System.out.println("Llamada registrada correctamente");
    }

    public void mostrarLlamadas(){
        System.out.println("Llamadas totales: " +  listaLlamadas.size());

        //Validamos si la lista está vacia o no
        if (!listaLlamadas.isEmpty()){
            for (Llamada llamada:listaLlamadas){
                llamada.mostrarDatos();
            }
        }else {
            System.out.println("Llamadas no encontrados");
        }

    }

    public void mostrarCaja(){
        System.out.println("Beneficios totales: " +caja);
    }
}
