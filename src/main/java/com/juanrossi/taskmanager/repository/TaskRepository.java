package com.juanrossi.taskmanager.repository;

import com.juanrossi.taskmanager.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}