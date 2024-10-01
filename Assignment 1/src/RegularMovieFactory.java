public class RegularMovieFactory extends MovieFactory {
    // Реализация метода createMovie(), который создает объект RegularMovie
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title); // Возвращает новый объект RegularMovie
    }
}
