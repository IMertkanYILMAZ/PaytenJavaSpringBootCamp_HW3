package dev.imy.paytenjavaspringbootcamp_hw3.controller;

import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MemberRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.request.MovieRequest;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MemberResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.controller.response.MovieResponse;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Member;
import dev.imy.paytenjavaspringbootcamp_hw3.service.MemberService;
import dev.imy.paytenjavaspringbootcamp_hw3.service.Movie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/members")
    @ResponseStatus(HttpStatus.CREATED)
    public String create(@RequestBody @Valid MemberRequest request){
        Member member = request.convertToMember();
        Long id = memberService.create(member);
        return MemberResponse.convertToMemberIdRespond(id);
    }

}
