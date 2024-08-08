 
package final_project;

public class TaskClass {


    private int id;
    private String des;
    private boolean iscompleted;
    private Dateclass dueDate;


    TaskClass(int nextId, String des, Dateclass date) {

    }


    public TaskClass(int id, String des, boolean iscompleted, Dateclass dueDate){

        this.id=id;
        this.des=des;
        this.iscompleted=false;
        this.dueDate=dueDate;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }
    public String getdes() {
        return des;
    }

    public void setdes(String description) {
        this.des = description;
    }

    public void isCompleted(boolean iscompleted) {
        this.iscompleted = iscompleted;
    }

    public String IsCompleted() {
        if (iscompleted==true){
            return "isCompleted";
        }
        else return "inProgres";
    }


    public Dateclass getdueDate() {
        return dueDate;
    }

    public void setdueDate(Dateclass dueDate) {
        this.dueDate = dueDate;
    }



}