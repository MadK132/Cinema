# Cinema
Singleton Pattern: 
Class: CinemaConfig
Methods:
getInstance(): Gets the single instance.
setCinemaName(String name): Sets cinema name.
getCinemaName(): Gets cinema name.
Factory Method Pattern:
Interface: Movie
Methods:
getTitle(): Returns movie title.
getType(): Returns movie type.
Concrete Classes:
RegularMovie: For regular movies.
IMAXMovie: For IMAX movies.
MovieFactory:
Creates different movie types based on user input.
Abstract Factory Pattern:
Interface: UIFactory
Methods:
createButton(): Creates a button.
createTextField(): Creates a text field.
Concrete Factories:
DarkThemeFactory: Creates dark-themed UI elements.
LightThemeFactory: Creates light-themed UI elements.
4. Builder Pattern:
Class: TicketBooking
Builder Class:
TicketBookingBuilder: Used to set movie, seat, and snack combo, and then build a complete booking.
5. Prototype Pattern:
Interface: MovieSchedule
Methods:
clone(): Clones the schedule.
setMovie(Movie movie): Sets the movie.
setTime(String time): Sets the time.
Concrete Class:
StandardSchedule: Implements the schedule cloning functionality.
