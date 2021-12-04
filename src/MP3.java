

public class MP3 {
    private String titulo_musica;
    private String nome_album;
    private String compositor;
    private String interprete;
    private int ano_alb;
    private int tamanho;

    /* Construtores */

    public MP3(String titulo_musica, String nome_album, String compositor, String interprete, int ano_alb, int tamanho) {
        this.titulo_musica = titulo_musica;
        this.nome_album = nome_album;
        this.compositor = compositor;
        this.interprete = interprete;
        this.ano_alb = ano_alb;
        this.tamanho = tamanho;
    }

    /*Setters */

    public void setTitulo_musica(String titulo_musica) {
        this.titulo_musica = titulo_musica;
    }

    public void setNome_album(String nome_album) {
        this.nome_album = nome_album;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void setInterprete(String interprete) {
        this.interprete = interprete;
    }

    public void setAno_alb(int ano_alb) {
        this.ano_alb = ano_alb;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    /*Getters */

    public String getTitulo_musica() {
        return titulo_musica;
    }

    public String getNome_album() {
        return nome_album;
    }

    public String getCompositor() {
        return compositor;
    }

    public String getInterprete() {
        return interprete;
    }

    public int getAno_alb() {
        return ano_alb;
    }

    public int getTamanho() {
        return tamanho;
    }
}
