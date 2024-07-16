package org.timebankapp.timebankapp_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.timebankapp.timebankapp_backend.DTO.MemberDTO;
import org.timebankapp.timebankapp_backend.DTO.MemberResponseDTO;
import org.timebankapp.timebankapp_backend.service.MemberService;

@RestController
public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    @PostMapping("/register")
    public MemberResponseDTO saveMember(@RequestBody MemberDTO memberDTO){
        return memberService.saveMember(memberDTO);
    }
}
