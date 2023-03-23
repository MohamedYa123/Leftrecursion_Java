package csen1002.main.task5;

import java.util.ArrayList;

/**
 * Write your info here
 * 
 * @name Jane Smith
 * @id 46-0234
 * @labNumber 07
 */

public class CfgLeftRecElim {

	/**
	 * Constructs a Context Free Grammar
	 * 
	 * @param cfg A formatted string representation of the CFG. The string
	 *            representation follows the one in the task description
	 */
	String order="";
	String finalsolution="";
	public CfgLeftRecElim(String cfg) {
		// TODO Auto-generated constructor stub
		order=cfg;
	}

	/**
	 * @return Returns a formatted string representation of the CFG. The string
	 *         representation follows the one in the task description
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return finalsolution;
	}
	Boolean miniEncrypt;
	boolean checkdash(String variable,String formula,ArrayList<String> variables,ArrayList<String> formulas){
		boolean defFF=false;
		for(var a : formula.split(",")){
			if(a.startsWith(variable)){
				miniEncrypt=true;
				return true;
			}
			else if(variables.contains(a.substring(0,1))){
				int index=variables.indexOf(a.substring(0,1));
				defFF= checkdash(variable, formulas.get(index), variables, formulas);
				miniEncrypt=true;
				if(defFF==true){
					return defFF;
				}
			}
		}
		return defFF;
	}
	ArrayList<String> analyse(String variable,String formula,ArrayList<String> variables,ArrayList<String> formulas,boolean defaultencrypt)
	{
		ArrayList arr=new ArrayList();
		var listformulas=formula.split(",");
		var rightformula="";
		var leftformula="";
		boolean encrypt=false;
		boolean encrypt2=false;
		miniEncrypt=false;
		encrypt2=checkdash(variable, formula, variables, formulas);
		encrypt=miniEncrypt;
		if(!encrypt&&!defaultencrypt){
			rightformula+=","+formula;
			leftformula=",";
		}
		else{

		for (String formulaGen : listformulas)
		{
			String firstvariable=formulaGen.substring(0,1);
			if(variables.contains(firstvariable))
			{
				int index=variables.indexOf(firstvariable);
				String newformula="";
				for(var newf:formulas.get(index).split(",")){
					newformula+=newf+formulaGen.substring(1)+",";
				}
				newformula=newformula.substring(0,newformula.length()-1);
				var timedformula=analyse(variable, newformula, variables, formulas,encrypt2);
				
				rightformula+=","+timedformula.get(0);
				if(timedformula.get(1)!="")
				{
				leftformula+=","+timedformula.get(1);
				}
			}
			else if(firstvariable.contains(variable))
			{
				leftformula+=","+formulaGen.substring(1);
				if(true){
					leftformula+=variable+"'";
				}
			}
			else{
				rightformula+=","+formulaGen;
				if(encrypt2||defaultencrypt){
					rightformula+=variable+"'";
				}
			}
		}
		}
		if(leftformula.length()==0){
			leftformula=",";
		}
		arr.add(rightformula.substring(1));
		arr.add(leftformula.substring(1));
		return arr;
	}
	/**
	 * Eliminates Left Recursion from the grammar
	 */
	public void eliminateLeftRecursion()
	 {
		// TODO Auto-generated method stub
		//collecting left side variables
		order=order.replace(" ", "");
		var items=order.split("#");
		var leftsideVariables=items[0].split(";");
		var rightsidevariables=items[1].split(";");
		var sides=items[2].split(";");
		for(int ind=0;ind<sides.length;ind++){
			String vb=leftsideVariables[ind];
			String sd=sides[ind];
			sides[ind]=sd.replace(vb+"/", "");
		}
		//now analyse
		var solutionsleft=new ArrayList<String>();
		var solutionsright=new ArrayList<String>();
		var formulas=new ArrayList<String>();
		var variables=new ArrayList<String>();
		var allvariables=new ArrayList<String>();
		int i=0;
		for(var a: sides){
			var sol=analyse(leftsideVariables[i], a, variables, formulas,false);
			solutionsleft.add(sol.get(0));
			solutionsright.add(sol.get(1));
			if(sol.get(1)!=""){
				allvariables.add(leftsideVariables[i]+"'");
			}
			variables.add(leftsideVariables[i]);
			formulas.add(sol.get(0));
			i++;
		}
		//finally collecting solution ##
		finalsolution="";

		for(var a:leftsideVariables){
			finalsolution+=a+";";
		}
		for(var a:allvariables){
			finalsolution+=a+";";
		}
		finalsolution=finalsolution.substring(0,finalsolution.length()-1)+"#";
		for(var a :rightsidevariables){
			finalsolution+=a+";";
		}
		finalsolution=finalsolution.substring(0,finalsolution.length()-1)+"#";
		 i=0;
		for(var a:solutionsleft){
			finalsolution+=leftsideVariables[i]+"/"+a+";";
			i++;
		}
		i=0;
		for(var a :solutionsright){
			if(a!=""){
			finalsolution+=allvariables.get(i)+"/"+a+",e;";
			i++;
		}
		}
		finalsolution=finalsolution.substring(0,finalsolution.length()-1);
	}

}
