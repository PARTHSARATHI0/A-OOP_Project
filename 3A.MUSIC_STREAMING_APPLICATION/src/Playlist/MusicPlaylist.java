package Playlist;

import java.util.LinkedList;
import java.util.Scanner;

public class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    // Add a song to the playlist ;
    public void addSong(String song) {
        playlist.add(song);
        System.out.println(song + " added to the playlist.");
    }

    // Remove a song by name
    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println(song + " removed from the playlist.");
        } else {
            System.out.println(song + " not found in the playlist.");
        }
    }

    // Move a song to a different position in the playlist ;
    public void moveSong(String song, int newPosition) {
        if (playlist.remove(song)) {
            if (newPosition > playlist.size()) {
                playlist.addLast(song);
            } else {
                playlist.add(newPosition - 1, song);
            }
            System.out.println(song + " moved to position " + newPosition);
        } else {
            System.out.println(song + " not found in the playlist.");
        }
    }

    // Display the playlist
    public void displayPlaylist() {
        System.out.println("Current Playlist:");
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            int i = 1;
            for (String song : playlist) {
                System.out.println(i + ". " + song);
                i++;
            }
        }
    }

    public static void main(String[] args){
        MusicPlaylist myPlaylist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        String command;

        while (true){
            System.out.println("\nEnter a command (add, remove, move, display, exit): ");
            command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Enter the name of the song to add:");
                    String songToAdd = scanner.nextLine();
                    myPlaylist.addSong(songToAdd);
                    break;
                case "remove":
                    System.out.println("Enter the name of the song to remove:");
                    String songToRemove = scanner.nextLine();
                    myPlaylist.removeSong(songToRemove);
                    break;
                case "move":
                    System.out.println("Enter the name of the song to move:");
                    String songToMove = scanner.nextLine();
                    System.out.println("Enter the new position:");
                    int newPosition = scanner.nextInt();
                    scanner.nextLine();
                    myPlaylist.moveSong(songToMove, newPosition);
                    break;
                case "display":
                    myPlaylist.displayPlaylist();
                    break;
                case "exit":
                    System.out.println("Exiting the playlist manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}
