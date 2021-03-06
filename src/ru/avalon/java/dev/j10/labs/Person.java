package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;
import java.util.Comparator;

/**
 * Абстрактное представление о человеке.
 *
 * <p>С точки зрения модели, человек описывается именем и
 * датой рождения.
 *
 * <p>При сравнении одного человека с другим следует
 * учитывать, что больше будет тот человек, чьё имя должно
 * быть ниже в списке имён, отсортированном по возрастанию.
 * Из двух людей с одним и тем же именем больше будет тот,
 * который старше.
 */
public interface Person extends Comparable {

    
    /**
     * Возвращает имя человека.
     *
     * @return имя человека в виде строки
     */
    String getName();

    /**
     * Возвращает дату рождения человека.
     *
     * @return дата рождения в виде экземпляра типа
     * {@link Date}
     */
    String getBDate();
    
    
    default public int compareTo(Person p){
        return this.getName().compareTo(p.getName());
        }
    }
    