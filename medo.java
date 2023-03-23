package csen1002.main.task5;
public class medo {
    public static void main(String[] args){
        CfgLeftRecElim cfg=new CfgLeftRecElim("S; T; L#a; b; c; d; i#S/ScTi, La, Ti, b; T/aSb, LabS, i; L/SdL, Si");
        cfg.eliminateLeftRecursion();
        System.out.println(cfg.toString());
        
    }
}
