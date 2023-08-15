package com.naveen.groovy.practice.dsl.chapter4

class Customer {
    def id
    def name
}

class Account {
    int id
    double balance
    Customer owner

    void credit (double deposit) {
        balance += deposit
    }

    String toString() {
        "Account id $id owner $owner.name balance is $balance"
    }
}

customer = new Customer(id: 1, name: 'Aaron Anderson')
accountParams = [id: 2, balance: 0.00, owner: customer]
savings = new Account(accountParams)

savings.credit 20.00
println savings

def map = [a: 'a', b: 'b', c: [d: 'd', e: ['f', 'g']]]
assert map.c.e[1] == 'h' : 'map.c.e[1] is not h'