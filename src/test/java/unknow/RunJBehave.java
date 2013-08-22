package unknow;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.junit.JUnitStories;

public class RunJBehave extends JUnitStories {
	
	public RunJBehave(){
		super();
		this.configuredEmbedder().candidateSteps().add(new SpikeTestStep());
	}

	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("unknow/Spike.story");
	}

}
