/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist.pkg2;

import java.util.*;

/**
 *
 * @author PC
 */
public class Playlist2 {

    /**
     * @param args the command line arguments
     */
    private static List<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
                Album album = new Album("Stormbringer", "Deep purple");
		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		album.addSong("Hold on", 5.6);
		album.addSong("Lady double dealer", 3.21);
		album.addSong("You cant do it right", 6.23);
		album.addSong("High ball shooter", 4.27);
		album.addSong("The gipsy", 4.2);
		album.addSong("Soldier of fortune", 3.13);
		
		albums.add(album);
		album = new Album("For those about to rock", "AC/DC");
		album.addSong("For those about to rock", 5.44);
		album.addSong("I put the finger on you", 3.25);
		album.addSong("Lets go", 3.45);
		album.addSong("Inject the venom", 3.33);
		album.addSong("Snowballed", 4.51);
		album.addSong("Evil walks", 3.45);
		album.addSong("C.O.D.", 5.25);
		album.addSong("Breaking the rules", 5.32);
		album.addSong("Night of the long knives", 5.12);
		albums.add(album);
		
		List<Song> playList = new LinkedList<>();
		albums.get(0).addToPlaylist("You cant do it right", playList); 
		albums.get(0).addToPlaylist("Holy man", playList); 
		albums.get(0).addToPlaylist("Speed king", playList); // Does not exist
		albums.get(0).addToPlaylist("Stormbringer", playList); 
		albums.get(0).addToPlaylist(9, playList);
		albums.get(1).addToPlaylist(8, playList);
		albums.get(1).addToPlaylist(3, playList);
		albums.get(1).addToPlaylist(2, playList);
		albums.get(1).addToPlaylist(6, playList);
		albums.get(1).addToPlaylist(24, playList);
		
		play(playList);
	}
	
	private static void play(List<Song> playList) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean forward =true;
		
		ListIterator<Song> listIterator = playList.listIterator();
		if(playList.size() == 0) {
			System.out.println("No songs in playlist");
			return;
		} else {
			System.out.println("Now playng " + listIterator.next().toString());
		}
		
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("Playlist complete");
				quit = true;
				break;
			case 1:
				if(!forward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					forward = true;
				}
				if(listIterator.hasNext()) {
					System.out.println("Now playing " + listIterator.next().toString());
				} else {
					System.out.println("We have reached the end of the playlist");
					forward = false;
				}
				break;
			case 2:
				if(forward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					forward = false;
				}
				if (listIterator.hasPrevious()) {
					System.out.println("Now playing " + listIterator.previous().toString());
				} else {
					System.out.println("We are at the start of the playlist");
					forward = true;
				}
				break;
			case 3:
				if(forward) {
					if(listIterator.hasPrevious()) {
						System.out.println("Now REPLAYING " + listIterator.previous().toString());
						forward = false;
					} else {
						System.out.println("we are at the start of the list");
					}
				} else {
					if(listIterator.hasNext()) {
						System.out.println("Now replaying" + listIterator.next().toString());
						forward = true;
					} else {
						System.out.println("We have reached the end of the list");
					}
				}
				break;
			case 4:
				printList(playList);
				break;
			case 5:
				printMenu();
				break;
			case 6:
				if(playList.size() > 0) {
					listIterator.remove();
					if(listIterator.hasNext()) {
						System.out.println("Now playing " + listIterator.next());
					} else if(listIterator.hasPrevious()) {
						System.out.println("Now playing " + listIterator.previous());
					}
				}
				break;
			}
		}
	}
	
	private static void printMenu() {
		System.out.println("Available actions:\n press");
		System.out.println("0 - to quit");
		System.out.println("1 - to play next song");
		System.out.println("2 - to play previous song");
		System.out.println("3 - to replay the current song");
		System.out.println("4 - list songs in the playlist");
		System.out.println("5 - print available actions");
		System.out.println("6 - delete current song");
	}
	
	private static void printList(List<Song> playList) {
		Iterator<Song> iterator = playList.iterator();
		System.out.println("======================");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("======================");
	}
    }
