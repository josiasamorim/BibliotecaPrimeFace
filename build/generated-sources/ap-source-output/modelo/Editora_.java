package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Livro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-08T23:35:38")
@StaticMetamodel(Editora.class)
public class Editora_ { 

    public static volatile SingularAttribute<Editora, String> site;
    public static volatile SingularAttribute<Editora, String> sede;
    public static volatile SingularAttribute<Editora, String> nome;
    public static volatile SingularAttribute<Editora, Integer> id;
    public static volatile CollectionAttribute<Editora, Livro> livroCollection;

}