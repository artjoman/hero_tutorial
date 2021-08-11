import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtId;
    ArrayList<Hero> heroesInTheDistrict = new ArrayList<Hero>();

    public District() {
    }

    public District(String title, String city, int districtId, ArrayList<Hero> heroesInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.heroesInTheDistrict = heroesInTheDistrict;
    }

    public boolean addNewHero(Hero hero) {
        return heroesInTheDistrict.add(hero);
    }

    public Hero removeHero(int index) {
        return heroesInTheDistrict.remove(index);
    }


    @Override
    public String toString() {
        return "District{" +
                "title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtId=" + districtId +
                ", heroesInTheDistrict=" + heroesInTheDistrict +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public ArrayList<Hero> getHeroesInTheDistrict() {
        return heroesInTheDistrict;
    }

    public void setHeroesInTheDistrict(ArrayList<Hero> heroesInTheDistrict) {
        this.heroesInTheDistrict = heroesInTheDistrict;
    }
}
