package com.sw300.acme.clazz;

import java.util.Date;

/**
 * Created by uengine on 2019. 4. 19..
 */
public class ClassDayRegistered extends DomainEvent{

    public ClassDayRegistered(){} //for serialization

    public ClassDayRegistered(ClazzDay clazzDay) {

        super();

        if(getTitle()!=null)
            setTitle(getTitle());
        else if(clazzDay.getClazz()!=null)
            setTitle(clazzDay.getClazz().getCourse().getTitle());

        setDate(clazzDay.getDate());

    }

    Date date;
    String title;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
