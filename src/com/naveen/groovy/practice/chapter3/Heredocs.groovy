package com.naveen.groovy.practice.chapter3

class Heredocs {
    static void main(String[] args) {
        String s = """This is a
        multi-line String.
        "You don't need to escape internal quotes", he said.
        """

        def ss = '''This
        That, The Other'''

        def xml = """
<book id="987" >
    <title>Groovy Recipes</title>
    <author>Scott Davis</author>
</book>
        """
    }
}
