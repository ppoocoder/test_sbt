package org.ppoocoder.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//기본값으로 크래스의 카멜케이스 이름을 언더스코어 네이밍으로 테이블 이름을 매칭함 EX) SalesManager.java -> sales_manager table
 @Getter
@NoArgsConstructor
@Entity
public class Posts {
    // @GeneratedValue : 스프링 부트 2.0 에서는 GenerationType.IDENTITY 옵션을 추가해야만 auto_increment가 됨
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column : 테이블의 컬럼을 나타내며 굳이 선언하지 않아도 해당 클래스에 있는 모든 필드는 모두 컬럼으로 변환되나 추가적인 설정값을 넣기 위해 사용됨
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition="TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
}
