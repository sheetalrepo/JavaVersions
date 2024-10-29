package A_Collection.Sorting;

/**
 * POJO class with Comparable
 * 
 * @author Sheetal Singh
 */
public class D_Dog implements Comparable<D_Dog>{
    private int id;

    public D_Dog(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "D_Dog{" +
                "id=" + id +
                '}';
    }
    
    @Override
    public int compareTo(D_Dog d) {
        return this.id - d.getId();
    }
}
