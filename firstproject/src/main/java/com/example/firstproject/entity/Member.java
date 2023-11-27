package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private String pw;

    public Member(Long id, String email, String pw) {
        this.email = email;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }
}
