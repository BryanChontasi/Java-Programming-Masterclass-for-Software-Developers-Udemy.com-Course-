import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration){
        if(findSong(title) == null){  //method to find songs, created above
            this.songs.add(new Song(title,duration));
            return true; //because song was not found, so no duplication.
        }
        return false;
    }


    private Song findSong(String title){
        for(Song checkedSong: this.songs){// this is similar as for loop
            if(checkedSong.getTitle().equals(title)){
                return checkedSong;
            }
        }
        return null;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1; // trackNumber -1 because index  starts from 0
        if(index >= 0 && index <= this.songs.size()){  //index starts from 0
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a truck "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
        Song checkSong = findSong(title);
        if (checkSong != null){ //if it exists add the song to the playlist and return true
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album" );
        return false;
    }
}
