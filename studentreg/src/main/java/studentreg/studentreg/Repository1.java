package studentreg.studentreg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import studentreg.studentreg.Student;
@Repository
public interface Repository1 extends JpaRepository<Student, Integer> {

}
