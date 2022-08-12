package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Tarefa;

public class BuscaTarefas {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		
		EntityManager manager = factory.createEntityManager();
		String sql = "select tarefa from Tarefa as tarefa where tarefa.finalizada =: paramFinalizado";
//		String sql = "select tarefa from Tarefa as tarefa"; 
		
		Query query = manager.createQuery(sql);
		
		List<Tarefa> lista = query.getResultList();
		
		for (Tarefa tarefa : lista) {
			System.out.println(tarefa.getDescricao());
		}
		
		manager.close();
		factory.close();

	}

}
