package npcOrigin;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Npc> group = new ArrayList<>();

    public void join(String npcName, String originName, String originFeature){
        Origin origin = OriginFactory.getOrigin(originName, originFeature);
        Npc npc = new Npc(npcName, origin);
        group.add(npc);
    }

    public List<String> getMembers(){
        List<String> output = new ArrayList<String>();
        for (Npc npc: this.group){
            output.add(npc.toString());
        }
        return output;
    }
}
