class Baecker {
    private String name;
    private int stufe;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setStufe(int stufe){
        this.stufe = stufe;
    }

    public int getStufe() {
        return this.stufe;
    }

    Brot produzieren(Mehl mehl) {
        System.out.println(name + " hat Brot gebacken");
        return new Brot();
    }
}
