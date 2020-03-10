package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== TEST: INSERINDO DEPARTAMENTO ===");
		Department newDepartment = new Department(null, "Brinquedos");
		departmentDao.insert(newDepartment);
		System.out.println("inserido departamento. ID = " + newDepartment.getId());
		
		/*System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findbyId(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2: seller findByDep ===");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: seller findAll ===");
		List<Seller> list2 = sellerDao.findAll();
		for(Seller obj : list2) {
			System.out.println(obj);
		}
		System.out.println("=== TEST 4: inserindo vendedor ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("inserido vendedor. ID = " + newSeller.getId());
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findbyId(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completo!");
		
		System.out.println("=== TEST 6: seller delete ===");
		System.out.println("Entre com o id para testar a deleção: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleção completa!");*/
		
		sc.close();
	}

}
