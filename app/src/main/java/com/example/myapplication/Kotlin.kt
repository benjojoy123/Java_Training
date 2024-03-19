package com.example.myapplication

import android.health.connect.datatypes.units.Length

fun main() {
    /*
    println("hello world");
    var myName : String ="benjo"
    var college ="ABC"
    college="dffd"
    var score=15;
    val id = 10;
    println("my name is $myName and length is ${myName.length} and id is $id and my college name is $college and score is $score");
   var age :Int =22;
    var doubleValue : Double=age.toDouble();//expicitly we need to make it double not work in automatic like java

  var day=16;
    when(day)//instead of switch
    {
        1-> print("today is monday")
        2->{
            println("today is tuesday")
            println("welcome");
        }
        3,4,5 -> println("days of the week")
        in 8 ..15 -> println("not days of the week")//it is just a hint to show in between not part of this
       // switch like statement, "in" is to show ,in between this range
        else -> println("no days entered")
    }
    for(i in 1 .. 10){//.. is a range operator
        println(i)
    }
    for (i in 10 downTo 1 step 2)//downto is ftn to print in reverse order,"step" to skip one number
    {//Downto is working is for loop becose reverse not possible here
        println(i)
    }
    //creating
    var myarr = arrayOf(4,5,6,7,"abc")
    for(i in myarr)
        println(i)
    println(".....................")
    for(i in 0 .. myarr.size-1)//
        println("index in $i and value is ${myarr[i]}")
myarr.forEach {
    println(it)//it will fetch data from array,till the data is comming from array no need to get end of data it eill do itself
}//this is a lambda ftn

    var mylist = mutableListOf<Int>(55,4,5,6)
    mylist.add(10)//difference between array and list array can not be expandable ,but data stored is sequentially in array not in list
    mylist.remove(4)
    mylist.forEach{
        println(it)
    }
    var i =100
    while( i in 100 downTo 1 ) {
        println(i);
        i--

    }
    println(".................")
    var j = 100
    while (j >= 1) {
        println(j)
        j -= 2 // Decrement i by 2
    }
    println("...........................")

    var myname :String?=null//it is an error,if i wan to use a null i need to add a ? ot is called null safty
    var colle :String? ="and"//to make this string as null
    colle=null
 var city : String? =null
    println("lenght of city ${city?.length}")//maked it as null , this is called as null safty


    var city : String? ="benjo"
    println("lenght of city ${city?.length}")


    var name="null"
    var country : String?="india"
    println("length of countr ${country!!.length}")//!! using it when iam sure the value is not null
    //var country : String?=null//it is error

    //println("length of countr ${country!!.length}")//!! using it when iam sure the value is not null


var countr : String? =null
    if(countr !=null) {
        println("${countr.length}")
    }
        else {
        println("-1")
    }
    var res= countr?.length ?: -1 //it is called elvis operator when the value is null right side get executed not null left side get executed
   println(res)


    var countr : String? ="benjo"
    if(countr !=null) {
        println("${countr.length}")
    }
    else {
        println("-1")
    }
    var res= countr?.length ?: -1 //it is called elvis operator when the value is null right side get executed not null left side get executed
    println(res)

    var myName : String ? ="ben"
    myName?.let { //it wil aloow you inside program if value not null
        println(myName.length)
    }

     var college : Any?="abc"// Any is super class of alll other classes use as int,string
     var  age :Int ? =college as? Int//typecasting error come,as? is called safe cast operator
    println(age)


    var college : Any=10// Any is super class of alll other classes use as int,string
    var  age :Int  =college as Int //typecasting error come,as? is called safe cast operator
    println(age) // ? it is applied only when null is there , other wise not used


    var college : Any=10// Any is super class of alll other classes use as int,string
    var  age :Int  =college as? String //typecasting error come,as? is called safe cast operator
    println(age)


println(getSum(10,15))
    println(getTypeFun(10))
    println(getData("benjo",24))//fun will take it as parameter if there is available default also
    println(getData("ben"))//fun will only take name and give allready availabe age
    println(getData())// what is provided defaulf will take by ftn
    println(myLambda(4,5))
    println(myHigherOrderFun(4,5, myLambdaadd))


    myhigherorderftn("meat",::tigereating)//::reflection


    var res = myhigherorderftn()//res becoming the ftn
    res("meat")
    myfun("heat");


    var myarr = arrayOf(1, 2, 3, 4, 532, 22, 1)
    var evenNumber = myarr.filter { it % 2 == 0 }// it will create a new list
    println(evenNumber)
    var mapres = myarr.map { it * 10 }
    println(mapres)
    myarr.reduce { res, myCurrEle ->//combining all the things in a list together
        println("now current element is $myCurrEle")
        println(res)
        res + myCurrEle
    }


    /////////////////////////
    var res=findMax(4,5)
    println("max number $res")
    println(showarea(4,5))
    /////////////////////////////////////


    println(myage);


    var tiger=Tiger();
    tiger.tigeriseating()
    var cub = Tiger().Cub().cubEating()


    var tiger=Tiger(11)//constructor in kotlin
    tiger.eating()


    var tiger=Tiger("bangalore")



    var tiger = Tiger(101,44)
*/
}

