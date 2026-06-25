public class functions {
    public static void main(String[] args) {
        String name="Aman";
        String name2="Akku";
        //CONCATENATION:
        String name3=name+" and "+name2;
        System.out.println(name3);

        //SEARCHING:
        System.out.println("Charcter at 3rd index is:"+name.charAt(3));

        //REPLACING ELEMENT:
        String newnme="OM RAI";
        String chnge=newnme.replace('a', 'n');
        System.out.println("new name"+chnge);

        //SUBSTRING:
        System.out.println(name.substring(0,4));
    }
}
