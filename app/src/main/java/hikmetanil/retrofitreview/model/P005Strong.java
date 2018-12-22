package hikmetanil.retrofitreview.model;

import java.util.List;

public class P005Strong {


    List<itemsDetail> items;

    public List<itemsDetail> getItems() {
        return items;
    }
    public class itemsDetail {
        String login;
        String id;
        String score;

        public String getLogin() {
            return login;
        }

        public String getId() {
            return id;
        }

        public String getScore() {
            return score;
        }
    }

}
