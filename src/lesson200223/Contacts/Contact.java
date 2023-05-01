package src.lesson200223.Contacts;

import java.util.Set;

public class Contact {

    private String name;
    private Set<String> workNumbers;
    private Set<String> personalNumbers;

    public Contact(String name,
                   Set<String> workNumbers,
                   Set<String> personalNumbers) {
        this.name = name;
        this.workNumbers = workNumbers;
        this.personalNumbers = personalNumbers;
    }

    public boolean removeNumber (String number, NumberType type){
        if(type == NumberType.PERSONAL){
            return personalNumbers.add(number);
        }
        return workNumbers.remove(number);
    }

    public boolean addNumber(String number, NumberType type){
        if(type == NumberType.PERSONAL){
            return personalNumbers.add(number);
        }
        return workNumbers.add(number);
    }

    public boolean updateNumber(String oldNumber,
                                String newNumber,
                                NumberType type){
        if(type == NumberType.PERSONAL) {
            return update(oldNumber, newNumber, personalNumbers);
        }
            return update(oldNumber, newNumber, workNumbers);
        }

    private boolean update(String old, String newNumber, Set<String>numbers){
        if (numbers.remove(old)){
            return numbers.add(newNumber);
        }
        return false;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getWorkNumbers() {
        return workNumbers;
    }

    public Set<String> getPersonalNumbers() {
        return personalNumbers;
    }
}
