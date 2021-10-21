public class Player {

	private String name;
	private int age;
	private Skill skill;

	public Player(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.skill = Skill.NEW_PLAYER;
	}

	public Player(String name, int age, Skill skill) {
		super();
		this.name = name;
		this.age = age;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public void skillLevelUP() {
		if (this.skill == Skill.NOOB) {
			this.skill = Skill.NEW_PLAYER;
		} else if (this.skill == Skill.NEW_PLAYER) {
			this.skill = Skill.INEXPERIENCED_PLAYER;
		} else if (this.skill == Skill.INEXPERIENCED_PLAYER) {
			this.skill = Skill.MEDIUM_PLAYER;
		} else if (this.skill == Skill.MEDIUM_PLAYER) {
			this.skill = Skill.EXPERIENCED_PLAYER;
		} else if (this.skill == Skill.EXPERIENCED_PLAYER) {
			this.skill = Skill.PROFESSIONAL_PLAYER;
		} else if (this.skill == Skill.PROFESSIONAL_PLAYER) {
			this.skill = Skill.MASTER_PLAYER;
		}
	}

	public void skillLevelDOWN() {
		if (this.skill == Skill.NEW_PLAYER) {
			this.skill = Skill.NOOB;
		} else if (this.skill == Skill.INEXPERIENCED_PLAYER) {
			this.skill = Skill.NEW_PLAYER;
		} else if (this.skill == Skill.MEDIUM_PLAYER) {
			this.skill = Skill.INEXPERIENCED_PLAYER;
		} else if (this.skill == Skill.EXPERIENCED_PLAYER) {
			this.skill = Skill.MEDIUM_PLAYER;
		} else if (this.skill == Skill.PROFESSIONAL_PLAYER) {
			this.skill = Skill.EXPERIENCED_PLAYER;
		} else if (this.skill == Skill.MASTER_PLAYER) {
			this.skill = Skill.PROFESSIONAL_PLAYER;
		}
	}

	@Override
	public String toString() {
		return "Player name : " + name + ", age : " + age + ", skill : " + skill;
	}

}