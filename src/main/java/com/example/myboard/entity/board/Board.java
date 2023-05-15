package com.example.myboard.entity.board;


import com.example.myboard.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Board extends BaseTimeEntity {

    @Id //table에 primary key를 지정하는 어노테이션
    //Entity(table)에 primary key 값을 자동으로 생성하여 데이터베이스에 저장함.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String content;
    private int    readCnt;
    private String registerId;


    @Builder
    public Board(Long id, String title, String content, int readCnt, String registerId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.readCnt = readCnt;
        this.registerId = registerId;
    }
}

/*
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
@AllArgsConstructor 모든 필드를 매개변수로 받는 생성자를 만들어주는 어노테이션 이걸로 코드를 아래와 같이 더 간단하게 구현할 수 있다.
public class Board {
    private Long id;
    private String title;
    private String content;
    private int readCnt;
    private String registerId;
}
*/