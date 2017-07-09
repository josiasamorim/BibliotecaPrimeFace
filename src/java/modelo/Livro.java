/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
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

/**
 *
 * @author FIlho
 */
@Entity
@Table(name = "LIVRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Livro.findAll", query = "SELECT l FROM Livro l")
    , @NamedQuery(name = "Livro.findById", query = "SELECT l FROM Livro l WHERE l.id = :id")
    , @NamedQuery(name = "Livro.findByNome", query = "SELECT l FROM Livro l WHERE l.nome = :nome")
    , @NamedQuery(name = "Livro.findByIdEdicao", query = "SELECT l FROM Livro l WHERE l.idEdicao = :idEdicao")
    , @NamedQuery(name = "Livro.findByIsbn", query = "SELECT l FROM Livro l WHERE l.isbn = :isbn")})
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 300)
    @Column(name = "NOME", nullable = false, length = 300)
    private String nome;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_EDICAO", nullable = false)
    private int idEdicao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ISBN", nullable = false)
    private int isbn;
    @JoinColumn(name = "ID_AUTOR", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Autor idAutor;
    @JoinColumn(name = "ID_CATEGORIA", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Categoria idCategoria;
    @JoinColumn(name = "ID_EDITORA", referencedColumnName = "ID", nullable = false)
    @ManyToOne(optional = false)
    private Editora idEditora;

    public Livro() {
    }

    public Livro(Integer id) {
        this.id = id;
    }

    public Livro(Integer id, String nome, int idEdicao, int isbn) {
        this.id = id;
        this.nome = nome;
        this.idEdicao = idEdicao;
        this.isbn = isbn;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdEdicao() {
        return idEdicao;
    }

    public void setIdEdicao(int idEdicao) {
        this.idEdicao = idEdicao;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Autor getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Autor idAutor) {
        this.idAutor = idAutor;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Editora getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Editora idEditora) {
        this.idEditora = idEditora;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Livro)) {
            return false;
        }
        Livro other = (Livro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Livro[ id=" + id + " ]";
    }
    
}
