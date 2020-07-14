package Pattern;

public class CPTTRN1 {
    public CPTTRN1(int n,int m){
        int row=1,nst=m;
        while(row<=n){
            for(int cst=1;cst<=nst;cst++) {
                if(((row & 1)==1)){
                    if(((cst & 1)==1)){
                        System.out.print("*");
                    }else{
                        System.out.print(".");
                    }
                }else{
                    if((cst&1)==1){
                        System.out.print(".");
                    }else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
            row++;
        }
    }
}
