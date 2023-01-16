package kr.co.chikenbreastsite.domain.dto.users;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
public class UserDeleteDto {
    @NotNull(message = "아이디를 입력하세요.")
    @Size(min = 5, max = 15, message = "아이디는 5~15자를 입력해주세요.")
    private String identity;

    @NotNull(message = "비밀번호를 입력하세요.")
    @Size(min = 5, max = 15, message = "비밀번호는 5~15자를 입력해주세요.")
    private String password;
}
