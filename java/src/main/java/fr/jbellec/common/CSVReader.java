package fr.jbellec.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CSVReader<T> {

    private ListFactory<T> listFactory;
    private LineTokenizer lineTokenizer;
    private ObjectFactory<T> objectFactory;

    
    private CSVReader() {
    }

    public List<T> readCSV(Reader reader) throws IOException {

        List<T> objects = listFactory.newList();

        BufferedReader br = new BufferedReader(reader);
        String line = null;
        while ((line = br.readLine()) != null) {
            String[] lineParts = lineTokenizer.tokenize(line);
            T object = objectFactory.newObject(lineParts);
            objects.add(object);
        }

        return objects;

    }

    public static class Builder<T> {

        private CSVReader reader = new CSVReader();

        public Builder<T> withListFactory(ListFactory<T> listFactory) {
            reader.listFactory = listFactory;
            return this;
        }

        public Builder<T> withLineTokenizer(LineTokenizer lineTokenizer) {
            reader.lineTokenizer = lineTokenizer;
            return this;
        }

        public Builder<T> withObjectFactory(ObjectFactory<T> objectFactory) {
            reader.objectFactory = objectFactory;
            return this;
        }

        public CSVReader<T> build() {
            return reader;
        }

    }

}
