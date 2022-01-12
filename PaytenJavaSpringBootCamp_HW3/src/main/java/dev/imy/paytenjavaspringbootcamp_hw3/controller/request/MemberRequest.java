package dev.imy.paytenjavaspringbootcamp_hw3.controller.request;

import dev.imy.paytenjavaspringbootcamp_hw3.service.Member;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class MemberRequest {

    @NotBlank
    private String memberName;

    @NotBlank String memberEmail;

    public Member convertToMember() {
        return Member.builder()
                .memberName(memberName)
                .memberEmail(memberEmail)
                .build();
    }
}
