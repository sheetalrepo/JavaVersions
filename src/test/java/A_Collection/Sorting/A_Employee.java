package A_Collection.Sorting;

/**
 * Comparable:
 *  Adv:
 *  1. Good for natural sorting
 *  
 *  
 *  Disadv:
 *  1. Custom sorting not possible
 *  2. Need to implement Comparable Interface
 *  3. Only one sorting can be given at a time
 * 
 * @author Sheetal Singh
 */
public class A_Employee implements Comparable<A_Employee>{
    
    private String name;
    private Integer id;
    
    public A_Employee(String name, int id) {
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

    
    /**
     * Sorting by "name"
     * 
     * two diff obj of same class will be compared to each other
     * name is Employee 1 member
     * e2.getName() refer Employee 2 object
     *
     */
    @Override
    public int compareTo(A_Employee e2) {
        //return name.compareTo(e2.getName());
        return id.compareTo(e2.getId());
    }


    /**
     * Sorting by id
     */
//    @Override
//    public int compareTo(A_Employee e2) {
//        return id.compareTo(e2.getId());
//    }



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

        A_Employee aEmployee = (A_Employee) o;

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
