package com.example.bejv007.user;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    private String name;
    private String email;

    public static UserResponse from(UserDTO userDTO) {
        return new UserResponse(userDTO.getName(), userDTO.getEmail());
    }
}
