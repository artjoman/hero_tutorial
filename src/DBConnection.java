import java.sql.*;
import java.util.ArrayList;

public class DBConnection {


    private Connection conn;

    public DBConnection() {
        try {
            String dbUrl = "jdbc:sqlite:hero.db";
            conn = DriverManager.getConnection(dbUrl);

            Statement statement = conn.createStatement();
            String sqlStatement =
                    "CREATE TABLE IF NOT EXISTS heroes" +
                            " (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "name TEXT NOT NULL, " +
                            "surname TEXT NOT NULL, " +
                            "nickname TEXT NOT NULL, " +
                            "hero_type TEXT NOT NULL, " +
                            "deed_time INTEGER)";
            statement.execute(sqlStatement);
            System.out.println("DB created");
        } catch (SQLException exception) {
            System.out.println("Database issues: " + exception);
        }


    }

    public ArrayList<Hero> getHeroes() {

        ArrayList<Hero> heroList = new ArrayList<Hero>();

        try {

            Statement statement = conn.createStatement();
            String sqlStatement = "SELECT * FROM heroes";

            ResultSet rs = statement.executeQuery(sqlStatement);

            while ( rs.next() ) {

                // Create new Hero object
                Hero hero = new Hero();
                hero.setHeroID( rs.getInt("id") );
                hero.setName( rs.getString("name"));
                hero.setSurname( rs.getString("surname"));
                hero.setHeroType( HeroType.valueOf(rs.getString("hero_type")));
                hero.setNickname( rs.getString("nickname"));
                hero.setDeedTime( rs.getInt("deed_time"));
                System.out.println(hero.toString());
            }


        } catch (SQLException exception) {
            System.out.println("Error getting Heroes list: " + exception);
        }

        return heroList;
    }

    public void createHero( Hero hero ) {

        try {

            Statement statement = conn.createStatement();
            String sqlStatement = "INSERT INTO heroes (" +
                    "name, surname, nickname, hero_type, deed_time) " +
                    "VALUES (" +
                    "'" + hero.getName() + "'," +
                    "'" + hero.getSurname() + "'," +
                    "'" + hero.getNickname() + "'," +
                    "'" + hero.getHeroType() + "'," +
                    hero.getDeedTime()  +
                    ")";

            statement.execute(sqlStatement);

        } catch (SQLException exception) {
            System.out.println("Error getting Heroes list: " + exception);
        }
    }


}
