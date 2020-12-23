import java.util.*;

/**
 * @author Bryan Chontasi on 23/12/2020.
 * @project InterfaceChallenge
 */

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        /*
    // Modify the playlist challenge so that the Album class uses an inner class.
    // Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
    // The inner SongList class will use an ArrayList and will provide a method to add a song.
    // It will also provide findSong() methods which will be used by the containing Album class
    // to add songs to the playlist.
    // Neither the Song class or the Main class should be changed.
        *
        *      Bryan Chontasi 23/12/2020
        * */


        //create an album, first object
        Album album = new Album("Stormbringer", "Deep Purple");
        //add songs to the album created
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean nothing", 4.22);
        album.addSong("Holly man", 4.3);
        album.addSong("Holly on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        //add album to albums  arrayList
        albums.add(album);

        //Create another album, second object
        //album is not added twice ,we are creating a new object different to the previous album object created above
        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        //add album to albums  arrayList
        albums.add(album);

        //create a new playlist as a linkedList
        LinkedList<Song> playList = new LinkedList<Song>();

        //add elements from first album to the playlist from album stored in albums arraylist
        //.get(0); because the first album is in the index 0
        albums.get(0).addToPlayList("You can't do it right", playList); //name must be identical if not error will appear
        albums.get(0).addToPlayList("Holly man", playList);
        albums.get(0).addToPlayList("Speaking", playList); //it does not exist
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList); //index1 is ac/dc album
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);//there is not track 24

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        //add scanner
        Scanner scanner = new Scanner(System.in);
        boolean quit = false; // when is true, it will close the app
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator(); //create iterator for LinkList

        if (playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else {
            System.out.println("Now  playing " + listIterator.next().toString()); //.next() to point first address, and toString() to call overrated method created in Song
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0 :
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;

                //case 1 to go to next song
                case 1:
                    if(!forward){ //if forward is false is because it was going backwards
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of hte playlist");
                        forward = false;
                    }
                    break;

                //case 2 to go to previous song
                case 2:
                    if(forward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;

                //case 3 to repeat the song
                case 3:
                    if(forward){ //if we are going forward
                        if(listIterator.hasPrevious()){ //check if there is a previous
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else {
                            System.out.println("We are at the start of the playlist");
                        }

                    }else{  //if we are not going forward
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true; //it has to go forward to repeat the song again
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;

                //case 5 to print list of songs
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;

                //case 6 to remove current song
                case 6:
                    if (playList.size() > 0) { //if there is songs in the list
                        listIterator.remove(); // we are going to remove the current song
                        if(listIterator.hasNext()){ //ensure that there is a next or previous available entry, to avoid error
                            System.out.println("Now playing " + listIterator.next().toString());
                        }else  if (listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist" );
    }

    private static void  printList(LinkedList<Song> playList){
        //create iterator instead of listIterator because there is not need ot go back and forward
        Iterator iterator = playList.iterator();
        System.out.println("======================"); //to see results easily

        while (iterator.hasNext()){
            System.out.println(iterator.next()); //there is not need to add .toString()
        }
        System.out.println("======================");
    }

}
