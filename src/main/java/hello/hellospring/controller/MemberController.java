package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
    /**
     * 의존성 주입 - 생성자 주입 방식
     *
     * * 필드 주입 방식은 *
     * @Autowired
     * private MemberService memberService;
     * 이런식으로
     *
     * * setter 주입 방식도 있음 *
     */
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }
}
