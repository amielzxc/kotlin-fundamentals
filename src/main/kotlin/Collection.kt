fun main() {
    //List, set, Map

//    //immutable
//    val airlines= listOf("Cebu Pacific", "PAL", "Air asia");
//
//    //gets and returns the value of an element in a list
//    println(airlines[1]);
//    //gets and returns the value of an element in a list
//    println(airlines.get(1));
//
//
//    //mutable
//    val terminals= mutableListOf<Int>(1,2,3,4)
//    println(terminals);
//
//    //add 5 to the list
//   terminals.add(5)
//    println(terminals);
//
//
//    //adds an array/list to an existing array/list and you can choose where to put it
//    terminals.addAll(0, mutableListOf(1,2,3));
//    println(terminals);
//
//    //checks if the array/list has that specified object or element and returns true if it does, and false if otherwise
//    println(terminals.contains(7));
//
//    //removes an element based on an specified index
//    terminals.removeAt(0);
//    println(terminals);


    //Set -> it contains unique set of elements

//    val usernames: Set<String> =setOf("Brandon","Amelia","Charlie");
//    println(usernames);
//    println(usernames.last());
//    println(usernames.size);
//
//    val students: MutableSet<String> = mutableSetOf("Brandon","Amelia","Charlie");
//    println(students);
//    students.add("Amiel"); // adds "Amiel" to the Set
//    println(students);
//    students.add("Amiel"); // tries to add "Amiel" to the Set but fails since a Set does not accept duplicate data/element
//    println(students);
//    println(students.size); //returns the size of the Set
//    students.remove("Amiel") //removes "Amiel" which is an element of the Set
//    println(students);
//    students.clear(); //Clears or removes all existing data in the list
//    println(students);


    //Map -> Collection of <Key, Value> pairs

    val studentDetails: MutableMap<String, String> =
        mutableMapOf("firstName" to "Brandon",
            "lastName" to "Diaz",
            "yrLevel" to "first",
            "section" to "A");

    println(studentDetails);

    println(studentDetails.keys) //get the keys of the map
    println(studentDetails.values) //get the values of the map

    studentDetails.remove("section"); //removes the key "section" and its value
    println(studentDetails);

    studentDetails.replace("yrLevel","second") //changes the value of the key pair
    println(studentDetails);

    studentDetails.putIfAbsent("section","B") //adds or inserts the key-value pair if the specified key is not yet existing in the map
    println(studentDetails);

    println(studentDetails.entries); //get all pairs

    studentDetails.clear() //clears the map
    println(studentDetails);

}