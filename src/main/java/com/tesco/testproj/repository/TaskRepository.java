package com.tesco.testproj.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import org.springframework.data.jdbc.repository.query.Query;

import com.tesco.testproj.models.Task;

@Repository
public interface TaskRepository extends CrudRepository<Task, Integer> {

    // @Query("SELECT t FROM Task t WHERE t.Id = ?1")
    // public Task findTaskById(int Id);
}