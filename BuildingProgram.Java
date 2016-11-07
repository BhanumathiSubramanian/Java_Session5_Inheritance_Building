class building
{
    void Individual()
    {
        System.out.println("This is an Individual House");
    }
    void Flat()
    {
        System.out.println("This is a flat system");
        
    }
    void Corporate()
    {
        System.out.println("This is for Corporate Purpose");
    }
    void Commercial()
    {
        System.out.println("This is Commercial");
    }
    
}
class buildingType extends building
{
       void Individual()
       {
           System.out.println("This is an Individual House");
       }
       void Commercial()
       {
           System.out.println("This is Commercial");
       }
    
}
public class BuildingProgram{

     public static void main(String []args){
        buildingType obj = new buildingType();
        obj.Individual();
        obj.Commercial();
     }
}
