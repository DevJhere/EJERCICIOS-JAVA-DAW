package ejercicio11.controller;

import ejercicio11.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class GestorAgenda {

    private List<Usuario> listaContactos;
    private Operaciones operaciones;

    //Constructor
    public GestorAgenda() {
        operaciones = new Operaciones();
        listaContactos = new ArrayList<>();
    }

    //Getters y setters
    public List<Usuario> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Usuario> listaContactos) {
        this.listaContactos = listaContactos;
    }


    //Funcionalidades

    //Agregar usuario
    public void agregarContacto(Usuario usuario) {
        this.listaContactos.add(usuario); //Se agrega el usuario
        System.out.println("Usuario creado con éxito.");
        System.out.println();
    }

    //Listar usuario
    public void listarContacto(){
        listaContactos.forEach(Usuario::mostrarDatos);
    }

    //Exportar Datos
    public void exportarDatos(){
        listaContactos.forEach(usuario ->operaciones.exportarUsuarios(usuario)); //Realizar exportación de datos de Usuario.
        System.out.println("✅ Todos los contactos se han exportado correctamente.");
    }
}
