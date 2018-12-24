public class Songs
{
    private String mName;
    private String mArtist;

    public Songs(String vName, String vArtist)
    {
        mName = vName;
        mArtist = vArtist;
    }
    /**
     * Get the name of the song
     */
    public String getName() {
        return mName;
    }
    /**
     * Get the Artist
     */
    public String getArtist() {
        return mArtist;
    }
}