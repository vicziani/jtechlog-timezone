package timezone;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
@Slf4j
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        log.info("Create employee, valid from: {}", employee.getValidFrom());
        log.info("JVM default timezone: {}", ZoneId.systemDefault());
        return employeeRepository.save(employee);
    }

    @GetMapping
    public List<Employee> listEmployees() {
        return employeeRepository.findAll();
    }
}
