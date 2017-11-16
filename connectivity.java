/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package com.company;

import com.sun.xml.internal.ws.api.pipe.FiberContextSwitchInterceptor;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String fileName = "/home/robert/PycharmProjects/find/Graph.txt";

        String content = read_input(fileName);

        //  should now containt a list of all the graph edges
        //  with each entry looking like
        //  11111, 222222
        ArrayList<String> split_contents = split(content, "\n");

        ArrayList<Integer> a_list = new ArrayList<Integer>();
        ArrayList<Integer> b_list = new ArrayList<Integer>();

        int count = 0;
        int length = split_contents.size();

        System.out.println(length);
        while (count < length) {
            String WorkingString = split_contents.toArray()[count].toString();
            String[] result = WorkingString.split(",");
            System.out.println(WorkingString);
            a_list.add(Integer.parseInt(result[0]));
            b_list.add(Integer.parseInt(result[1]));
            count+=1;
        }


        HashMap<String, Node> graph = new HashMap<String, Node>();




    }

    public class Node {
        Integer vertex_label;
        ArrayList<Node> adjacencyList;
    }

    public static boolean connectivity(int x, int y) {
        return false;
    }

    private static String read_input(String fileName) {

        String fileAsString = null;
        try {
            InputStream is = new FileInputStream(fileName);
            BufferedReader buf = new BufferedReader(new InputStreamReader(is));

            String line = buf.readLine();
            StringBuilder sb = new StringBuilder();

            while(line != null){
                sb.append(line).append("\n");
                line = buf.readLine();
            }

            fileAsString = sb.toString();

            return fileAsString;
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
        catch(IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        return fileAsString;
    }

    private static ArrayList<String> split(String input, String split) {
        return new ArrayList<String> (Arrays.asList(input.split(split)));
    }

}

