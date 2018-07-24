package br.cadeditoras.modelos;

import br.cadeditoras.modelos.Livro;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T22:45:07")
@StaticMetamodel(Autor.class)
public class Autor_ { 

    public static volatile SingularAttribute<Autor, String> nome;
    public static volatile SingularAttribute<Autor, Integer> id;
    public static volatile SingularAttribute<Autor, String> email;
    public static volatile CollectionAttribute<Autor, Livro> livroCollection;

}