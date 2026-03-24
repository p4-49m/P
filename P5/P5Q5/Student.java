package P5.P5Q5;

public class Student {
    private String studentID;
    private String name;
    private String school;

    public Student(String studentID, String name, String school){
        this.studentID = studentID;
        this.name = name;
        this.school = school;

    }
    
    public void setstudentID(String studentID){
        this.studentID = studentID; 
    }

    public void setname(String name){
        this.name = name;
    }

    public void setschool(String school){
        this.school = school;
    }

    public String getstudentID(){
        return studentID;
    }

    public String getname(){
        return name;
    }
    
    public String getschool(){
        return school; 
    }

    public static boolean validateStudentID(Student student){
        // get the student ID
        String studentID = student.studentID;

        //get the school code and the regsitration number from the studentID
        char schoolCode = Character.toUpperCase(studentID.charAt(0));
        String regNo = studentID.substring(1, studentID.length());

        // check if the school is a letter
        // and the regNo is 5 digits long
        if(!Character.isLetter(schoolCode)  || regNo.length() !=5){
            return false;
        }else{
            for(int i = 0; i < regNo.length(); i++){
                //chack if the char at current idx is not a digit
                if(!Character.isDigit(regNo.charAt(i))){
                    return false;
                }
            }
        }
        

    boolean valid = true;
    switch(schoolCode){
        case 'A':
            // check if the school is FASC
            valid = student.school.equals("FASC");
            break;
        case 'B':
            //check if the school is FAFB
            valid = student.school.equals("FAFB");
            break;
    }
    return valid;
}


    
}
    

