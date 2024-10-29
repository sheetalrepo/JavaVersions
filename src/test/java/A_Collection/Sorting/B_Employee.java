package A_Collection.Sorting;

import java.util.Comparator;

/**
 * Comparator:
 *  Adv:
 *  1. Good for natural, custom sorting
 *  2. No need to touch base class
 *  
 *  Disadv:
 *  --
 *  @author Sheetal Singh
 */
public class B_Employee {
    
    private String name;
    private Integer id;
    
    public B_Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    //Auto generated
    @Override
    public String toString() {
        return "Employee{" +"name='" + name + '\'' + ", id=" + id + '}';
    }


    //Auto generated
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B_Employee aEmployee = (B_Employee) o;

        if (!name.equals(aEmployee.name)) return false;
        return id.equals(aEmployee.id);
    }

    //Auto generated
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }
}
