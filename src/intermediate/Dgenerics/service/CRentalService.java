package intermediate.Dgenerics.service;

import intermediate.Dgenerics.domain.Car;

import java.util.List;

public class CRentalService<T> {

        private List<T> objectAvailable;

    public CRentalService(List<T> objectAvailable) {
        this.objectAvailable = objectAvailable;
    }

    public  T retrieveAvailableObject(){
            System.out.println("Searching for any car available");
            T t = objectAvailable.remove(0);
            System.out.println("Renting the car: "+t);
            System.out.println("Available object to rent: "+ objectAvailable);
            return t;
        }

        public void returnRentedObject(T t){
            System.out.println("Returning the object: "+t);
            objectAvailable.add(t);
            System.out.println("Available object to rent: "+ objectAvailable);
        }


}
