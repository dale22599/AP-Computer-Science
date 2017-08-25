
/**
 * Allows jobs to be created
 * Contains methods that allow things to happen to jobs and their employees
 * 
 * @Dale Yu
 * @11/15/13
 */
public class Job
{    
    private String jobName;
    private double salary;
    private Person employee;

    public Job()
    {
        jobName = "";
        salary = 0;
        employee = null;
    }

    public Job(String jN, double s, Person e)
    {
        jobName = jN;
        salary = s;
        employee = e;
        // sets employee's job to this
        if (e != null)
        {
            e.setJob(this);
        }
    }

    public void changeSalary(double newSalary)
    {
        if (newSalary > salary)
        {
            salary = newSalary;
            System.out.println("The demand for " + jobName + "s has increased and its salary has increased to $" + newSalary + ".");
        }
        else if (newSalary < salary)
        {
            salary = newSalary;
            System.out.println("The demand for " + jobName + "s has decreased and its salary has decreased to $" + newSalary + ".");
        }
        else
        {
            System.out.println("The salary of this job is already $" + salary + ".");
        }
    }      

    public void hire(Person newEmployee)
    {
        if (employee == null)
        {
            if (newEmployee.getJob() == null)
            {
                employee = newEmployee;
                employee.setJob(this);
                System.out.println(newEmployee.getName() + " has been hired as a " + jobName + ".");
            }
            else
            {
                System.out.println(newEmployee.getName() + " already has a job as a " + newEmployee.getJob().jobName + ".");
            }
        }
        else
        {
            System.out.println("There is already a " + jobName + ": " + employee.getName());
        }
    }

    public void fire()
    {
        if (employee == null)
        {
            System.out.println("There is no " + jobName + " to fire.");
        }
        else
        {
            System.out.println(employee.getName() + " has been fired from his job as a " + jobName + ".");   
            employee.setAtWork(false);
            employee.setJob(null);            
            employee = null;
        }
    }

    public double getSalary()
    {
        return this.salary;
    }

    public String getJobName()
    {
        return this.jobName;
    }

    public String toString()
    {
        if (employee == null)
        {
            return "There is no " + jobName + ". However, the salary of one would be $" + salary + ".";
        }
        else
        {        
            return employee.getName() + ", the " + jobName + ", makes $" + salary + " a year.";
        }
    }
}
