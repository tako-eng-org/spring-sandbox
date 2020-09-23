package com.example.demo.jpa.users;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Column;
import com.example.demo.jpa.AbstractModel;

@Entity
@Getter
@Setter
public class User extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId; // ユーザid

  @Column(nullable = false)
  private String name; // ユーザ名

  @Column(nullable = false)
  private String password; // ユーザのログインパスワード

  @Column(nullable = false)
  private String email; // メールアドレス(一意)

  // 作成日時(ユーザ登録日付)、更新日時はAbstractModelより作成する
}
