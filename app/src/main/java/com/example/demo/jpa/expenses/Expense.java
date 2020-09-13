package com.example.demo.jpa.expenses;

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
public class Expense extends AbstractModel {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id; // 支出id

  @Column(nullable = false)
  private int expenseInt; // カテゴリ名

  // 作成日時、更新日時はAbstractModelより作成する
}
