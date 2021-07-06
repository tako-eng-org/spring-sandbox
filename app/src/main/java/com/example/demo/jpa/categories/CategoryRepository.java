package com.example.demo.jpa.categories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
  // Categoryモデルを操作する用のリポジトリ
  // CRUDはJpaRepositoryにメソッド実装されているので、新規での実装は不要。
  // https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html
}
