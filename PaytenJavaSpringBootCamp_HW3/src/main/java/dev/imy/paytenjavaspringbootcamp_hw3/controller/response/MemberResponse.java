package dev.imy.paytenjavaspringbootcamp_hw3.controller.response;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Builder
@Getter
public class MemberResponse {


    private Long id;
    private String memberName;
    private String memberEmail;

    public static String convertToMemberIdRespond(Long id) {
        return "Member has been created with ID number : " + id;
    }
}
