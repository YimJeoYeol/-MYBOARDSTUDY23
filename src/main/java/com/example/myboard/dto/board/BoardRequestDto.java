package com.example.myboard.dto.board;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardRequestDto {
    private Long id;
    private String title;
    private String content;
    private String registerId;


}
