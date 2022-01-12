package dev.imy.paytenjavaspringbootcamp_hw3.service;

import dev.imy.paytenjavaspringbootcamp_hw3.repository.MemberDao;
import dev.imy.paytenjavaspringbootcamp_hw3.repository.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImp implements MemberService{

    private final MemberDao memberDao;

    @Override
    public Long create(Member member) {
        MemberEntity memberEntity = member.convertToMemberEntity(member);
        return memberDao.save(memberEntity);
    }
}
