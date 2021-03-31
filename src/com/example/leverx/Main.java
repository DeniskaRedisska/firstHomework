package com.example.leverx;

/*First of all, make sure that your path environment variable is set correctly.
    To compile this class from command line, you should write:
    javac  path_to_project_root/src/com/example/leverx/Main.java -d path_to_project_root/out
    This command will create Main.class file in package out, because there is a -d flag, which tells javac
    where to place .class file

    To run this file, you should write:
    java -cp path_to_project_root/out com.example.leverx.Main
     -cp flag tells java where to find needed class

    Then, if you want to create executable jar file, you should:
    First of all, open command line from the project root!
    After that, you should write:
    jar -cf main.jar out/com/example/leverx/Main.class
    main.jar is a name of created jar, out/com/example/leverx/Main.class - path to class file
    This command will create jar file in a project root


    There is another way to create jar file. We can use manifest file, which contains info about classes we need.
    Manifest file is located at META-INF directory. So you should write in command line:
    jar -cmf META-INF/manifest.mf main.jar
    -m flag tells java to use manifest file, META-INF/manifest.mf - manifest path
    Manifest may be useful when we need to include lot of classes into jar

    To run jar, you need to write the following command in command line:
    java -jar main.jar
    * */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
