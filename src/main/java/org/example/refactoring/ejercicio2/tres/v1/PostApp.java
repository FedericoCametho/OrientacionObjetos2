package org.example.refactoring.ejercicio2.tres.v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PostApp {

    private List<Post> posts;

    public PostApp(){
        this.posts = new ArrayList<>();
    }

    /**
     * Retorna los últimos N posts que no pertenecen al usuario user
     */
    public List<Post> ultimosPosts(Usuario user, int cantidad) {

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
    }

}
