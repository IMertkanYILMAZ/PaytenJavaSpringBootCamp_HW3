package dev.imy.paytenjavaspringbootcamp_hw3.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberDaoImp implements MemberDao{

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Long save(MemberEntity memberEntity) {
        memberJpaRepository.save(memberEntity);
        return memberEntity.getId();
    }
}
