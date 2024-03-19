package com.example.myapplication
/*
data class Employer(var username :String,var email :String) {
    //make class as data class put keyword data,
}//data class is all in a single word compared to pojo class
enum class HttpStatus(val code :Int){

    ok(200),
    NOT_FOUND(400),
    SERVER_ERROR(500),
    BAD_REQUEST(300)
}

 */
sealed class Result {//In this example, Result is a sealed class with two subclasses: Success and Error. Both subclasses are declared within the same file as the Result sealed class.
    data class Success(val data: String) : Result()
    data class Error(val message: String) : Result()
}
fun getdata() :Result{
    return  Result.Success("200")
}
fun handleResult(result: Result) {
    when (result) {
        is Result.Success -> {
            println("Success: ${result.data}")
        }
        is Result.Error -> {
            println("Error: ${result.message}")
        }
    }
}
fun main(){
   var mydata= getdata();
    when(mydata){
        is Result.Success -> println("REceived data from server $mydata")
           is Result.Error -> println("eceivev failure data from server $mydata")
        }



    val successResult = Result.Success("Data received")
    val errorResult = Result.Error("Failed to fetch data")

    handleResult(successResult) // Output: Success: Data received
    handleResult(errorResult)   // Output: Error: Failed to fetch data

    /*
var myStatusCode=HttpStatus.ok.code
    when(myStatusCode){
        200-> println("response from server");
        400-> println("")
    }
    //////////////////////
    var emp1=Employer("abc","a.com")
    var emp2=Employer("abc","a.com")
    if(emp1==emp2) {//comparing data not address, becose we given data keyword
        println("both are same")
    }
        else{
            println("not same")
    }
    println(emp2.email)//we have to explicitly convert to a string
    emp1.email="123234"//setting data
  var emp3 =emp1.copy("ben","ben.com")//copying one object to other

 */

}

//in pojo class normally we implementing get data set data, but in data class predefined everything
//POJO: In Java, you need to define constructors explicitly, including default constructors if needed.

//Data Class: Kotlin data classes automatically provide a default constructor that initializes properties declared in the primary constructor.