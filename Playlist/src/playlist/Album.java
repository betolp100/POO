package playlist;

import java.util.*;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    Album(String stormbringer, String deep_Purple) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public boolean addSong (String title, double duration){
if(findSong (title)==null){
this.songs.add(new Song(title, duration));
return true;
}
return false;
}

private Song findSong(String title){
    for(Song checkedSong: this.songs){
        if(checkedSong.getTitle().equals(title)){
            return checkedSong;
        }
    }return null;
}

public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList){
    int index = trackNumber -1;
    if((index >=0)&&(index <this.songs.size())){
        playList.add(this.songs.get(index));
        return true;
}
    System.out.println("This album does not have a track."+ trackNumber);
    return false;
}
public boolean addToPlayList(String title, LinkedList<Song>playList){
    Song checkedSong=findSong(title);
    if(checkedSong !=null){
        playList.add(checkedSong);
        return true;
    }
    System.out.println("The song " + title + " is not in this album");
    return false;
}

    void addToPlayList(int i, List<Song> playList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void addToPlayList(String you_cant_do_it_right, List<Song> playList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}