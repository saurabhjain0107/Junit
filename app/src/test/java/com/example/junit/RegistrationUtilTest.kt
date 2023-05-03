package com.example.junit

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "567",
            "567"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and password return true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Kamal",
            "567",
            "567"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Amit",
            "567",
            "567"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Amit",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Amit",
            "5678",
            "asfgfd"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password return false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Amit",
            "fafdve7",
            "fafdve7"
        )
        assertThat(result).isFalse()
    }

}