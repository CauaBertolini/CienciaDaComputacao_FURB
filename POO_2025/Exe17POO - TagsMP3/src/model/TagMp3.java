package model;

public class TagMp3 {
    // Atributos privados [cite: 23, 24, 25, 27, 28, 29]
    private String titulo;
    private String artista;
    private String album;
    private int ano;
    private String comentario;
    private int numeroFaixa;
    private int genero;

    // Getters e Setters [cite: 30-43]
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }

    public int getNumeroFaixa() { return numeroFaixa; }
    public void setNumeroFaixa(int numeroFaixa) { this.numeroFaixa = numeroFaixa; }

    public int getGenero() { return genero; }
    public void setGenero(int genero) { this.genero = genero; }

    @Override
    public String toString() {
        return "Música: " + titulo + "\nArtista: " + artista +
                "\nÁlbum: " + album + "\nAno: " + ano +
                "\nFaixa: " + numeroFaixa + "\nComentário: " + comentario;
    }
}