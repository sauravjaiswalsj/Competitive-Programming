import java.util.Scanner;
public class PattenrTriangle{
	public static void main+(String[] args){

        int nr;
        std::cin>>nr;
        int row=1;
        int val,nst=1,nsp=nr-1;
        while(row<=nr){
                val=1;
                int csp=1;
                while(csp<=nsp){
                        std::cout<<"  ";
                        csp++;
                }
                int cst=1;
                while(cst<=nst){
                        std::cout<<val<<" ";
                        //prep
                        if(cst<=nst/2){
                                val++;
                        }else{
                                val--;
                        }
                        cst++;
                }
                //prep
                std::cout<<std::endl;
                nsp--;
                nst+=2;
                row++;
        }
}
