import java.util.List;
import java.util.ArrayList;
public class Room 
{
    private List<Person> persons;
    public Room()
    {
        this.persons = new ArrayList<Person>();
    }
    public void addPerson(String name, String id, int pnumber,int day,String typeroom) {
        Person npersons = new Person(name, id, pnumber,day,typeroom);
        persons.add(npersons);
    }

    public void removePerson(String id)
    {
        Person dPerson = getPersons(id);
        if(dPerson != null)
        {
            persons.remove(dPerson);
        }
    }


    
    @Override
    public String toString()
    {
        return  "Person in Hotel: \n" +  "\n" + persons + "\n";
    }

    public Person getPersons(String id) {
        for(Person person : persons)
        {
            if(person.getId().equals(id))
            {
                return person;
            }
        }
        return null;
    }

    public String getType(String type)
    {
        for(Person person : persons)
        {
            if(person.getTyperoom().equals(type))
            {
                return type;
            }
        }
        return null;
    }

    public void getPrice(String id, String type)
    {
        int price = 0;
        Person find = getPersons(id);
        String findr = getType(type);
        if(find == null)
        {
            System.out.println("Not found");
        }
        else if(find != null)
        {
            if(findr.equals(type))
            {
            switch (type) {
                case "A":
                    price = find.getDay() * 500;
                    break;
                case "B":
                    price = find.getDay() * 300;
                    break;
                case "C":
                    price = find.getDay() * 100;
                    break;
            }
            }
            else
            {
                System.out.println("Not correct type room when order");
            }
            
        }
        System.out.println("The price of id persons is " + price + " $");
    }
    
}
    
    

    




    

