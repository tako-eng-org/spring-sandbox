package com.example.demo.jpa;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.Getter;
import lombok.Setter;
import java.sql.Timestamp;

// 日時情報など、1テーブルごとに共通して必要になるようなカラムを作成するモデル
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter // lombokによる
@Setter // lombokによる
public abstract class AbstractModel {
  @CreatedDate
  @Column(nullable = false)
  private Timestamp createdDate; // 作成日時

  @LastModifiedDate
  @Column(nullable = false)
  private Timestamp lastModifiedDate; // 更新日時

}
