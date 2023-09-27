package com.example.demo.model;


import jakarta.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    @Column(columnDefinition = "TEXT")
    private String testString1;

    @Column(columnDefinition = "TEXT")
    private String testString2;

    @Column(columnDefinition = "TEXT")
    private String testString3;

    @Column(columnDefinition = "TEXT")
    private String testString4;

    @Column(columnDefinition = "TEXT")
    private String testString5;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getTestString1() {
        return testString1;
    }

    public void setTestString1(String testString1) {
        this.testString1 = testString1;
    }

    public String getTestString2() {
        return testString2;
    }

    public void setTestString2(String testString2) {
        this.testString2 = testString2;
    }

    public String getTestString3() {
        return testString3;
    }

    public void setTestString3(String testString3) {
        this.testString3 = testString3;
    }

    public String getTestString4() {
        return testString4;
    }

    public void setTestString4(String testString4) {
        this.testString4 = testString4;
    }

    public String getTestString5() {
        return testString5;
    }

    public void setTestString5(String testString5) {
        this.testString5 = testString5;
    }
}
