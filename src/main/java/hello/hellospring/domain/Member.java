package hello.hellospring.domain;

public class Member {
    private Long id; //데이터 구분위해 시스템이 지정하는 식별자
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
