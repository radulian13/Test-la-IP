import com.packet.babies.babies;

/**
 * Created by VoldHouse on 10/20/2014.
 */
public class main {

    public static void main(String[] args){


        //aceasta este functia main
         int x=21;
        babies b=new babies("Tzimirrel",true,20,80,5);
            String[] ArrayOfStrings={"String1","String2","String3"};

        for(String string:ArrayOfStrings){
            System.out.println("This is a string: "+ string );
        }

        for(int i=0;i<=ArrayOfStrings.length;i++){
            try{
                System.out.println("This is a string: "+ ArrayOfStrings[i] );
            }
            catch(Exception e)
            {
                System.out.println("Exceptia este: "+e);
            }

        }
        b.poop();

    }
}
