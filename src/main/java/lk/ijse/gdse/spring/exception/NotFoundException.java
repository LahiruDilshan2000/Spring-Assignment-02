package lk.ijse.gdse.spring.exception;

/**
 * @author Lahiru Dilshan
 * @created Mon 9:33 AM on 9/18/2023
 * @project Spring-Assigment-02
 **/
public class NotFoundException extends RuntimeException{
    public NotFoundException(String massage){
        super(massage);
    }
}
