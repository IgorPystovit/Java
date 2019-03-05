package seventhChapter.Rodents;

public class Characteristic{
    private String charVar;

    public void setCharVar(String charVar){
        this.charVar = charVar;
    }

    public String getCharVar(){
        return charVar;
    }

   public Characteristic(String charVar){
        setCharVar(charVar);
        System.out.println("Creating a Characteristic "+getCharVar());
    }

    public void erase(){
        System.out.println("Erasing a Characteristic "+getCharVar());
        setCharVar("");
    }
}
