// placeholder for your Employee class
public class Employee
{
  String personName;
  double hourlyWage;
  int numberOfHours;
  
  public Employee(String name, double wage, int hours)
  {
    personName = name;
    hourlyWage = wage;
    numberOfHours = hours;
  }
  public String getName ()
  {
    return personName;
  }
  public double getWage ()
  {
    return hourlyWage;
  }
  public int getHours ()
  {
    return numberOfHours;
  }
  public double getWeeklySalary ()
  {
    return numberOfHours*hourlyWage;
  }
  public double getYearlySalary ()
  {
    return 52*numberOfHours*hourlyWage;
  }
  public String toString ()
  {
    String result = "";
    result += "name: " + personName + ", wage: $" + hourlyWage + ", hours: " + numberOfHours;
    return result;
  }
  public void setName (String newName)
  {
    personName = newName;
  }
  public void setWage (double newWage)
  {
    hourlyWage = newWage; 
  }
  public void setHours (int h)
  {
    numberOfHours = h;
  }
  public void giveRaise ()
  {
    hourlyWage++;
  }
}
