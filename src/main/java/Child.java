public class Child extends Person{
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;
    public Child(String name, int age, Parent parent1, Parent parent2){
super(name, age);
this.siblings = new Child[] {};
this.parent1 = parent1;
this.parent2 = parent2;

    }


    public Parent getParent1() {
        return parent1;
    }
    public Parent getParent2() {
        return parent2;
    }
    public Child[] getSiblings() {
        return siblings;
    }
    public void setSiblings(Child[] siblings) {
        this.siblings = siblings;
    }

    public void addSibling(Child child){
        Child[] c = new Child[this.siblings.length + 1];
        for(int i = 0; i < this.siblings.length; i++){
            c[i] = this.siblings[i];
        } 
        c[this.siblings.length] = child;
        this.siblings = c;
     }
}
