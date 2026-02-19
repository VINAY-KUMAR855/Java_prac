class Methods {
    public static void main(String[] args) {
        String s1 = "Vinay";
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.toUpperCase()+s1.toLowerCase());
        String s2 = "Varun";
        System.out.println(s1.equals(s2));
        System.out.println(s1.toUpperCase().equalsIgnoreCase(s1));
        System.out.println(s1.concat(" Majji"));
        System.out.println(s1.substring(1));
        System.out.println(s1.substring(1,4));
        System.out.println(s1.contains("v"));
        System.out.println(s1);
        s1 = "Majji vinay kumar";
        String[] splits = s1.split(" ");
        for(String key:splits){
            System.out.println(key);
        }
    }
}
