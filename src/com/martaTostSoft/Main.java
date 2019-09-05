package com.martaTostSoft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner in = new Scanner(System.in);
    private static final int NEW_VIDEO = 1;
    private static final int LIST_VIDEOS = 2;
    private static final int EXIT = 3;
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void main(String[] args) throws Exception {
        User user = new User(askUserName(), askUserSurname(), askUserPassword());
        boolean exit = false;
        int action = 0;
        do {
            action = askUserNextAction();
            switch (action) {
                case NEW_VIDEO:
                    System.out.println("To introduce a new video we need the next information:");
                    Video newVideo = new Video(askUrl(), askTitle(), askTags());
                    user.AddNewVideo(newVideo);
                    break;
                case LIST_VIDEOS:
                    List<Video> videoList = user.getVideoList();
                    printVideoList(videoList);
                    break;
                case EXIT:
                    System.out.println("Have a nice day " + user.getName() + "!");
                    exit = true;
                    break;
                default:
                    System.out.println("The option you have chosen is not correct, please try again.");
                    break;
            }
        } while (!exit);
    }

    private static String askUserName() throws Exception {
        System.out.println("What's your name?");
        String name = in.nextLine();
        checkIfThereIsInformation(name);
        return name;
    }

    private static void checkIfThereIsInformation(String information) throws Exception {
        if (information.equals("")) {
            throw (new Exception("Any field van't be empty"));
        }
    }

    private static String askUserSurname() throws Exception {
        System.out.println("What's your surname?");
        String surname = in.nextLine();
        checkIfThereIsInformation(surname);
        return surname;
    }

    private static String askUserPassword() throws Exception {
        System.out.println("What's your password?");
        String password = in.nextLine();
        checkIfThereIsInformation(password);
        return password;
    }

    private static int askUserNextAction() {
        System.out.println("What do you want to do?");
        System.out.println("1. Introduce a new video.\n2. List your videos. \n3. Exit");
        int option = in.nextInt();
        in.nextLine(); //throw away the \n not consumed by nextInt()
        return option;
    }

    private static String askUrl() throws Exception {
        System.out.println("URL: ");
        String url = in.nextLine();
        checkIfThereIsInformation(url);
        return url;
    }

    private static String askTitle() throws Exception {
        System.out.println("Title: ");
        String title = in.nextLine();
        checkIfThereIsInformation(title);
        return title;
    }

    private static List<String> askTags() {
        List<String> tags = new ArrayList<>();
        do {
            System.out.println("Tag:");
            tags.add(in.nextLine());
            System.out.println("Do you want to enter another tag? yes or no");
        } while (in.nextLine().toLowerCase().equals(YES));
        return tags;
    }

    private static void printVideoList(List<Video> videoList) {
        System.out.println("Your video's list is:");
        for (Video video : videoList) {
            System.out.print(video.getTitle() + "\t " + video.getUrl() + "\t ");
            for (String tag : video.getTags())
                System.out.print(tag + ", ");
            System.out.println("\n");
        }
    }
}
