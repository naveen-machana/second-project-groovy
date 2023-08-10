package com.naveen.groovy.practice.chapter4

class Ticket{
    static String buy(Integer quantity=1, String ticketType="adult" ){
        return "${quantity} x ${ticketType}"
    }

    static String buy3Params(Integer quantity=1, String ticketType="adult" ,
                      BigDecimal discount=0.0) {
        return "${quantity} x ${ticketType} x $discount"
    }

    static void main(String[] args) {
        println Ticket.buy()
        println Ticket.buy()
        println Ticket.buy(2)
        println Ticket.buy(4, "child" )
        // below stmt wont compile
        // println Ticket.buy3Params(0.15)
        println Ticket.buy3Params(1, 'adult', 0.15)
    }
}
