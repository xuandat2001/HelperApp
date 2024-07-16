package org.timebankapp.timebankapp_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.timebankapp.timebankapp_backend.model.Member;

public interface MemberRepository extends JpaRepository<Member,String> {

}
