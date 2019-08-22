package pl.practice.ObserwerAndJSONReader;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {

    int counter = 0;

    public List<Hero> read(String file) {
        List<Hero> heroList = new ArrayList<>();

        try {
            byte[] heroJson = Files.readAllBytes(Paths.get(file));
            String fileContents = new String(heroJson, "UTF-8");

            JSONObject jsonObject = new JSONObject(fileContents);
            JSONArray heroArray = jsonObject.optJSONArray("superhero");

            for (Object heroObj : heroArray) {
                JSONObject temp = new JSONObject(heroObj.toString());
                String heroName = temp.getString("heroName");
                String realName = temp.getString("realName");
                String mainSuperpower = temp.getString("mainSuperpower");
                String mainWeakPoint = temp.getString("mainWeakPoint");
                Boolean hasToys = temp.getBoolean("hasToys");

                HeroBulider heroBulider = new HeroBulider();
                Hero createHero = heroBulider
                        .withHeroName(heroName)
                        .withRealName(realName)
                        .withMainSuperpower(mainSuperpower)
                        .withMainWeakPoint(mainWeakPoint)
                        .withHasToys(hasToys)
                        .bulid();
                heroList.add(createHero);
            }
            System.out.println(heroList.toString());

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((bufferedReader.readLine()) != null) {
                counter++;
            }

        } catch (IOException e) {
            throw new JsonReaderException(e.getMessage(), e);
        }
        notifyObserver(heroList,counter);
        return heroList;
    }

    public void notifyObserver(List list, int counter) {
        OutputLogWriter o = new OutputLogWriter();
        o.notify(list, this.counter);
    }
}