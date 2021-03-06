package utilities;


import pojos.Country;
import pojos.Customer;
import pojos.Customer1;
//import pojos.States;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class WriteToTxt {
//fileName
    public static void saveDataInFile(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i=0;i<customers.length;i++)

                writer.append(customers[i].getSsn()+",\n");

            writer.close();
        } catch(Exception e){
            System.out.println("SaveDataInFile is failed");
        }
    }
    public static void saveDataInFileWithSSN(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getSsn());

            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithSSN(String fileName, Customer[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }


            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveDataInFileWithSSN(String fileName, Customer1[] customers)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i = 0; i < customers.length ; i++) {
                writer.append(customers[i].getSsn()+",\n");
            }


            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveDataInFileWithUserInfo(String fileName, Customer customer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            writer.append(customer.getUser().getFirstName());

            writer.close();
        } catch(Exception e){

        }
    }

//    public static void saveDataInFileWithAllCustomerInfo(String fileName, Customer[] customers)  {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//
//            for (int i =0; i<customers.length;i++){
//
//                writer.append(customers[i].getFirstName()+" , "+customers[i].getLastName()+"\n");
//                if(customers[i].getUser() != null)
//                    writer.append(customers[i].getUser().getFirstName());
//                if(customers[i].getCountry() != null)
//                    writer.append(customers[i].getCountry().getName());
//
//            }
//
//            writer.close();
//        } catch(Exception e){
//
//        }
//    }
//
//    public static void saveAllStates(String fileName, States[] states)  {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i=0; i<states.length; i++)
//                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
//
//            writer.close();
//        } catch(Exception e){
//
//        }
//    }
//
//
//
//    public static void saveAllStates2(String fileName, States[] states)  {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i=0; i<states.length; i++)
//                writer.append(states[i].getName()+" , "+states[i].getId()+"\n");
//
//            writer.close();
//        } catch(Exception e){
//
//        }
//    }
//
//
//    public static void saveAllCustomers(String fileName, Customer[]customers)  {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//
//            for (int i=0; i<customers.length; i++) {
//                writer.append(customers[i].getSsn() + "," + customers[i].getFirstName() + ",");
//                if(customers[i].getCountry() != null)
//                    writer.append(customers[i].getCountry().getName() + "," + customers[i].getCountry().getId() + ",\n");
//            }
//            writer.close();
//        } catch(Exception e){
//
//        }
//    }

    public static void saveAllCustomer(String fileName, Customer customer,String password,String username)  {
        try {

            String name ="C:\\Users\\kudik\\IdeaProjects\\LINNBANK\\src\\test\\resources\\test_data\\CustomerInformation.txt";
//fileName
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\kudik\\IdeaProjects\\LINNBANK\\src\\test\\resources\\test_data\\CustomerInformation.txt", true));
            //writer.append("Ibrahim");

            writer.append(password + "," +username+","+ customer.getFirstName() + ",");
            writer.append(customer.getLastName() + "," + customer.getSsn() + ",");
            writer.append(customer.getAddress() + "," + customer.getEmail() + ","+customer.getMobilePhoneNumber()+"\n");


            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveAllCustomersComingFromDB(String fileName, List<Object> allCustomer)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<allCustomer.size(); i++) {
                writer.append(allCustomer.get(i) + ",\n" );

            }
            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveDifferentInfoFromDB(String fileName, List<Object> data)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

            for (int i=0; i<data.size(); i++) {
                writer.append(data.get(i) + ",\n" );

            }
            writer.close();
        } catch(Exception e){

        }
    }


    public static void saveAccountInfo(String fileName, String description)  {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));


            writer.append(description + ",\n" );


            writer.close();
        } catch(Exception e){

        }
    }

    public static void saveCustomerInfo ( List <String> items){

        String fileLocation = "location";
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileLocation, true));
            for (int i = 0; i < items.size(); i++) {
                writer.append(items.get(i)+"\n");
            }


        }catch (Exception e){

        }


    }


    //hatice method ekleme
    public static void saveDataInFileWithCountrId(String fileName, Country[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                writer.append(countries[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }




//    public static void saveDataInFileWithStateid(String fileName, States[] sstates)
//
//
//    {
//        try {
//            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
//            for (int i = 0; i < sstates.length; i++)
//                writer.append(sstates[i].getId() + "\n");
//            writer.close();
//        } catch (Exception e) {
//        }
//
//
//    }

    public static void saveDataInFileWithCountryName(String fileName, Country[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                if(countries[i]!=null) {
                    writer.append(countries[i].getName() + "\n");
                }
            writer.close();
        } catch (Exception e) {
        }
    }

    public static void saveDataInFileWithCountryId(String fileName, Country[] countries) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            for (int i = 0; i < countries.length; i++)
                writer.append(countries[i].getId() + "\n");
            writer.close();
        } catch (Exception e) {
        }
    }


}