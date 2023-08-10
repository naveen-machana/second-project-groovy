package com.naveen.groovy.practice.chapter4

class Book3 {
    private String titleWithPrivateModifier
    // make sure you dont modify the value in below methods
    // notice no return statement, as it is auto-generated
    private String getTitleWithPrivateModifier() {}
    private void setTitleWithPrivateModifier(title) {}
    private void poke(){
        println "Ouch!"
    }
}
