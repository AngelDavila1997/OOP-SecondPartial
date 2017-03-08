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
public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    
    public boolean addSong (String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }
    
    public Song findSong (String title){
        for (Song checkedSong: this.songs){
            if (checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlaylist(int trackNumber, List<Song> playlist){ //Lista enlazada Permite manejar mas eficientemente la memoria permite recorrer la lista
        int index = trackNumber -1;
        if((index >= 0) && (index < this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
    }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
    public boolean addToPlaylist(String title, List<Song> playList) {
		Song checkedSong = findSong(title);
		if(checkedSong != null) {
			playList.add(checkedSong);
			return true;
		}
		System.out.println("The song " + title + " is not in the album");
		return false;
	}
}
