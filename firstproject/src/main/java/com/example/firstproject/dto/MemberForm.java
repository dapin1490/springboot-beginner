package com.example.firstproject.dto;

import com.example.firstproject.entity.Member;

public class MemberForm {
    private String email;
    private String pw;

    public MemberForm(String email, String pw) {
        this.email = email;
        this.pw = pw;
    }

    @Override
    public String toString() {
        return "Member{" +
                "email='" + email + '\'' +
                ", pw='" + pw + '\'' +
                '}';
    }

    public Member toEntity() {
        return new Member(null, email, pw);
    }
}
