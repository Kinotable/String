public class App {
    public static void main(String[] args) {
        String s = "whtever";
        String s1 = "java is fun";
        String s3 = " but hard";
        String s2 = "fun";
        String mt = "";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(6));
        System.out.println(s.length());//length method
        //substring
        System.out.println(s.substring(0, 1));
        //contains
        System.out.println(s1.contains(s2));
        //isEmpty
        System.out.println(mt.isEmpty());
        //add aka concat
        System.out.println(s1.concat(String.valueOf(s3)));
        //replace
        System.out.println(s1.replace("fun", "hard"));
        //indexFInd
        System.out.println(s1.indexOf("is"));

    }
}

