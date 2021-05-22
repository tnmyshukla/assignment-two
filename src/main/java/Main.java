public class Main {
    //Main Class
    public static void main(final String[] args){

        final UserManager userManager=new UserManager();
        try{
            userManager.startManager();
        }catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
