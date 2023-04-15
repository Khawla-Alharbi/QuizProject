
package quiz;


public class Result { // كلاس للتعامل مع الدرجة بخصوصية
    private int degree=0; 

    public void add(int c){
        degree = degree + c;
    }
  // Getter
    public int getDegree() {
        return degree;
    }

  // Setter
    public void setDegree(int newDegree) {
        this.degree = newDegree;
    } 
  
}
