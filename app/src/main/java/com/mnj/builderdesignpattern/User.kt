package com.mnj.builderdesignpattern

class User internal constructor(userBuilder: UserBuilder) {
    var firstName: String
    var lastName: String
    var age: Int
    var phoneNumber: String?
    var address: String?

    class UserBuilder(val firstName: String, val lastName: String) {
        var age = 0
        var phone: String? = null
        var address: String? = null

        fun age(age: Int): UserBuilder {
            this.age = age
            return this
        }

        fun phone(phone: String?): UserBuilder {
            this.phone = phone
            return this
        }

        fun address(address: String?): UserBuilder {
            this.address = address
            return this
        }

        fun build(): User {
            return User(this)
        }
    }

    init {
        firstName = userBuilder.firstName
        lastName = userBuilder.lastName
        age = userBuilder.age
        phoneNumber = userBuilder.phone
        address = userBuilder.address
    }

    override fun toString(): String {
        return "User: $firstName  $$lastName  $age   $address  $phoneNumber"
    }
}