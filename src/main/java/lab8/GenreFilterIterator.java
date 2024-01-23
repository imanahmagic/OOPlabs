package lab8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    ArrayList<Song> playlist = new ArrayList<>();
    private String targetGenre;

    public GenreFilterIterator(ArrayList<Song> playlist, String targetGenre){
        this.playlist = playlist;
        this.targetGenre = targetGenre;
    }
    @Override
    public boolean hasNext(){
        for(int i=0; i<playlist.size(); i++){
            if(playlist.get(i).getGenre().equals(targetGenre)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Song next(){
        int i = playlist.indexOf(0);
        for(i=0; i<playlist.size(); i++){
            if(!hasNext()){
                throw new NoSuchElementException();
            }
        }
        return playlist.get(i);
    }


}
