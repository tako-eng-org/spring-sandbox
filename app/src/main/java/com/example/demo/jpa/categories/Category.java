package com.example.demo.jpa.categories;

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
public class Category extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id; // 支出カテゴリid

  // @Id
  // @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer userId; // ユーザid

  @Column(nullable = false)
  private String categoryName; // 支出カテゴリ名

  // 作成日時(支出カテゴリ作成日時)、更新日時はAbstractModelより作成する
}
