package com.simonkuang.utilityfunctionservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simonkuang.utilityfunctionservice.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	//JPA are specifications that describes management of relational data in java app.  
	// is used to access, manage and persist data between java object and relational database. It is considered
	//as a standarad appraoch for ORM. 
	// briodges between OO domain models and relational database. JPA doesn't perform any operation by itself.
	// it requires implemenation. So , ORM tools like Hibernate implements JPA specifications for data persistence. 
}
