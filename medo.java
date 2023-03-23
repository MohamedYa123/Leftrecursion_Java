package csen1002.main.task5;

import csen1002.tests.task5.Task5TestsBatch0;

public class medo {
    public static void main(String[] args){
        read();
    }
    static void read(){
        System.out.println("\r\n");
        String question="S;Z;J;O;X#b;k;q;t;z#S/SXbX,z;Z/XJXO,XOz,XzJbO,bOzZ,bZq,q;J/JSkZ,Jb,Oz,XkZb,bZSO,zXZJO;O/OZkJk,SJJ,SJtO,qJJJO,tOzXt;X/OkS,SJXkZ,StZO,XJ,XzJq,kXtXZ";
        CfgLeftRecElim cfgLeftRecElim= new CfgLeftRecElim(question);
		cfgLeftRecElim.eliminateLeftRecursion();
        var solution="S;Z;J;O;X;S';J';O';X'#b;k;q;t;z#S/zS';Z/XJXO,XOz,XzJbO,bOzZ,bZq,q;J/OzJ',XkZbJ',bZSOJ',zXZJOJ';O/zS'JJO',zS'JtOO',qJJJOO',tOzXtO';X/zS'JJO'kSX',zS'JtOO'kSX',qJJJOO'kSX',tOzXtO'kSX',zS'JXkZX',zS'tZOX',kXtXZX';S'/XbXS',e;J'/SkZJ',bJ',e;O'/ZkJkO',e;X'/JX',zJqX',e";
		System.out.println(solution);
		System.out.println("\r\n\r\n");
        System.out.println(cfgLeftRecElim.toString());
		if(solution.contains(cfgLeftRecElim.toString())){
            System.out.println("Matched ^_^");
        }
        else{
            System.out.println("Not Matched :(");
        }
    }
}
