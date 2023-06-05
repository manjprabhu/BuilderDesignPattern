package com.mnj.builderdesignpattern

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User.UserBuilder("abc", "xyz").age(10).address("address").build()

        println("==>> User: $user")

        val usr1 = User.UserBuilder("qwe", "rty").build()
        println("==>> User1: $usr1")

        val user2 =
            User.UserBuilder("ghj", "tii").age(25).phone("387843").address("This is address")
                .build()
        println("==>> user2 : $user2")

    }
}