
package com.capgemini.heskuelita.beans;


import java.time.LocalDate;
import java.time.LocalTime;


public class AcademicOffer extends Component {

    private Course course;

    private Teacher teacher;

    private ClassRoom classRoom;

    private LocalDate date;

    private LocalTime time;


    public AcademicOffer () {

        super ();
    }

    public AcademicOffer (Course course, Teacher teacher, ClassRoom classRoom,
                          LocalDate date, LocalTime time) {

        super ();

        this.course    = course;
        this.teacher   = teacher;
        this.classRoom = classRoom;
        this.date = date;
        this.time = time;
    }


    public Course getCourse () {

        return course;
    }

    public void setCourse (Course course) {

        this.course = course;
    }

    public Teacher getTeacher () {

        return teacher;
    }

    public void setTeacher (Teacher teacher) {

        this.teacher = teacher;
    }

    public ClassRoom getClassRoom () {

        return classRoom;
    }

    public void setClassRoom (ClassRoom classRoom) {

        this.classRoom = classRoom;
    }

    public LocalDate getDate () {

        return date;
    }

    public void setDate (LocalDate date) {

        this.date = date;
    }

    public LocalTime getTime () {

        return time;
    }

    public void setTime (LocalTime time) {

        this.time = time;
    }
}