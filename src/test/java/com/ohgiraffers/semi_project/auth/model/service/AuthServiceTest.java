package com.ohgiraffers.semi_project.auth.model.service;

import com.ohgiraffers.semi_project.auth.model.AuthDetails;
import com.ohgiraffers.semi_project.common.UserRole;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import com.ohgiraffers.semi_project.user.model.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertThrows;


class AuthServiceTest {
    private final UserService userService = mock(UserService.class);
    private final AuthService authService = new AuthService(userService);
    @Test
    public void loadUserByUsername_유저_이름이_주어지면_유저_상세_정보를_반환한다() {
        // Given
        String username = "전준규";
        int userCode = 1;
        String userId ="userId";
        String password = "password";
        UserRole userRole = UserRole.ADMIN;
        LoginUserDTO loginUserDTO = new LoginUserDTO(
                userCode,
                userId,
                username,
                password,
                userRole
        );
        AuthDetails expected = new AuthDetails(loginUserDTO);

        when(userService.findByUsername(username)).thenReturn(loginUserDTO);

        // When
        UserDetails actual = authService.loadUserByUsername(username);

        // Then
        assertEquals(expected, actual);
    }
    @Test
    public void loadUserByUsername_유저_이름이_주어지고_유저가_존재하지_않으면_예외를_던진다() {
        // Given
        String username = "전준규";

        when(userService.findByUsername(username)).thenReturn(null);

        // Expect
        Exception actual = assertThrows(
                UsernameNotFoundException.class,
                () -> authService.loadUserByUsername(username)
        );
        assertEquals("해당하는 회원 정보가 존재하지 않습니다!!!", actual.getMessage());
    }
}