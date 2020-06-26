package BestExmaples.hardTest.libraryPuzzlers.client;
import BestExmaples.hardTest.libraryPuzzlers.library.Api;
public class Client {
    public static void main(String[] args) {
       //System.out.println(Api.member.hashCode());
        System.out.println(((Object)Api.member).hashCode());
    }
}
