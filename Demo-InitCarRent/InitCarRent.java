package com.carrent.zx;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitCarRent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("-----欢迎进入达达租车系统！-----");
    for(;;){
    	System.out.println("您是否要租车：1.是       0.否");
    	//从键盘输入一个数字，并将其值赋给choice;
    	Scanner in=new Scanner(System.in);
    	int choice = 0;
    	try{
    	 choice = in.nextInt();   //赋值给choice.
    	}catch(Exception e){
    		System.out.println("指令错误！请重新输入");
    		continue;
    	}
    	if(choice == 0 ){
    		in.close();
    		break;
    	}
    	else if( choice==1 ){
    		System.out.println("您可租车的类型及其价目表：");
    		System.out.println("序号\t汽车名称\t租金(元/天)\t容量");
    		List<Car> carList =initCarList();
    		int[][] carNumber = selectCar(carList,in);
    		printOrder(carList,carNumber);
    		System.out.println();
    		in.close();
    		break;
    	}
    	else{
    		System.out.println("指令有误，请从新输入。");
    		continue;
    	}
    }
    System.out.println("感谢使用达达租车系统！");
	}
	private static List<Car> initCarList(){
		// TODO Auto-generated method stub
		List<Car> carList =new ArrayList<Car>();
		carList.add(new Bus("奥迪A4",500,4));
		carList.add(new Bus("马自达6",400,4));
		carList.add(new Pickup("皮卡雪6",450,4,2));
		carList.add(new Bus("金龙",800,20));
		carList.add(new Trunk("松花江",400,4));
		carList.add(new Trunk("依维柯",1000,20));
		
		for(int i=0;i<carList.size();i++){
			System.out.println((i+1)+"\t"+ carList.get(i).toString());
		}
		return carList;
	}

	

	private static int[][] selectCar(List<Car> carList, Scanner in) {
	int carTypeNumber = carList.size();
	int[][]carNumber =new int [carTypeNumber][3];
	for(int i=0;i<carTypeNumber;i++){
		carNumber[i][0]=i+1;
		System.out.println("请输入第"+(i+1)+"种车("+carList.get(i).getType()+")的数量，没有请输0：");
		
		try{
			carNumber[i][1]=in.nextInt();
		}catch(Exception e){
			System.out.println("由于你操作异常，自动退出");
			return carNumber;
		}
		
	if(carNumber[i][1]==0){
			continue;	
	}else{
		//每一种车的租金
		carNumber[i][2] =0;
		int carRentDay = 0;
		for(int j=1;j<=carNumber[i][1];j++){
			System.out.println("请输入第"+j+"辆车("+carList.get(i).getType()+")的天数：");
			try{
				 carRentDay =in.nextInt();			
			}catch(Exception e){
				System.out.println("由于你操作异常，自动退出");
				return carNumber;
			}
			if(carRentDay<=0){
				j--;
				System.out.println("请输入一个>=1的数字。");
				continue;
			}else{
				carNumber[i][2]+=carRentDay;
			}
		}		
	}		
	}
	return carNumber;
	}

	private static void printOrder(List<Car> carList, int[][] carNumber) {
		// TODO Auto-generated method stub
		List<Car>selectedCars =new ArrayList<Car>();
		int carTypeNumber =carList.size();
		int[] rental =new int[carTypeNumber];
		int rentalSum =0;
		System.out.println();
		System.out.println("--------------------------------------");
		System.out.println("您的订单：");
		System.out.println("汽车名称\t数量\t天数\t每日租金\t总租金\t");
		
		for(int i=0;i<carTypeNumber;i++){
			for(int j=0;j<carNumber[i][1];j++){
				selectedCars.add(carList.get(i));
			}
			rental[i]=carNumber[i][2]*carList.get(i).getPrice();
			rentalSum+=rental[i];
			System.out.println(carList.get(i).getType()+"\t"+carNumber[i][1]+"\t"+carNumber[i][2]+"\t"+carList.get(i).getPrice()+"\t"+rental[i]);
			System.out.println("--------------------------------");
			System.out.println("\t\t\t总金额为："+rentalSum);
		}
	}

}
