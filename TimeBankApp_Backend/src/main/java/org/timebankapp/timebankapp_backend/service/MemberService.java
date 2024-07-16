package org.timebankapp.timebankapp_backend.service;

import org.springframework.stereotype.Service;
import org.timebankapp.timebankapp_backend.DTO.MemberDTO;
import org.timebankapp.timebankapp_backend.DTO.MemberResponseDTO;
import org.timebankapp.timebankapp_backend.repository.MemberRepository;

@Service
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public MemberService(MemberRepository memberRepository, MemberMapper memberMapper) {
        this.memberRepository = memberRepository;
        this.memberMapper = memberMapper;
    }
    public MemberResponseDTO saveMember(MemberDTO memberDTO){
        var member = memberMapper.toMember(memberDTO);
        var saveMember = memberRepository.save(member);
        return memberMapper.memberResponseDTO(saveMember);
    }
}
