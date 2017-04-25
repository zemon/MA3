package transition_system.ast;

public class State {
    public int id;
    public boolean init;
    public String[] labels;
    public int[] transitions;

    public State(int id, boolean init, String labels, String transitions){
        this.id = id;
        this.init = init;
        System.out.println("LabelOrg: " + labels);
      
        this.labels = labelList(labels);
        
        this.transitions = transitionList(transitions);

    }
    
   public String[] labelList(String labels){
	   
	   String[] strings = labels.split(",");
	   for(String string : strings){
		   System.out.println("Label: " + string);
	   }
	   return strings;
	   
   }
   public int[] transitionList(String transitions){

	   String[] stringArray = transitions.split(" ");
	   for(String string : stringArray){
		   System.out.println("Edge " + string);
	   }
	   
	   int[] intArray = new int[stringArray.length-1];
	   
	   for(int i = 0; i < stringArray.length -1 ; i++){
		   intArray[i] = Integer.parseInt(stringArray[i]);
	   }
	   return intArray;
	   
   }

    public String toString(){
        String labelS = "";
        String transitionsS = "";
        for (String label : labels){
            labelS = labelS + " " +label;
        }
        for(int transition : transitions){
            transitionsS = transitionsS +" "+ transition;
        }
        return "id: "+ id + " init: " + init + " label: " + labelS + " transitions to: " + transitionsS;
    }
    

    public boolean equals(Object other){
        if(other==null) return false;
        if(other==this) return true;
        if(!(other instanceof State)) return false;
        State otherState = (State)other;
        return this.id == otherState.id;
    }
}