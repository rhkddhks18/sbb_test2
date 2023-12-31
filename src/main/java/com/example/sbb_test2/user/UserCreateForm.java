package com.example.sbb_test2.user;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @Email
    @NotEmpty(message = "emailID는 필수항목입니다.")
    private String username;

    @Size(min = 3, max = 25)
    @NotEmpty(message = "닉네임은 필수항목입니다.")
    private String nickname;

    @NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;

    @NotEmpty(message = "비밀번호확인은 필수항목입니다.")
    private String password2;
}
