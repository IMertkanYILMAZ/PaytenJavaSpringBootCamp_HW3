package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.repository.MemberEntity;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@Builder
@EqualsAndHashCode
public class Member {

    private String memberName;
    private String memberEmail;


    public MemberEntity convertToMemberEntity(Member member) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberName(member.getMemberName());
        memberEntity.setMemberEmail(member.getMemberEmail());
        return memberEntity;
    }
}
