package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MemberApp {
    public static Logger log = (Logger) LoggerFactory.getLogger(MemberApp.class.getClass());
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        memberService.join(memberA);
        Member findMember = memberService.findMember(1L);
        log.info("new member : " + memberA);
        log.info("FindMember : " + findMember);
    }
}
