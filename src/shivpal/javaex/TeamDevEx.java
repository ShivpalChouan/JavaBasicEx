/**
 * 
 */
package com.shivpal.javaex;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.function.Function.identity;

/**
 * @author Shivpal.Chouhan
 *
 */
public class TeamDevEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Developer> team = new ArrayList<>();
        Developer shivpal = new Developer("shivpal");
        shivpal.add("clojure");
        shivpal.add("scala");
        shivpal.add("groovy");
        shivpal.add("go");
        shivpal.add("java");

        Developer rahul = new Developer("Rahul");
        rahul.add("java");
        rahul.add("javascript");
        
        Developer gotam=new Developer("gotam");
        gotam.add("scala");
        gotam.add("c#");
        gotam.add(".net");
        gotam.add("java"); 
        
        
        team.add(shivpal);
        team.add(rahul);
        team.add(gotam);

        List<String> teamLanguages = team.stream().
                map(d -> d.getLanguages()).
                flatMap(l -> l.stream()).distinct().
                collect(Collectors.toList());
       // Team languages name  
        System.out.println(teamLanguages);
        
        
        
       List<MyUser> userList=new ArrayList<MyUser>();
       userList.add(new MyUser("shivpal", "IT"));
       userList.add(new MyUser("mohan", "IT"));
       userList.add(new MyUser("rohit", "HR"));
       userList.add(new MyUser("gopal", "IT"));
       userList.add(new MyUser("amar", "HR"));
       
       //list of the user grouping by DEPT
       Map<String,List<MyUser>> result=
       userList.stream().map(user -> user ).collect(groupingBy(l->l.getDept()));
       System.out.println(result);
       
       // user count based on department       
       Map<String,Long> deptUser=userList.stream().map(user->user.getDept()).collect(groupingBy(identity(),counting()));
       System.out.println(deptUser);
       
	}
	
	
	

}


class Developer {
	    private String name;
	    private Set<String> languages;

	    public Developer(String name) {
	        this.languages = new HashSet<>();
	        this.name = name;
	    }

	    public void add(String language) {
	        this.languages.add(language);
	    }

	    public Set<String> getLanguages() {
	        return languages;
	    }
	
}


class MyUser{
	private String name;
	private String dept;
	public MyUser(String name, String dept) {		
		this.name = name;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return " {name=" + name + ", dept=" + dept + "}";
	}
	
	
}