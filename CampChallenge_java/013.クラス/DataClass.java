/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author itounanako
 */
class DataClass {
    
    
    //フィールドの宣言2つ・情報・属性
    public String name="";
    public int i=0;
    
    
    //メソッド①動作・インスタンスを操作する方法
    //引数として受け取った2つの変数をフィールドに格納する
    public void setTest(String n,int a){
    
        this.name=n;
        this.i=a;
    }
    
    public void print(){ 
         
        System.out.println(this.name);
        System.out.println(this.i);
        
        
    }
}