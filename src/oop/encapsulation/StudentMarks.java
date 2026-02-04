package oop.encapsulation;

public class StudentMarks {
    private String name;
    private int marks;

    public void setMarks(int newMarks){
        if (newMarks > 100){
            System.out.println("We can not have such marks, it's Criminal :)");
        }
        else{
            marks = newMarks;
        }
    }

    public int getMarks(){
        return marks;
    }

    public void setName(String newName){
        if(newName.isEmpty()){
            System.out.println("Name can not be empty!");
        }
        else{
            name = newName;
        }
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "The student names are: " + name + " and scored: " + marks +" marks";
    }
}
