package com.thoughtworks.training.tomwang.todoservice.model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String text;
   private boolean visible;
   private boolean editable;
   private Date timestamp;

   @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "todo_id")
   private List<Task> tasks;
   @Transient
    private String suggestion;

}
