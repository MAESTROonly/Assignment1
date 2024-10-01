public class IMAXMovieFactory extends MovieFactory {
    // Реализация метода createMovie(), который создает объект IMAXMovie
    @Override
    public Movie createMovie(String title) {
        return new IMAXMovie(title); // Возвращает новый объект IMAXMovie
    }
}