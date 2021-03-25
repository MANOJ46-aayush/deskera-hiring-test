import java.util.Collection;

public class EmployeesManager {

List<Employee> empList=new ArrayList<Employee>();

  /**
   * Adds an Employee
   *
   * @param employee
   * @return
   */
  String addEmployee(Employee employee) {
    // TODO - implement this
    if(employee.getFirstName()!=null && employee.getBirthDate()!=null)
    {
        empList.add(employee);
        return "Added successfully";
    }
	
    return "Condition Invalid";
  }
  String addEmployee(Employee employee) {
    // TODO - implement this
    return null;
  }

  /**
   * Finds an Employee
   *
   * @param employeeId
   * @return
   */
  Employee findEmployee(String employeeId) {
    // TODO - implement this
    return null;
  }

  /**
   * Find all Employee who are older than X years
   * @param years
   * @return
   */
  Collection<Employee> findEmployee(int years) {
    return null;
  }

  /**
   * Removes an employee
   *
   * @param employeeId
   * @return
   */
  boolean removeEmployee(String employeeId) {
    // TODO - implement this
    return false;
  }

  /**
   * Lists all Employees
   *
   * @return
   */
  Collection<Employee> listEmployees() {
    // TODO - implement this
    return null;
  }
}

class Employee {

  private int ageInYears;
  private int ageInMonths;
  private String birthDate;
  private String firstName;
  private String lastName;

  private String employeeId;

  public Employee(String fullName, String birthDate) {
    // TODO - implement this
  }

  public int getAgeInYears() {
    return ageInYears;
  }

  public int getAgeInMonths() {
    return ageInMonths;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public String getBirthDate() {
    return birthDate;
  }
}
