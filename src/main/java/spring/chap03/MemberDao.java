package spring.chap03;

import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	Map<String, Member> map = new HashMap<>();

	public Member selectByEmail(String email) {
		return map.get(email);
	}

	public void insert(Member member) {
		map.put(member.getEmail(), member);
	}
}