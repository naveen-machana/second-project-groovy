package com.naveen.groovy.practice.dsl.chapter4

class TernaryElvisOperators {
    static void main(String[] args) {
        def x = [1]
        def y = x ?: [2]
        println y

        y = [0,2,3][0] ?: -1
        println y

        y = (6 << 1) ?: -1
        println y

        def a = 1, b = 2, c = 0
        println a == (b <=> c)

        def accounts =
                [new Balance(balance: 200.00, first: "fred", last: "flintstone"),
                 new Balance(balance: 100.00, first: 'Wilma', last: 'Flintstone'),
                 new Balance(balance: 100.00, first: "Barney", last: "Rubble"),
                 new Balance(balance: 100.00, first: "Betty", last: "Rubble")]

        def sorter = {a1, a2 -> a1.balance <=> a2.balance ?:
                                              a1.last <=> a2.last ?:
                                              a1.first <=> a2.first }
        accounts.sort sorter
        println accounts
    }

}

class Balance{
    String first
    String last
    BigDecimal balance
    String toString() { "$last, $first : $balance" }
}