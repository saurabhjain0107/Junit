package com.example.junit

import android.content.Context
import android.content.pm.ApplicationInfo
import android.view.ActionProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class ResourceComparerTest {


    private lateinit var resourceComparer: ResourceComparer

    @Test
    fun stringResourceSameAsGivenString_returnTrue(){
        resourceComparer = ResourceComparer()
        val context : Context =
       val result = resourceComparer.isEqual(context,R.string.app_name,"Junit")
        assertThat(result).isTrue()
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnFalse(){
        resourceComparer = ResourceComparer()
        val result = resourceComparer.isEqual(context!!,R.string.app_name,"Juit")
        assertThat(result).isFalse()
    }

}