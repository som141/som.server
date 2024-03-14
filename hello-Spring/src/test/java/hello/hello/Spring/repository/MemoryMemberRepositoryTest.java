package hello.hello.Spring.repository;

import hello.hello.Spring.domain.member;
import org.junit.jupiter.api.Test;

public class MemoryMemberRepositoryTest {
    memoryMemberRepository repository=new memoryMemberRepository();
    @Test
    public void save(){
        member member1= new member();
        member1.setName("윤영주");
        repository.save(member1);
      member r  =repository.findById(member1.getId()).get();
        System.out.println("r = "+(member1==r));
    }

}
