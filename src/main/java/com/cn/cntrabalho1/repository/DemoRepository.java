package com.cn.cntrabalho1.repository;

import com.cn.cntrabalho1.model.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DemoRepository extends JpaRepository<Demo, UUID> {
}
