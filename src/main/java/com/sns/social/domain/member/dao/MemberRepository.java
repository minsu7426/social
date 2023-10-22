package com.sns.social.domain.member.dao;

import com.sns.social.domain.entity.LoginMember;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<LoginMember, Long> {
    Optional<LoginMember> findByMemberId(String username);
}
