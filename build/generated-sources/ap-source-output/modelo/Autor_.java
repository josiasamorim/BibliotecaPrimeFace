package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Livro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-08T23:35:38")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, Date> dataNasc;
    public static volatile SingularAttribute<Autor, String> biografia;
    public static volatile SingularAttribute<Autor, String> nome;
    public static volatile SingularAttribute<Autor, Integer> id;
    public static volatile CollectionAttribute<Autor, Livro> livroCollection;

}