//fun playing(): unit{//void is unit
/*
fun playing(){
    println("playing")
}
fun getSum(a:Int,b:Int):Int{
 return a+b;
}
fun getTypeFun(myobj : Any): String {
    return when (myobj) {
        is String -> "it is a type of string"
        is Int -> "it is a type of integer"
        is Boolean -> "type boolean"
        else -> "No data"
    }
}


    ////////////////////////////////////////
    fun getData(name :String="abc",age : Int=123)
    {

        println("my name is $name and my age is $age")
    }
///////////////////////////////////////////////////
fun addNumber (a :Int, b:Int):Int{
    return a+b;

}
var myLambda: (Int, Int)-> Int ={a,b -> a+b}


///////////////////////////////////////////////
var myLambdaadd :(Int ,Int)->Int ={a,b -> a+b}
fun myHigherOrderFun(x:Int,y:Int,myFun :(Int,Int)->Int):Int{//it will returna interger
    Var res =myFun(x,y)
    return res;
}

fun tigereating(food: String)
{
    println("tiger is eating food")

}
fun myhigherorderftn(myfavFood :String,myfun:(String)-> Unit)//we are calling a ftn aswell as passing an argument to that ftn also
{
    myfun(myfavFood)//calling the function we passed and giving argument also

}


/////////////////////////////
fun myhigherorderftn():(String)-> Unit
{
    return ::tigereating

}


//////////////////////////////
var myfun=fun(food:string){//anonyms ftn
    println("tiger is eating food $food")
}
//////////////////////////////


fun findMax(a: Int,b:Int): Int = if(a>b) a else b
fun showarea(length: Int ,breath:Int):Int{

    fun calculateArea(): Int=length*breath//we can call a ftn inside a ftn
var area =calculateArea()
    return area
}
/////////////////////


val myage : Int
    get(){//custom accessor
        return 100
    }


class Tiger {
    var name = "abc"
    fun tigeriseating() {
        println("tiger is eating")
    }

    //do it with nested class
    inner class Cub {
        fun cubEating() {
            println("cub is eating and his fathr name is $name")//to acces a variable we need to make it as inner class
        }

    }
}

////////////////////////


open class animal{//dont have multiple inhertance in kotlin
   open fun animalEating(){
        println("animal eating")//With these changes, your Animal class is now open for inheritance, and its animalEating method is open for overriding.
    }
}
class Tiger :animal {
    var name = "abc"
    fun tigeriseating() {
        println("tiger is eating")
    }

    override fun animalEating() {

        super.animalEating()
    }
}

//here where is aces specifiers?,default here public


class Tiger(age:Int)
{

    var age =0;
    init{
        println("my primary constructor")
        this.age=age
    }
    var name ="abc"
    fun eating(){
        println("tiger is eating and his age is $age")

    }
/////////////////////////////////////

class Tiger{
constructor(){
    println("my secondary cons")
}
constructor(city : String)
{
    println("tiger is from $city")
}
    var name ="abc"
    fun eating(){
        println("tiger is eating and his age is ")

    }
}
/////////////////////////////////////////////

class Tiger(age : Int,hhhh:Boolean){
    var age = 0
    init {
        this.age = age
        println("age from primary cons is $age")
    }
    constructor(id : Int, myage : Int) : this(myage,true){
        println("my secondary const")
    }
    constructor(city : String,num1:Int,num2:Int) : this(num1,num2){
        println("city is $city")
    }
    var name = "abc"
    fun eating(){
        println("tiger eating and his age  ")
    }//call constructor from clas a to clas b pass data,inherit a to b

}

 */
class A{
    constructor(){
        println("constructor called")
    }

}
class B {
    constructor(){
        println("construor called")
    }
}