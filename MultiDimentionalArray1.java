class MultiDimentionalArray1{
public static void main(String args[]){
//create a 2d array
int[][] a={
{1,-2,3},{-4,-5,6,9},
{7},
};
//calculate the length of each row
for(int i=0;i<a.length;i++){
System.out.println("\n");
for(int j=0;j<a[i].length;++j){
System.out.println(a[i][j]);
}}
}}