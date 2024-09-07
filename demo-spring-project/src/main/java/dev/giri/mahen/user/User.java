package dev.giri.mahen.user;

public record User(
        Integer id,
        String username,
        String password,
        String email,
        Address address,
        String phone,
        String website,
        Company company
) {
}
