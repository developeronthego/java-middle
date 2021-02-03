package middle.lesson26;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id", "description", "correct"})
public class Answer implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlAttribute
    private Integer id;
    private String description;
    private boolean correct;
    
    public Answer() {
    }
    
    public Answer(Integer id, String description, boolean isCorrect) {
        this.description = description;
        this.correct = isCorrect;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean isCorrect) {
        this.correct = isCorrect;
    }

    @Override
    public String toString() {
        return "Answer [description=" + description + ", isCorrect=" + correct + "]";
    }


}
