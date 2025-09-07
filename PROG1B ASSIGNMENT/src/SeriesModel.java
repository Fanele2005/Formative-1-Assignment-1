public class SeriesModel {

    public String SeriesId;

    public String SeriesName;

    public String SeriesAge;

    public String SeriesNumberOfEpisodes;



    public SeriesModel(String seriesId, String seriesName, String seriesAge, String seriesNumberOfEpisodes) {

        this.SeriesId = seriesId;

        this.SeriesName = seriesName;

        this.SeriesAge = seriesAge;

        this.SeriesNumberOfEpisodes = seriesNumberOfEpisodes;

    }



    @Override

    public String toString() {

        return "Series ID: " + SeriesId +

                "\nSeries Name: " + SeriesName +

                "\nAge Restriction: " + SeriesAge +

                "\nNumber of Episodes: " + SeriesNumberOfEpisodes;

    }

}