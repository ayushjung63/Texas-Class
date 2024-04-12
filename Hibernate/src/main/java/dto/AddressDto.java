package dto;

public class AddressDto {
    private Integer id;

    private String name;
    private String type;

    private Integer studentId;

    public AddressDto(Integer id, String name, String type, Integer studentId) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.studentId = studentId;
    }

    public AddressDto(String name, String type, Integer studentId) {
        this.name = name;
        this.type = type;
        this.studentId = studentId;
    }

    public AddressDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
