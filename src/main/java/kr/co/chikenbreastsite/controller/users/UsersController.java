package kr.co.chikenbreastsite.controller.users;

import kr.co.chikenbreastsite.domain.dto.users.*;
import kr.co.chikenbreastsite.service.users.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
    private final SignInService signInService;  //생성자주입

    private final SignUpService signUpService;

    private final UserUpdateService userUpdateService;

    private final UsersDeleteService usersDeleteService;

    private final UsersGetService usersGetService;

    @PostMapping
    public void signUp(@RequestBody SignUpDto signUpDto){
        signUpService.signUp(signUpDto);
    }

    @PostMapping("/login")
    public void signIn(@RequestBody SignInDto signInDto){
        signInService.signIn(signInDto);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody UsersUpdateDto usersUpdateDto){ userUpdateService.userUpdate(usersUpdateDto); }

    @GetMapping("/get")
    public UsersGetDto usersGet(@RequestParam("identity") String identity){
        return usersGetService.usersGet(identity);
    }

    @DeleteMapping
    public void deleteUser(@RequestBody UserDeleteDto userDeleteDto){
        usersDeleteService.UserDelete(userDeleteDto);
    }
}
