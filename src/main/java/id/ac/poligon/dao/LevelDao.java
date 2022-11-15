package id.ac.poligon.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import id.ac.poligon.entity.Role;

public interface LevelDao extends PagingAndSortingRepository<Role,String>{
    
}
