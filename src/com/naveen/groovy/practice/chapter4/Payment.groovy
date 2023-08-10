package com.naveen.groovy.practice.chapter4

class Payment{
    BigDecimal amount
    String type
    public Payment(BigDecimal amount, String type="cash" ){
        this.amount = amount
        this.type = type
    }
    String toString(){
        return "${amount} ${type}"
    }

    static void main(String[] args) {
        def pmt1 = new Payment(10.50, 'cash')
        println pmt1

        def pmt2 = new Payment(12.75)
        println pmt2
        def pmt3 = new Payment(15.99, "credit" )
        println pmt3
    }
}
