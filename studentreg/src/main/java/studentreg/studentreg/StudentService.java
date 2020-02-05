package studentreg.studentreg;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import studentreg.studentreg.Repository1;
import studentreg.studentreg.Student;

@Service
public class StudentService {
	@Autowired
	Repository1 repository;

    public List <Student> createOrUpdateStudent(Student entity) {
		Optional<Student> student = repository.findById(entity.getId());
		if (student.isPresent()) {
			Student newEntity = student.get();
		   newEntity.setName(entity.getName());
			newEntity.setDpmt(entity.getDpmt());
            newEntity.setId(entity.getId());
			newEntity = repository.save(newEntity);

			return getAllStudents();
		} else {
			entity = repository.save(entity);

			return null;
		}
	
	}
	public List<Student> getAllStudents() {
		List<Student> studentList = repository.findAll();
		if (studentList.size() > 0) {
			return studentList;
		} else {
			return new ArrayList<Student>();
		}
	}

	public Student getStudentById(int id)  {
		Optional<Student> student = repository.findById(id);
		if (student.isPresent()) {
			return student.get();
		} else {
		return null;
        }
	}



	
}
