package middle.lesson26;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="QuestionPool")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"id", "description", "answerList"})
public class Question implements Serializable {
    private static final long serialVersionUID = 1L;
    @XmlAttribute    
    private Integer id;
    private String description;
    @XmlElement(name="answer")
    private List<Answer> answerList;
    
    public Question() {
    }
    
    public Question(Integer id, String description) {
        this.id = id;
        this.description = description;
        this.answerList = new ArrayList<>();
    }
    
    public void populate(Integer id, String description, boolean isCorrect) {
        this.answerList.add(new Answer(id, description, isCorrect));
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

    public List<Answer> getAnswerList() {
        return answerList;
    }
    
    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

    @Override
    public String toString() {
        return "Question{" + "id=" + id + ", description=" + description + ", answerList=" + answerList + '}';
    }

}
