package org.bvn28065.modelo;

public class Album {

    private Integer id;
    private String titulo;
    private Artista artista;

    public Album() {

    }

    public Album(Integer id, String titulo, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.artista = artista;
    }

    public Integer getId() {
        return id;
    }

    public void SetId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }
}
