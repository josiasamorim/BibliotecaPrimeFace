package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Autor;
import modelo.Categoria;
import modelo.Editora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-08T23:35:38")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, Autor> idAutor;
    public static volatile SingularAttribute<Livro, Integer> isbn;
    public static volatile SingularAttribute<Livro, Integer> idEdicao;
    public static volatile SingularAttribute<Livro, String> nome;
    public static volatile SingularAttribute<Livro, Integer> id;
    public static volatile SingularAttribute<Livro, Categoria> idCategoria;
    public static volatile SingularAttribute<Livro, Editora> idEditora;

}