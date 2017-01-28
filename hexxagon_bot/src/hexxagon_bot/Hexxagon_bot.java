package hexxagon_bot;
import java.util.*;
public class Hexxagon_bot {
	static Scanner  input=new Scanner(System.in);
	public static int[][] getMatrix(){
		//main array that has other arrays of columns		
		//seperate columns for keeping all input sorted columnwise
		int column1[]=new int[7];
		int column2[]=new int[7];
		int column3[]=new int[7];
		int column4[]=new int[7];
		int column5[]=new int[7];
		int column6[]=new int[7];
		int[] plot[]={column1,column2,column3,column4,column5,column6};
		//an int ic to use as an iterator and conditional operations based on current column number
		int ic=0;
		//an int i for iterating operations of while loop
		int i=0;
			//first column scanned
			if(ic==1){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
			//second columumn scanned here
			if(ic==2){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
			//third columumn scanned here
			if(ic==3){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
			//fourth columumn scanned here
			if(ic==4){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
			//fifth columumn scanned here
			if(ic==5){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
			//sixth columumn scanned here
			if(ic==6){
				while(i<6){
					column1[i]=input.nextInt();
					i++;
				}
				ic++;
				i=0;
				}
		//return 1;
		return plot;
	}
	public static void main(String[] arg){
		getMatrix();
		//System.out.println(getMatrix());
		//int moves=input.nextInt();
		int playerID=input.nextInt();
		int mainPlot[][]=getMatrix();
		checkDefence(mainPlot,playerID);
		
	}



@SuppressWarnings({ "rawtypes", "unchecked" })
public static void checkDefence(int[][] plot,int playerID){
	//co-ordinates of enems
	LinkedList enemyx=new LinkedList();
	LinkedList enemyy=new LinkedList();
	//iterator for enem
	int n=0;
	//co-ordinates of player stones stones for next one step
	LinkedList myx=new LinkedList();
	LinkedList myy=new LinkedList();
	//iterator for my
	int m=0;
	//co-ordinates of empty
	LinkedList emptyx=new LinkedList();
	LinkedList emptyy=new LinkedList();
	//iterator for empty
	int l=0;
	//iterator parameter
		int i=0;
	while(i<63){
		for(int j=0;j<7;j++){
			for(int k=0;k<6;k++){
				if(plot[j][k]==0){
					emptyx.add(l,j);
					emptyy.add(l,k);
				}
				if((plot[j][k]==1 && playerID==2) || (plot[j][k]==2 && playerID==1)){
					enemyx.add(n,j);
					enemyy.add(n,k);
				}
				if((plot[j][k]==2 && playerID==2) || (plot[j][k]==1 && playerID==1)){
					myx.add(m,j);
					myy.add(m,k);
				}
			}
		}
		i++;
	}
	for(int enem=0;enem<enemyx.size();enem++){
	System.out.println(enemyx.get(enem));// + enemyy.get(1));
	System.out.println(enemyy.get(enem));
	}
	for(int myfor=0;myfor<myx.size();myfor++){
		System.out.println(myx.get(myfor));// + enemyy.get(1));
		System.out.println(myy.get(myfor));
		}
	for(int emptyfor=0;emptyfor<enemyx.size();emptyfor++){
		System.out.println(emptyx.get(emptyfor));// + enemyy.get(1));
		System.out.println(emptyy.get(emptyfor));
		}
}

}