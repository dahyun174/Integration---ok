package com.example.demo.persistence;

import com.example.demo.model.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, String> {
    // JpaRepository를 상속받는 것만으로 기본적인 CRUD 메소드가 모두 자동 생성됩니다.
    // 추가로 필요한 쿼리가 있다면 여기에 메소드를 정의할 수 있습니다.
    // 예: userId로 모든 Todo 리스트 찾기
    List<TodoEntity> findByUserId(String userId);
}