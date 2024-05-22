package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

/**
 * @Repository - このインターフェースがSpringのリポジトリであることを示す ※必須ではない
 * JpaRepository<User, Long> - 一般的なCRUD操作やページング、ソート機能を含む多くの便利なメソッドを備えている
 * 	User - Userエンティティ
 *  Long - 主キーの型
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
