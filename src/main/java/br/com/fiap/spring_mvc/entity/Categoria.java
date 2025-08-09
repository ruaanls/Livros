package br.com.fiap.spring_mvc.entity;

public enum Categoria
{
    TERROR("Terror"),
    ROMANCE("Romance"),
    COMEDIA("Comédia"),
    FICCAO("Ficção"),
    SUSPENSE("Suspense"),
    BIOGRAFIA("Biografia"),
    TECNOLOGIA("Tecnologia");

    private String descricao;

    Categoria(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
