package trackPlay;

public class Playlist {

	private String name;
	private Song[] songList = new Song[10];
	private String user;

	public Playlist(String name, String user) {
		this.name = name;
		this.user = user;
	}

	public Playlist(String name, Song[] songList, String user) {
		this.name = name;
		this.songList = songList;
		this.user = user;
	}

	public void addSong(Song s) {
		for (int i = 0; i < 10; i++) {
			if (songList[i] == null){
				songList[i] = s;
				s.addRating();
				break;
			}
			// songList is full
		}
	}

	public void removeSong(int id) {
		songList[id] = null;
	}

	public int getNumSongs() {
		int numOfSongs = 0;
		
		for (Song s : songList) {
			if (s != null) { 
				numOfSongs++;
			}
		}
		
		return numOfSongs;
	}

	public int TotalDuration() {
		int duration = 0;

		for (Song s : songList) {
			if (s != null) {
				duration += s.getDuratio();
			}
		}

		return duration;
	}

	public double Price() {
		int price = 0;

		for (Song s : songList) {
			if (s != null) {
				price += s.getCost();
			}
		}

		return price;
	}

	public Song[] getSongArray() {
		return songList;
	}

	public String getName() {
		return name;
	}

	public String getUser() {
		return user;
	}

}
