package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Livro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-08T23:35:38")
@StaticMetamodel(Categoria.class)
public class Categoria_ { 

    public static volatile SingularAttribute<Categoria, Integer> id;
    public static volatile CollectionAttribute<Categoria, Livro> livroCollection;
    public static volatile SingularAttribute<Categoria, String> descricao;

}