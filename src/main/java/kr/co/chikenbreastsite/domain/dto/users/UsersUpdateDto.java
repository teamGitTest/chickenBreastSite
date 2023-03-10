package kr.co.chikenbreastsite.domain.dto.users;


import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@AllArgsConstructor
@Builder
public class UsersUpdateDto {

    @NotNull(message = "아이디를 입력하세요.")
    @Size(min = 5, max = 15, message = "아이디는 5~15자를 입력해주세요.")
    private String identity;

    @NotNull(message = "비밀번호를 입력하세요.")
    @Size(min = 5, max = 15, message = "비밀번호는 5~15자를 입력해주세요.")
    private String password;

    @NotNull(message = "이름을 입력하세요")
    String name;

    @NotNull(message = "생년월일을 입력해주세요")
    String birth;

    @NotNull(message = "성별을 입력해주세요")
    String gender;

    @NotNull(message = "주소를 입력해주세요")
    String address;

    @NotNull(message = "상세주소를 입력해주세요")
    String detailedAddress;
}
