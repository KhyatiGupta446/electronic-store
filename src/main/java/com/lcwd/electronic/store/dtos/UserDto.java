package com.lcwd.electronic.store.dtos;

import com.lcwd.electronic.store.validate.ImageNameValid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String userId;

    @Size(min = 3,max = 22,message = "Invalid Name !!")
    private String name;

//    @Email(message = "Invalid User Email !!")
    @Pattern(regexp = "^[a-z0-9][-a-z0-9._]+@([-a-z0-9]+\\.)+[a-z]{2,5}$", message = "Invalid User Email !!")
    @NotBlank(message = "Email is Required !!")
    private String email;

    @NotBlank(message = "Password is Required !!")
    private String password;

    @Size(min = 4, max = 6, message = "Invalid Gender !!")
    private String gender;

    @NotBlank(message = "Write Something about yourself !!")
    private String about;

    @ImageNameValid
    private String imageName;
}
