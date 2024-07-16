package org.timebankapp.timebankapp_backend.service;

import org.springframework.stereotype.Service;
import org.timebankapp.timebankapp_backend.DTO.MemberDTO;
import org.timebankapp.timebankapp_backend.DTO.MemberResponseDTO;
import org.timebankapp.timebankapp_backend.model.Member;

@Service
public class MemberMapper {
    public Member toMember(MemberDTO memberDTO){
        var member = new Member();
        member.setUserNameMem(memberDTO.userName());
        member.setPasswordMem(memberDTO.password());
        member.setFullNameMem(memberDTO.fullName());
        member.setAddressMem(memberDTO.address());
        member.setPhoneMem(memberDTO.phoneNumber());
        return member;
    }
    public MemberResponseDTO memberResponseDTO(Member member){
        return new MemberResponseDTO(member.getUserNameMem(),member.getFullNameMem(), member.getAddressMem(), member.getPhoneMem());
    }
}
