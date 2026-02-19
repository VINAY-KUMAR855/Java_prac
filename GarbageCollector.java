class GarbageCollector {
    public static void main(String[] args) {
        String s = new String("Java");
        s = null;
        s = new String("Vinay");
        new String("Varun");
        System.gc();
    }
    protected void finalize(){
        System.out.println("Object destroyed");
    }
}
