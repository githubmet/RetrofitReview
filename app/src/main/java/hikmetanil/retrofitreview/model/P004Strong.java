package hikmetanil.retrofitreview.model;


import java.util.HashMap;

public class P004Strong {
    String id;
    HashMap<String,filesDetail> files;
    public String getId() {
        return id;
    }
    public HashMap<String, filesDetail> getFiles() {
        return files;
    }
    public class filesDetail {
        String filename;
        String type;
        String language;
        public String getFilename() {
            return filename;
        }
        public String getType() {
            return type;
        }
        public String getLanguage() {
            return language;
        }
    }
}
