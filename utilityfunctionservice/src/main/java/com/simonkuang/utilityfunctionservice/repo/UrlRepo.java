package com.simonkuang.utilityfunctionservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simonkuang.utilityfunctionservice.models.Url;

@Repository
public interface UrlRepo extends JpaRepository<Url, Long>{

}
