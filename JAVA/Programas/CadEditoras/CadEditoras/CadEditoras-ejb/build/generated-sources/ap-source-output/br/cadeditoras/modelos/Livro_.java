package br.cadeditoras.modelos;

import br.cadeditoras.modelos.Autor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-10-26T22:45:07")
@StaticMetamodel(Livro.class)
public class Livro_ { 

    public static volatile SingularAttribute<Livro, Autor> autorId;
    public static volatile SingularAttribute<Livro, String> isbn;
    public static volatile SingularAttribute<Livro, String> titulo;
    public static volatile SingularAttribute<Livro, Integer> id;
    public static volatile SingularAttribute<Livro, Integer> edicao;

}