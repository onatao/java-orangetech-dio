package collection_set;

import java.util.Comparator;

public class ComparaTot implements Comparator<Serie> {
    
        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if (nome != 0) return nome;
            
            int genero = s1.getGenero().compareTo(s2.getGenero());
            if (genero != 0) return genero;

            return Integer.compare(s1.getDuracao(), s2.getDuracao());
        } 
}
