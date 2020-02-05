class CBerufswelt {
    public static void main(String[] args) {
        Baecker thomas = new Baecker();
        Mehl mehl = new Mehl();
        

        thomas.setName("Thomas");
        thomas.setStufe(2);

        System.out.println("Name: " + thomas.getName() + " Stufe: " + thomas.getStufe());
        Brot brot = thomas.produzieren(mehl);
    }
}