package hipster.controller;

import hipster.model.Hipster;

public class HipsterController 
{
	private int [] numbers;
	private String [] words = {"This ","is the ","second hipster","level:","initalization","lists"};
	private Hipster [] hipsters;
			
	
	public HipsterController()
	{
		thirdLevelHipster();
		
		hipsters = new Hipster[6];
	}
	
	private void thirdLevelHipster()
	{
		numbers = new int [] {0,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0};
	}
	
	public void start()
	{
		for(int index = 0; index < hipsters.length; index++)
		{
			hipsters[index] = new Hipster("Hipster # " + index);
		}
		
		for(Hipster currentHipster : hipsters)
		{
			System.out.print(currentHipster + ", ");
		}
		System.out.println("Next");
		for(String currentWord : words)
		{
			System.out.print(currentWord + ", ");
		}
		System.out.println("Next");
		for(int tempInt : numbers)
		{
			System.out.println(tempInt +", ");
		}
	}
}