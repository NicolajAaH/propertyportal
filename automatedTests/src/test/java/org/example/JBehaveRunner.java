package org.example;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.List;

import static org.jbehave.core.reporters.Format.*;

public class JBehaveRunner extends JUnitStories {

    @Override
    public Configuration configuration(){
        return new MostUsefulConfiguration().useStoryLoader(
                new LoadFromClasspath(this.getClass())
        ).useStoryReporterBuilder(
                new StoryReporterBuilder().withCodeLocation(
                        CodeLocations.codeLocationFromClass(this.getClass())
                ).withFormats(
                        CONSOLE, TXT, HTML
                )
        );
    }

    @Override
    public List<String> storyPaths() {
        return new StoryFinder().findPaths(
                CodeLocations.codeLocationFromClass(this.getClass()),
                "**/*.story", ""
        );
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new Steps());
    }
}


