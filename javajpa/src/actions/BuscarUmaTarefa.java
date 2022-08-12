package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Tarefa;

public class BuscarUmaTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa = manager.find(Tarefa.class, 2L);
		
		System.out.println(tarefa.getDescricao());
		
		manager.close();
		factory.close();
	}

}
