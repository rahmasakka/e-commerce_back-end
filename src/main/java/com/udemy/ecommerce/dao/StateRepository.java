package com.udemy.ecommerce.dao;

import com.udemy.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {
    //http://localhost:8088/api/states/search/findByCountryCode?code=IN
    //http://localhost:8088/api/states/search/findByCountryCode?code=US
    List<State> findByCountryCode(@Param("code") String code);
}