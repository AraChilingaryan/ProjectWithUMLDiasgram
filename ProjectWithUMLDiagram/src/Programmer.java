public class Programmer extends Person{

  private String name;
  private String designation;
  private String companyName;

  public Programmer(){

  }

  public Programmer(String name, String designation, String companyName) {
    super(name, designation);
    this.companyName = companyName;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String getDesignation() {
    return designation;
  }

  @Override
  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  private void learn(){

  }

  private void eat(){

  }
  private void walk(){

  }

  private void coding(){

  }


}
