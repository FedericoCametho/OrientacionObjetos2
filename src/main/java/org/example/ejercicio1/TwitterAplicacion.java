package org.example.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TwitterAplicacion {

    private List<Usuario> usuarios;

    public TwitterAplicacion(){
        this.usuarios = new ArrayList<Usuario>();
    }

    public List<Usuario> getUsuarios(){
        return this.usuarios;
    }
    public void agregarUsuario(String username){
        if (this.buscarUsuario(username) != null){
            System.out.println("El nombre de usuario ya se encuentra registrado");
        } else {
            Usuario usu = new Usuario(username);
            this.usuarios.add(usu);
            System.out.println("El usuario se creo exitosamente");
        }
    }

    public void eliminarUsuario(String username){
        Usuario usu = this.buscarUsuario(username);
        if (usu != null){
            usu.borrarTweets();
            this.usuarios.remove(usu);
            System.out.println("El usuario fue eliminado correctamente y junto con sus respectivos tweets");
        } else {
            System.out.println("No se encontro el usuario solicitado");
        }
    }

    public Usuario buscarUsuario(String username){
        return this.usuarios.stream().filter( u -> u.getUsername().equals(username)).findAny().orElse(null);
    }

}
