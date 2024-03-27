package java0327;

public class MemberDto {
    private String name;
    private String hp;
    private String blood;
    private String addr;

    public MemberDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberDto(String name, String hp, String blood, String addr) {
        this.name = name;
        this.hp = hp;
        this.blood = blood;
        this.addr = addr;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
