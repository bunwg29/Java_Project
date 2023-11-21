class Student
{
    private String id;
    private String name;
    private String clas;

    public  Student(String id, String name, String clas)
    {
        this.id = id;
        this.name = name;
        this.clas = clas;
    }

    public String getId()
    {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }
    public void setClas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString()
    {
        return "\n" + "ID: " + id + "\n" + 
               "Name of Student: " + name;

    }
}