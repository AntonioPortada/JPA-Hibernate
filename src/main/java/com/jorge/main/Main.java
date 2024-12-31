package com.jorge.main;

import java.util.List;

import javax.persistence.EntityManager;

import com.jorge.entity.Employee;
import com.jorge.util.UtilEntity;

public class Main {

	public static void main(String[] args) {
		EntityManager em = UtilEntity.getEntityManager();
		List<Employee> employees = em.createQuery("SELECT e from Employee e", Employee.class).getResultList();
		System.out.println("- - - - - - - - - - - Listar todos- - - - - - - - - - -  ");
		employees.forEach(System.out::println);
		
		System.out.println("- - - - - - - - - - - Buscar uno - - - - - - - - - - -  ");
		int employeeId = 3;
		Employee e = em.find(Employee.class, employeeId);
		System.out.println("Empleado encontrado: " + e);
		
		System.out.println("- - - - - - - - - - - Crea uno - - - - - - - - - - -  ");
		Employee e2 = new Employee();
		e2.setFirstName("Antonio");
		e2.setPaSurname("Portada");
		e2.setMaSurname("Luna");
		e2.setEmail("a@a.com");
		e2.setSalary(50f);
		System.out.println("Empleado encontrado: " + e);
		em.getTransaction().begin();
		em.persist(e2);
		em.getTransaction().commit();
		System.out.println("Nuevo empleado: " + e2);
		
	}
}
