package hikmetanil.retrofitreview.model;

import java.util.List;
import java.util.Map;

public class P007Strong {
    String id;
    String name;
    String created_at;
    String size;
    String language;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getSize() {
        return size;
    }

    public String getLanguage() {
        return language;
    }

    List<ownerDetails> owner;

    public List<ownerDetails> getOwner() {
        return owner;
    }

    public class ownerDetails{
    String login;
    String id;

        public String getLogin() {
            return login;
        }

        public String getId() {
            return id;
        }
    }
}
