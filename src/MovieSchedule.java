public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    Movie getMovie();
    void setTime(String time);
    String getTime();
}
