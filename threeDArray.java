class ThreeArray{
public static void main(String args[]){
//create a 3d array
int[][][] a={{
{1,-2,3},
{2,3,4},
{10,11,12}
},{{-4,-5,6,9},{1},{2,3}}
};
for(int[][] array2D:a){
for(int[] array1D:array2D){
for(int item:array1D){
System.out.println(item);}
}}
}}