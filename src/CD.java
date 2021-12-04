
public class CD {
    private String titulo_musica;
    private String nome_album;
    private String compositor;
    private String interprete;
    private int ano_album;

    /* Constructores */

    public CD(String titulo_musica, String nome_album, String compositor, String interprete, int ano_album) {
        this.titulo_musica = titulo_musica;
        this.nome_album = nome_album;
        this.compositor = compositor;
        this.interprete = interprete;
        this.ano_album = ano_album;
    }

    /* Setters */

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

    public void setAno_album(int ano_album) {
        this.ano_album = ano_album;
    }

    /* Getters */

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

    public int getAno_album() {
        return ano_album;
    }
}
