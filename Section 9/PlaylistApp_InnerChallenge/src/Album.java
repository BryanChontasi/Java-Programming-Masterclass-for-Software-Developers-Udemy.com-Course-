import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Bryan Chontasi on 23/12/2020.
 * @project InterfaceChallenge
 */

public class Album {

    private String name;
    private String artist;
//  private ArrayList<Song> songs;  delete Arraylist to Store song in the new SongList class
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//      this.songs = new ArrayList<Song>();  Arraylist is swap for SongList()
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration){
        return this.songs.add(new Song(title,duration));
//        if(findSong(title) == null){
//            this.songs.add(new Song(title,duration));
//            return true;
//        }
//        return false;
//    }
    }



//    private Song findSong(String title){
//        for(Song checkedSong: this.songs){// this is similar as for loop
//            if(checkedSong.getTitle().equals(title)){
//                return checkedSong;
//            }
//        }
//        return null;
//    }



    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        Song checkedSong = this.songs.findSong(trackNumber);
        if (checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
//        int index = trackNumber - 1; // trackNumber -1 because index  starts from 0
//        if(index >= 0 && index <= this.songs.size()){  //index starts from 0
//            playList.add(this.songs.get(index));
//            return true;
//        }
        System.out.println("This album does not have a truck "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList){
//        Song checkSong = findSong(title);
        Song checkSong = songs.findSong(title);
        if (checkSong != null){ //if it exists add the song to the playlist and return true
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album" );
        return false;
    }

    // create new SongList class
    private class SongList{
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        public boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        //findSong() methods brought from Album class
        private Song findSong(String title){
            for(Song checkedSong: this.songs){// this is similar as for loop
                if(checkedSong.getTitle().equals(title)){
                    return checkedSong;
                }
            }
            return null;
        }

        private Song findSong(int trackSong){
            int index = trackSong - 1;
            if (index >= 0 && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }
    }

}
