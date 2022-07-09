package ru.silent.spring.tgbot.dto;

import lombok.Data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlRootElement
@Data
public class GetCursOnDateXml {

    @XmlElement(name = "On_date", required = true, namespace = "http://web.cbr.ru/")
    protected XMLGregorianCalendar onDate;
}
