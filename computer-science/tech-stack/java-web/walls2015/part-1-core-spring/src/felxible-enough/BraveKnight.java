// BraveKnight.java
public class BraveKnight implements Knight{
	private Quest quest;
	
	// Quest is injected via constructor
	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}

public class DamselRescueKnightTest {
	void embarkOnQuestTest(){
		// bisa di inject
		Quest quest = new QuestDiggingGold();
		BraveKnight drk = new BraveKnight(quest);
		drk.embarkOnQuest();
		assert(true, quest.isDone());
	}	
}