package org.example.ejercicio1;

public class ReTweet extends Tweet{

        private Tweet origen;

        public ReTweet (String contenido, Tweet origen){
            super(contenido);
            this.origen = origen;
        }

    public Tweet getOrigen() {
        return origen;
    }

    public void setOrigen(Tweet origen) {
        this.origen = origen;
    }

    public void borradoLogicoReTweet(){
            this.origen = null;
            this.setContenido(this.getContenido() + " *El contenido del tweet original ha sido borrado");
    }
}
