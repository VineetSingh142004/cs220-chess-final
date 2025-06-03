package game.template;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class GradleTest {

    @Test
    public void testGradleSetup() {
        // Check if essential Gradle files exist
        File gradleWrapper = new File("../../gradlew.bat");
        File buildGradle = new File("../../app/build.gradle");
        File settingsGradle = new File("../../settings.gradle");

        // Assert that the files exist
        assertTrue(gradleWrapper.exists(), "Gradle wrapper script should exist");
        assertTrue(buildGradle.exists(), "build.gradle file should exist");
        assertTrue(settingsGradle.exists(), "settings.gradle file should exist");
    }

    @Test
    public void testJavaFXDependency() {
        // Verify JavaFX dependency is available
        try {
            Class.forName("javafx.application.Application");
            assertTrue(true, "JavaFX dependency is available");
        } catch (ClassNotFoundException e) {
            fail("JavaFX dependency not found");
        }
    }

    @Test
    public void testGradleProperties() {
        // Check if Gradle properties are set correctly
        File gradleProperties = new File("../../gradle/wrapper/gradle-wrapper.properties");
        assertTrue(gradleProperties.exists(), "Gradle wrapper properties should exist");
        assertTrue(gradleProperties.length() > 0, "Gradle wrapper properties should not be empty");
    }
}
