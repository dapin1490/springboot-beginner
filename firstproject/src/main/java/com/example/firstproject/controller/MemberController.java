package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member;
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
    @Autowired
    private MemberRepository memRepo;

    @GetMapping("/members/new")
    public String newMemberForm() {
        return "members/new";
    }

    @PostMapping("/join")
    public String createMember(MemberForm form) {
        System.out.println(form.toString());
        Member mem = form.toEntity();
        System.out.println(mem.toString());
        mem = memRepo.save(mem);
        System.out.println(mem.toString());
        return "";
    }
}
