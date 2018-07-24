package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ extends model.Pessoa_ {

	public static volatile SingularAttribute<Cliente, String> senha;
	public static volatile SingularAttribute<Cliente, String> uf;
	public static volatile SingularAttribute<Cliente, String> cidade;
	public static volatile SingularAttribute<Cliente, Integer> numero;
	public static volatile SingularAttribute<Cliente, String> confirmasenha;
	public static volatile SingularAttribute<Cliente, String> usuario;
	public static volatile SingularAttribute<Cliente, String> email;
	public static volatile SingularAttribute<Cliente, String> rua;
	public static volatile SingularAttribute<Cliente, String> pais;
	public static volatile SingularAttribute<Cliente, String> cep;

}

