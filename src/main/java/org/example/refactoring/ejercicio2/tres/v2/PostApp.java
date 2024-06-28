package org.example.refactoring.ejercicio2.tres.v2;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PostApp {

    private List<Post> posts;

    public PostApp(){
        this.posts = new ArrayList<>();
    }

    /**
     * Retorna los últimos N posts que no pertenecen al usuario user
     */
    public List<Post> ultimosPostsOtrosUsuarios(Usuario user, int cantidad) {

        /*
        List<Post> postsOtrosUsuarios = new ArrayList<>();
        for (Post post : this.posts) {
            if (!post.getUsuario().equals(user)) {
                postsOtrosUsuarios.add(post);
            }
        }


        // ordena los posts por fecha
        for (int i = 0; i < postsOtrosUsuarios.size(); i++) {
            int masNuevo = i;
            for(int j= i +1; j < postsOtrosUsuarios.size(); j++) {
                if (postsOtrosUsuarios.get(j).getFecha().isAfter(
                        postsOtrosUsuarios.get(masNuevo).getFecha())) {
                    masNuevo = j;
                }
            }
            Post unPost = postsOtrosUsuarios.set(i,postsOtrosUsuarios.get(masNuevo));
            postsOtrosUsuarios.set(masNuevo, unPost);
        }

        List<Post> ultimosPosts = new ArrayList<Post>();
        int index = 0;
        Iterator<Post> postIterator = postsOtrosUsuarios.iterator();
        while (postIterator.hasNext() &&  index < cantidad) {
            ultimosPosts.add(postIterator.next());
        }
        return ultimosPosts;
*********************************************************************************************

         REINVENTA LA RUEDA -> se puede filtrar la coleccion usando streams
                            se puede ordenar por fecha de publicacion con el sorted
                            se puede limitar la cantidad de resultados usando limit(cantidad)

        NOMBRE PODRIA SER MAS DESCRIPTIVO
                    -> se reemplaza el nombre ultimosPost por ultimosPostsOtrosUsuarios

        FEATURE ENVY / ENVIDIA DE ATRIBUTOS
                    -> la responsabilidad de validar si el post fue realizado por un usuario u otro deberia
                        ser de la clase Post y no de PostApp, dado que el atributo usuario le pertenece a esa clase

*********************************************************************************************

         */

        return this.posts.stream()
                .filter(p -> !p.isUser(user))
                .sorted(Comparator.comparing(Post::getFecha).reversed())
                .limit(cantidad)
                .toList();

    }

}
