package studentreg.studentreg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studentreg.studentreg.Student;
import studentreg.studentreg.StudentService;

@RestController
@RequestMapping("/")
public class Controller {
	@Autowired
	StudentService service;

	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAllStudents() {
		List<Student> list = service.getAllStudents();

		return new ResponseEntity<List<Student>>(list, HttpStatus.OK);
	}

	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id)  {
		Student entity = service.getStudentById(id);

		return new ResponseEntity<Student>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/post")
	public ResponseEntity<Student> createOrUpdateStudent(@RequestBody Student student)
			 {
		Student updated = service.createOrUpdateStudent(student);
		return new ResponseEntity<Student>(updated, new HttpHeaders(), HttpStatus.OK);
	}
}