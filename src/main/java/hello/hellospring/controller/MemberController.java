package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        System.out.println("member = "+member.getName());

        memberService.join(member);
        return "redirect:/";
    }
}
