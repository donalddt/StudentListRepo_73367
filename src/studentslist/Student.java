package studentslist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shaim
 * date: Feb, 5th, 2019
 */
public class Student {
   
    private String name;
    private int id;
    private String DoB;
    
    private int maxHrs;
    
    public Student()
    {
        this.name = "Not Set";
        this.id = 0;
    }
    public Student(String givenName,int givenId)
    {
        this.name = givenName;
        this.id = givenId;
    }
    
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    
    public String getName()
    {
           return this.name;
     }
    
    public void setId(int givenId)
    {
            this.id = givenId;
    }
    
    public int getId()
    {
        return this.id;
    }

    /**
     * @return the DoB
     */
    public String getDoB() {
        return DoB;
    }

    public String toString(){
    return "Student";
    }
}
