// DamselRescueKnight.java

public class DamselRescueKnight implements Knight {
	private RescueDamselQuest quest;

	public DamselRescueKnight(){
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest(){
		quest.embark();
	}
}

// class DamselRescueKnight tidak bisa mengganti nilai quest
// quest selalu berisi nilai RescueDamselQuest()
public class DamselRescueKnightTest {
	void embarkOnQuestTest(){
		// nah, cara masukin mock RescueDamselQuest gimana?		
		DamselRescueKnight drk = new DamselRescueKnight();
		drk.embarkOnQuest();
		assert(true, quest.isDone());
	}	
}