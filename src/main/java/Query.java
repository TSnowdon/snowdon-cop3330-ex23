import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class Query {
    private final String question;
    private final Query yes;
    private final Query no;

    public Query(String question, Query yes, Query no) {
        this.question = question;
        this.yes = yes;
        this.no = no;
    }

    public Query(String question) {
        this.question = question;
        this.yes = null;
        this.no = null;
    }

    public Query(String question, Query yes) {
        this.question = question;
        this.yes = yes;
        this.no = null;
    }

    public String getQuestion() {
        return question;
    }

    public Query getQuery(String input) {
        if (input.equalsIgnoreCase("y")) {
            return yes;
        } else if (input.equalsIgnoreCase("n")) {
            return no;
        } else {
            return null;
        }
    }

    public boolean askQuery() {
        System.out.print(question + " ");
        if (yes != null && no != null) {
            Query nextQuery = getQuery(new Scanner(System.in).nextLine());
            if (nextQuery != null) {
                // System.out.println("[Query Found] " + nextQuery);
                nextQuery.askQuery();
                return true;
            }
        }
        // System.out.println("[No Query]");
        return false;
    }

    @Override
    public String toString() {
        return "Query{" +
                "question='" + question + '\'' +
                ", yes=" + yes +
                ", no=" + no +
                '}';
    }
}
