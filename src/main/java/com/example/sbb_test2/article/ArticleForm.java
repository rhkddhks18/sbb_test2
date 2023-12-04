package com.example.sbb_test2.article;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ArticleForm {
    @Size(max = 200)
    @NotEmpty(message = "제목은 필수")
    private String title;
    @NotEmpty(message = "내용은 필수")
    private String content;
}

