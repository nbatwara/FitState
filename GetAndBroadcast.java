package Controller;

import java.net.Socket;
import java.util.ArrayList;

import module.NormalUser;
import module.Observer;
import module.PrimeUser;
import module.Subject;
import module.GroupChat;

public class GetAndBroadcast {
	private ArrayList<Subject> groups = new ArrayList<Subject>();
	private ArrayList<Observer> persons = new ArrayList<Observer>();
	private Subject curGroup;
	
	   public GroupChat buildANewGroup(String groupName){
		   Subject group = new GroupChat(groupName);
		   groups.add(group);
		   //curTopic = topic;
		   
		   //link
		   for(int i = 0; i < persons.size(); i++){
			   persons.get(i).linkToSubject(group);
		   }
		   
		   return (GroupChat)group;
	   }
	   
	   public NormalUser buildANewNormalUser(String name){
		   Observer person = new NormalUser(name);
		   persons.add(person);
		   
		   //link
		   for(int i = 0; i < groups.size(); i++){
			   person.linkToSubject(groups.get(i));
		   }
		   
		   return (NormalUser)person;
	   }
	  
	   public PrimeUser buildANewPrimeUser(String name){
		   Observer person = new PrimeUser(name);
		   persons.add(person);
		   
		   //link
		   for(int i = 0; i < groups.size(); i++){
			   person.linkToSubject(groups.get(i));
		   }
		   
		   return (PrimeUser)person;
	   }
	   
	   //false for unfounded topic or person based on the information provided.
	   public Boolean oneUserSpeaking(String userName, String topicName, String sayingWords){
		   
		    //Observer curPerson;
		    boolean foundUser = false;
		    for(int i = 0; i < persons.size(); i ++){
		    	
		    	if(persons.get(i).getName().equals(userName)){
		    		//curPerson = persons.get(i);
				    //curPerson.says(sayingWords, curTopic);
		    		foundUser = true;
		    	}
		    }
		    
		    if(foundUser == true){
			    ///System.out.println(topics.get(1).getTopicName()+", "+topicName);
			    for(int i = 0; i < groups.size(); i ++){
			    	if(groups.get(i).getTopicName().equals(topicName)){
			    		//System.out.println(topics.get(i).getTopicName()+", "+topicName);
			    		curGroup = groups.get(i);
			    		curGroup.setMsg(sayingWords, userName);
			    		return true;
			    	}
			    }
		    }
		    
		    return false;
	   }
	   
	   public String getMsgInCurGroup(String topicName, Socket socket){
		   String postMsg = "";
		   curGroup.postMsg();
		   for(int i = 0; i < persons.size(); i ++)
			   postMsg += persons.get(i).getPostLine();
		   
		   sendMsgToCLient(socket, postMsg);
		   
		   return postMsg;
	   }
	   
	   public String getCurGroupName(){
		   return curGroup.getTopicName();
	   }
	   /*
	   private void sendMsgToCLient(Socket s, String msg){
		   
	   }
	   */
	}






