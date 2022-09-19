import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Astronaut> members = new ArrayList<Astronaut>();

    public Team(String team_name){
        this.name = team_name;
    }
    public String getName(){
        return this.name;
    }
    public void add(Astronaut new_member){
        members.add(new_member);
    }
    public void remove(Astronaut removed_member){
        members.remove(removed_member);
    }
    public int countMembers(){
        return members.size();
    }
    public void showMembers(){
        if (this.members.size() > 0){
            String list = this.name + ": ";
            for (Astronaut member: members){
                if (member.getDestination() != null){
                    list = list + member.getName() + " on mission, ";
                }
                else{
                    list = list + member.getName() + " on standby, ";
                }
            }
            list = list.substring(0,list.length()-2);
            list = list + ".";

            System.out.println(list);
        }
    }
    public void doActions(){
        System.out.println(this.name + ": Nothing to do.");
    }
    public void doActions(planet.Mars new_destination){
        for(Astronaut member: members){
            member.doActions(new_destination);
        }
    }
    public void doActions(chocolate.Mars new_snack){
        for(Astronaut member: members){
            member.doActions(new_snack);
        }
    }
}
