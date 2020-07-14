package Pattern;

public class CPTTRN2 {
    CPTTRN2(int n,int m){
        int row=1;
        while(row<=n){
            for(int cst=1;cst<=m;cst++){
                if((row==1) || (row ==n ) || (cst ==1) || (cst==m)){
                    System.out.print("*");
                }else{
                    System.out.print(".");
                }
            }
            System.out.println();
            row++;
        }
    }
}
