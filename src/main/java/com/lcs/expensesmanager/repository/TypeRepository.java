package com.lcs.expensesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lcs.expensesmanager.model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {
}
