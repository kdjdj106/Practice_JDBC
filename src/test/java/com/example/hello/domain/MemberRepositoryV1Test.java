//package com.example.hello.domain;
//
//import com.example.hello.repository.MemberRepositoryV1;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import java.sql.SQLException;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@Slf4j
//class MemberRepositoryV1Test {
//    MemberRepositoryV1 repository = new MemberRepositoryV1();
//    @DisplayName("")
//    @Test
//    public void save() throws SQLException {
//        //given
//        Member member = new Member("memberV0", 10000);
//        repository.save(member);
//        //when
//        //then
//
//        //findById
//        Member findMember = repository.findById(member.getMemberId());
//        log.info("findMember={}", findMember);
//        assertThat(findMember).isEqualTo(member);
//    }
//}