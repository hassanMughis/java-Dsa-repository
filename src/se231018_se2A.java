// File: se231018_se2A.java
//Author:hassan mughis
//reg.no:se231018
// descrption : finalexam
//qusetion: partb
import java.util.ArrayList;

// (a) Abstract base class Member
abstract class Member {
   private String name;
    private String address;

    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public abstract int getFee();
}

// (b) Subclass StandardMember
class StandardMember extends Member {
    private static final int FEE = 30;

    public StandardMember(String name, String address) {
        super(name, address);
    }

    @Override
    public int getFee() {
        return FEE;
    }
}

// (c) Subclass SeniorMember
class SeniorMember extends Member {
    private int fee;

    public SeniorMember(String name, String address, int fee) {
        super(name, address);
        this.fee = fee;
    }

    @Override
    public int getFee() {
        return fee;
    }
}

// (d) Class Society
class Society {
    public String name;
    public ArrayList<Member> members;

    public Society(String societyName) {
        this.name = societyName;
        this.members = new ArrayList<>();
    }

    public void addMember(String name, String address) {
        members.add(new StandardMember(name, address));
    }

    public void addSeniorMember(String name, String address, int fee) {
        members.add(new SeniorMember(name, address, fee));
    }

    public int getFeeTotal() {
        int totalFee = 0;
        for (Member member : members) {
            totalFee += member.getFee();
        }
        return totalFee;
    }

    public void printMembers() {
        for (Member member : members) {
            System.out.println("Name: " + member.getName() + ", Address: " + member.getAddress() + ", Fee: " + member.getFee());
        }
    }
}

// Main class to test the code
public class se231018_se2A {
    public static void main(String[] args) {
        Society society = new Society("suffa soft");

        society.addMember("hassan", "NHS towers");
        society.addMember("Abdullah", "kati pahari");
        society.addSeniorMember("billawal", "close to dha suffa", 50);

        System.out.println("Members of " + society.name + ":");
        society.printMembers();

        int totalFees = society.getFeeTotal();
        System.out.println("Total fees collected: " + totalFees + " JD");
    }
}
