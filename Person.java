class Person
{
    private String name;
    private String id;
    private int pnumber;
    private int day;
    private String typeroom;

    public Person(String name, String id, int pnumber,int day,String typeroom) 
    {
        this.name = name;
        this.id = id;
        this.pnumber = pnumber;
        this.day = day;
        this.typeroom = typeroom;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }
    public int getPnumber() {
        return pnumber;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public String getTyperoom() {
        return typeroom;
    }
    public void setTyperoom(int typeroom) {
        this.day = typeroom;
    }
    

    public String toString() {
        return "Name: " + name + ", Id: " + id + " Phone: " + pnumber + " Day: " + day + " Type Room: " + typeroom;
    }
    

}