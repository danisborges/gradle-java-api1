package application.record;

import application.model.Livro;

public record LivroDTO(Long id, String titulo, String generos, String autores) {
    public LivroDTO(Livro livro) {
        this(livro.getId(), livro.getTitulo(), livro.getGeneros(), livro.getAutores());
    }
}
