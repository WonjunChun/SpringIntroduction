package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //null이 나올수도 있는 결과값은 Optional로 감싸서 처리
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
