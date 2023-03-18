package utils;


public class Validate {

    public void checkNumber(String telephone) throws Exception {
        if(!telephone.substring(0,1).equals("+")) {
            throw new PhoneException("Номер начинается с  '+' ");
        }

        else if(telephone.length() != 12) {
            throw new PhoneException("Длина телефона должна быть 11 символов");
        }
    }
}
