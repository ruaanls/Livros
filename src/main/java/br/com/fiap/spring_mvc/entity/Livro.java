package br.com.fiap.spring_mvc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Livro
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "O titulo é obrigatório")
    private String titulo;
    @NotBlank(message = "O autor é obrigatório")
    private String autor;
    @Enumerated(EnumType.STRING)
    @NotNull(message = "A categoria é obrigatória")
    private Categoria categoria;
    private String editora;
    @DecimalMin(value = "0.99", message = "O preço deve ser o mínimo 0.99")
    private BigDecimal preco;
    @Pattern(regexp = "^970\\d(7)$|^970\\d{10}$", message = "ISBN FORA DO PADRÃO")
    private String isbn;
    private LocalDate dataPublicacao;
}
