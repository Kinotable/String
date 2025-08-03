public class Friend{
    String Adress_p ;
    String  name_p;
    String  contact_p ;
    String favGam_p;
    public Friend(String adress_p, String name_p, String contact_p, String favGam_p) {
        Adress_p = adress_p;
        this.name_p = name_p;
        this.contact_p = contact_p;
        this.favGam_p = favGam_p;
    }

public static void main(String[] args) {
    Friend friend = new Friend("John", "123 Main St", "123-456-789","roblox");
    System.out.println(friend.name_p);
    System.out.println(friend.Adress_p);
    System.out.println(friend.contact_p);
    System.out.println(friend.favGam_p);
}
}
