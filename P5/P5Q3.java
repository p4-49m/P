package P5;

public class P5Q3 {
    public static void main(String[] args) {
        // create a variable to store title, full name
        String title, fname = "";

        // decode the command line arguments
        if(args.length < 2){
            System.out.println("Usage: <name> <title>");
            System.exit(1);
        }

        // retrieve the title
        title = args[args.length - 1];

        // retrieve first name and middle name
        for (int i = 0; i < args.length - 1; i++) {
            // convert the name to lowercase
            String name = args[i].toLowerCase();

            // if the namae is square brancket, means
            // this is the surname
            // we have to extract the surname and capatlize
            // the first letter in the surname
            if(name.charAt(0) =='[') {
                // capitalize the first char of the surname
                name = name.replace(name.charAt(1), Character.toUpperCase(name.charAt(1)));
            }
            else{
                // capitalize the first char of the first name
                // and middle name
                name = name.replace(name.charAt(0), Character.toUpperCase(name.charAt(0)));
            }
            fname +=  " " + name ;

        }

        // retrieve the surname
        int startSN = fname.indexOf('[');
        int endSN = fname.indexOf(']');
        String surname = fname.substring(startSN + 1, endSN);

        System.out.println("To: " + fname);
        System.out.println("Wishing you a Merry Christmas, " + title + " " + surname);
    }
    
}
