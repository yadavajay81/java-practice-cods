package java8certification;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	private final List<String> employees = new ArrayList<>(List.of("Bob","Sam","William"));
	
	@GetMapping
	public List<String> getEmployees(){
		return employees;
	}
	
	@PostMapping
	public String addEmployee(@RequestBody String employee) {
		employees.add(employee);
		return "Employee added successufully";
	}
	
}
