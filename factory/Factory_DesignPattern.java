package FactoryDesignPattern;

import java.util.Scanner;

public class Factory_DesignPattern {
	public static void main(String[] args) {
		BranchFactory branchfactory=new BranchFactory();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the branch");
		String branch=sc.next();
		Branch b=branchfactory.getBranch(branch);
		b.No_of_Students();
	}
}
