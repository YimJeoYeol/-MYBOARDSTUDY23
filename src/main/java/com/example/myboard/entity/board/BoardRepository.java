package com.example.myboard.entity.board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {

    static final String UPDATE_BOARD= "UPDATE Board SET TITLE = :#{#boardRequestDto.title}, "
                                                                    + "CONTENT = :#{#boardRequestDto.content}, "
                                                                    + "";
}
