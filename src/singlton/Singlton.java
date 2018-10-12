
package singlton;



public class Singlton {
     private static Singlton Sing = null;
      private String title;
    private Singlton() {
        title="welcome";
    }
       public static Singlton getInstance() 
    { 
        if (Sing == null) 
            Sing = new Singlton(); 
  
        return Sing; 
    } 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
       
} 
    

    
    
    

