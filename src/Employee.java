public class Employee {
  private String name;
  private String email;
  private int age;
  private int salary;

  public Employee(String name, String email, int age, int salary){
      this.name = name;
      this.email = email;
      this.age = age;
      this.salary = salary;
  }

  public void setName(){
      this.name = name;
  }

    public String getName() {
        return name;
    }

    public void setEmail(){
      this.email = email;
    }

    public String getEmail(){
      return email;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
