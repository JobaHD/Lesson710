/**
 * Purpose: Using a list of movies, sort them based on title, year created, or movie studio. Use the insertion sort algorithm to reorder the collection as requested in ascending or descending order.
 *
 * @author Jonathan Rodriguez Gomez
 * @version 2/13/2023
 *
 */
public class MovieTesterV3 {
    public static void main(String[] args) {
        //sourced from boxofficemojo.com, didn't find a good source with the studios, so I did it with publishers
        Movie [] wishlist = {
                new Movie("Meet the Robinsons", 2007, "Walt Disney Studios Motion Pictures"),
                new Movie("Avatar", 2009, "Twentieth Century Fox"),
                new Movie("Avengers: Endgame", 2019, "Walt Disney Studios Motion Pictures"),
                new Movie("Titanic", 1997, "Paramount Pictures"),
                new Movie("Avatar: The Way of Water", 2022, "20th Century Studios"),
                new Movie("Star Wars: Episode VII", 2015, "Walt Disney Studios Motion Pictures"),
                new Movie("Avengers: Infinity War ", 2018, "Walt Disney Studios Motion Pictures"),
                new Movie("Spider-Man: No Way Home ", 2021, "Sony Pictures Entertainment "),
                new Movie("Jurassic World ", 2015, "Universal Pictures"),
        };

        System.out.println("Movie Table without sorting");
        printMovies(wishlist);

        System.out.println("Movie Table after sorting by title in ascending order");
        printMovies(sortByTitle(wishlist, 1));

        System.out.println("Movie Table after sorting by title in descending order");
        printMovies(sortByTitle(wishlist, 2));

        System.out.println("Movie Table after sorting by year in ascending order");
        printMovies(sortByYear(wishlist, 1));

        System.out.println("Movie Table after sorting by year in descending order");
        printMovies(sortByYear(wishlist, 2));

        System.out.println("Movie Table after sorting by studio in ascending order");
        printMovies(sortByStudio(wishlist, 1));

        System.out.println("Movie Table after sorting by studio in in descending order");
        printMovies(sortByStudio(wishlist, 2));
    }

    public static void printMovies(Movie [] movieList){
        System.out.printf("%-30s %4s   %-20s \n", "Title", "Year", "Studio");
        System.out.println("------------------------------------------------------------------");
        for (Movie m: movieList) {
            System.out.println(m.toString());
        }
        System.out.println();
    }

    public static Movie [] sortByTitle(Movie [] movieList, int order){

    }

    public static Movie [] sortByYear(Movie [] movieList, int order){
        int i;
        int k;
        int maxIndex;
        Movie temp;

        for( i = movieList.length - 1; i >= 0; i-- )
        {
// find largest element in the i elements
            maxIndex = 0;
            for( k = 0; k <= i; k++ )
            {
                if( movieList[k].getYear() > movieList[maxIndex].getYear())
                    maxIndex = k;
            }
// swap the largest with the position i
// now the item is in its proper location
            temp = movieList[ i ];
            movieList[ i ] = movieList[maxIndex];
            movieList[ maxIndex] = temp;
        }


    }

    public static Movie [] sortByStudio(Movie [] movieList, int order){

    }
}