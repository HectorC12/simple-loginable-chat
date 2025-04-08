package com.hedris.arena.rpg.login.dto;

import com.hedris.arena.rpg.login.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
