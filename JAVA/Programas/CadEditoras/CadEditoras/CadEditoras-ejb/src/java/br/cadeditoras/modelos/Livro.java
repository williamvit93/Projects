/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cadeditoras.modelos;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import outrosArquivos.SampleEntity;

/**
 *
 * @author Atanes
 */
@Entity
@Table(name = "livro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l"),
    @NamedQuery(name = "Livro.findById", query = "SELECT l FROM Livro l WHERE l.id = :id"),
    @NamedQuery(name = "Livro.findByIsbn", query = "SELECT l FROM Livro l WHERE l.isbn = :isbn"),
    @NamedQuery(name = "Livro.findByTitulo", query = "SELECT l FROM Livro l WHERE l.titulo = :titulo"),
    @NamedQuery(name = "Livro.findByEdicao", query = "SELECT l FROM Livro l WHERE l.edicao = :edicao")})
public class Livro implements Serializable,SampleEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 17)
    @Column(name = "isbn")
    private String isbn;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edicao")
    private int edicao;
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Autor autorId;

    public Livro() {
    }

    public Livro(Integer id) {
        this.id = id;
    }

    public Livro(Integer id, String isbn, String titulo, int edicao) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.edicao = edicao;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public Autor getAutorId() {
        return autorId;
    }

    public void setAutorId(Autor autorId) {
        this.autorId = autorId;
    }
    
    public String getNomeAutor(){
        return autorId.getNome();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.isbn);
        hash = 83 * hash + Objects.hashCode(this.titulo);
        hash = 83 * hash + this.edicao;
        hash = 83 * hash + Objects.hashCode(this.autorId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (this.edicao != other.edicao) {
            return false;
        }
        if (!Objects.equals(this.autorId, other.autorId)) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "br.cadeditoras.modelos.Livro[ id=" + id + " ]";
    }

}
