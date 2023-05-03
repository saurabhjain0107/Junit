package com.example.junit

object RegistrationUtil {

    private val  existingUser = listOf("Saurabh","Amit")

    /**
     * the input is not valid if.....
     * the username/password is empty
     * username already taken
     * confirm password is not same as real password
     * password contains less than 2 digit
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmpassword: String
    ): Boolean {
       if(username.isEmpty() || password.isEmpty()){
           return false
       }
        if(username in existingUser){
            return false
        }
        if(password != confirmpassword){
            return false
        }
        if(password.count{ it.isDigit() } < 2){
            return false
        }
        return true
    }

}