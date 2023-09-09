package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====JPA CRUD=========");
		EntityManagerFactory fabrica =Persistence.createEntityManagerFactory("JPA_CLASE01x");
		EntityManager em = fabrica.createEntityManager();
		
		List<TbUsuario> lstUsuarios =em.createQuery("select a from TbUsuario a",TbUsuario.class).getResultList();
		System.out.println("=============");
		
		/*MOSTAR CANTIDAD DE USUARIOS */
		System.out.println("Nro de usuarios: " + lstUsuarios.size()); 
	}

}
