/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itounanako
 */
//クラスの継承
class TestData11 extends DataClass {
    
    @Override
    public void setTest(String n,int a){
    
        this.name=n;
        
        this.i=a;
        
        
    }
    
}
//実行クラス
public class TestData10{
    
    public static void main(String[] args){
        
        TestData11 fruits=new TestData11();
        
        fruits.setTest(null,0);
        
        System.out.print(fruits.name);
        
        System.out.print(fruits.i);
        
    }
    
}
