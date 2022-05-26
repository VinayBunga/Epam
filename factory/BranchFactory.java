package FactoryDesignPattern;

public class BranchFactory {
	public Branch getBranch(String branch) {
		if(branch.equalsIgnoreCase("CSE"))
			return new CSE_branch();
		else if(branch.equalsIgnoreCase("ECE"))
			return new ECE_branch();
		else if(branch.equalsIgnoreCase("IT"))
			return new IT_branch();
		return null;
	}
}
