package GoldenRabbit.Buzz.service;

import GoldenRabbit.Buzz.domain.Member;
import GoldenRabbit.Buzz.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TestService {

    private final MemberRepository MemberRepository;

    public List<Member> getAllMembers(){
        return MemberRepository.findAll();
    }
}
