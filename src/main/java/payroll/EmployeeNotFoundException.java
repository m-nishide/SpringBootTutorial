package payroll;

class EmployeeNotFoundException extends RuntimeException{
    EmployeeNotFoundException(Long id){
        super("従業員がみつかりません。 id = " + id);
    }
}
