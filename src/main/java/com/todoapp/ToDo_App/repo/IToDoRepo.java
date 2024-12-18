package com.todoapp.ToDo_App.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todoapp.ToDo_App.model.ToDo;

@Repository
public interface IToDoRepo extends JpaRepository<ToDo,Long>{

}
