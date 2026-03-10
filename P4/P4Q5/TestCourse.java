package P4Q5;

public class TestCourse {
    public static void main(String[] args) {
        // create a new Course object
        Course course = new Course("Introduction to Computers", 250.00);
        
        // add 3 students into the course object
        course.addStudent("Ali Said");
        course.addStudent("Wong Ken");
        course.addStudent("Peter Lim");

        System.out.println(course);
        String[] names = course.getStudentNames();
        
        System.out.println("List of Students in the course: ");
        for (int i = 0; i < names.length; i++) {
            if(names[i] != null)
            System.out.println((i + 1) +". " + names[i]);
        }

        // for (String name: names) {
        //     if(name != null)
        //     System.out.println(name);
        // }
    }
    
}