# rest-blog

##### You can use Takari maven wrapper to build the project:

`./mvnw spring-boot:run`

___


##### Run the app!

`./gradlew bootRun`

___

##### To run html page:

* go to `public` folder
* open terminal
* `python -m SimpleHTTPServer`
* `http://localhost:8000/index.html#/`
___

#### To create db uncomment:

`spring.jpa.hibernate.ddl-auto=create` in `application.properties`
___

#### Open in whatever rest client

* `http://localhost:8080/api/post/1` - get post by id
```json
{
        "id": 1,
        "title": "Failure is not an option",
        "subtitle": "Many say exploration is part of our destiny, but it’s actually our duty to future generations.",
        "content": "<em>MockFlow</em> ",
        "date": "2016-05-11",
        "author": "union.one"
}
```
* `http://localhost:8080/api/post/` - return all posts
* `http://localhost:8080/api/post/` - added new post
```json
{
        "id": 1,
        "title": "Failure is not an option",
        "subtitle": "Many say exploration is part of our destiny, but it’s actually our duty to future generations.",
        "content": "<em>MockFlow</em> ",
        "date": "2016-05-11",
        "author": "union.one"
}
```
* `http://localhost:8080/api/post/1` - deleted post by id
* `http://localhost:8080/api/post/` - update(put) post content by id
```json
{
        "id": 1,
        "title": "Failure is not an option",
        "subtitle": "Many say exploration is part of our destiny, but it’s actually our duty to future generations.",
        "content": "<em>new content</em> ",
        "date": "2016-05-11",
        "author": "union.one"
}
```

___

##### `@SpringBootApplication` is a convenience annotation that adds all of the following:
* `@Configuration` tags the class as a source of bean definitions for the application context.
* `@EnableAutoConfiguration` tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.
* Normally you would add `@EnableWebMvc` for a Spring MVC app, but Spring Boot adds it automatically when it sees spring-webmvc on the classpath. This flags the application as a web application and activates key behaviors such as setting up a `DispatcherServlet`.
* `@ComponentScan` tells Spring to look for other components, configurations, and services in the package, allowing it to find the `GreetingController`.

___

##### The Spring Boot gradle plugin provides many convenient features:

* It collects all the jars on the classpath and builds a single, runnable `über-jar`, which makes it more convenient to execute and transport your service.
* It searches for the `public static void main()` method to flag as a runnable class.
* It provides a built-in dependency resolver that sets the version number to match Spring Boot dependencies. You can override any version you wish, but it will default to Boot’s chosen set of versions.

____

##### Gradle best of the best:
* [Task Exclusion.](https://docs.gradle.org/current/userguide/tutorial_gradle_command_line.html#sec:excluding_tasks_from_the_command_line) You can exclude any task from being run.
* [Transitive Exclude](https://docs.gradle.org/current/userguide/tutorial_gradle_command_line.html#sec:excluding_tasks_from_the_command_line) When you exclude a task, all tasks this task depends on are also automatically excluded if they have no other dependencies.
* [Dry Run.](https://docs.gradle.org/current/userguide/tutorial_gradle_command_line.html#sec:dry_run) Run a build to see which tasks actually get executed without executing the task actions.
* [Profile Report.](https://docs.gradle.org/current/userguide/tutorial_gradle_command_line.html#sec:profiling_build) Creates a performance profile for a build. Lists summary times and details for both the configuration phase and task execution. The times for configuration and task execution are sorted with the most expensive operations first. The task execution results also indicate if any tasks were skipped (and the reason) or if tasks that were not skipped did no work.
* The build output is very important part for the build user experience. In most other build tools the default output is geared towards a build author trying to debug a problem. This leads to a very verbose output hiding often important warnings and messages that are actually relevant for a developer running the build. Gradle's default output is geared towards a developer running the build and showing only messages that are relevant in this context and not abusing the log output as a poor man's progress indicator, for example when executing tests.
* [Rerouting output from external tools and libraries.](https://docs.gradle.org/current/userguide/logging.html#sec:external_tools) The build output is very important for the build user experience. If you integrate with external tools and libraries their console output might be very verbose. In Gradle System.out and log output of Java Util Logging, Jakarta Commons Logging and Log4j is re-reouted to the Gradle logging system. You can define per external tool you are integrating with to which log level the output should be routed.
* [Embedded GUI.](https://docs.gradle.org/current/userguide/tutorial_gradle_gui.html) In addition to supporting a traditional command line interface and IDE integration, Gradle offers a graphical user interface. This is a stand alone user interface that can be launched with the `--gui` option.
* [Automatic Validation of Task Inputs.](https://docs.gradle.org/current/userguide/userguide_single.html#incremental_tasks) Based on the input/output model Gradle automatically validates the configuration values of a task before it is executed.
* [Fine Grained Build Event Listener.](https://docs.gradle.org/current/userguide/build_lifecycle.html#build_lifecycle_events) Gradle allows you to hook into every part of the build configuration and execution lifecycle for injecting custom behaviour, extracting information, adding additional logging and a tons of other use cases.
* [Custom Distributions.](https://docs.gradle.org/current/userguide/init_scripts.html) Every Gradle distribution has an init.d directory in which you can put custom scripts that pre-configure your build environment. You can use this to apply company wide custom rules that are enforced across all builds of all teams, to provide build-in set up tasks for developers, and so much more. Together with the Gradle wrapper you can easily distribute those custom distributions.
* [Dynamic Task Creation.](https://docs.gradle.org/current/userguide/more_about_tasks.html#N10F07) Sometimes you want to have a task whose behavior depends on a large or infinite number value range of parameters. A very nice and expressive way to provide such tasks are task rules.
* [Repository Aware Cache.](https://docs.gradle.org/current/userguide/dependency_management.html#sub:cache_repository_independence) Repository metadata is kept alongside cached dependencies. This allows Gradle to effectively handle cases in which artifacts differ for the same dependency in different repositories. Additionally, Gradle enforces that a cached dependency was retrieved from one of the project's configured repositories. If a dependency isn't available from an "approved" repository, the build will fail.
* [Checksum Based Cache.](https://docs.gradle.org/current/userguide/dependency_management.html#sub:cache_checksum_storage) Checksums are stored and used to both ensure cache integrity and optimize bandwidth usage. Artifacts are only downloaded if an existing cached version doesn't exist or remote version's checksum is different.
* [Enforcing Central Versioning](https://docs.gradle.org/current/userguide/dependency_management.html#sec:custom_versioning_scheme) While Maven allows projects to use dependency versions suggested by their parents, these version can be overridden. Gradle allows stricter governance of a dependency by using substitution rules to optionally force projects to use a particular version of a dependency.
* [Custom Dependency Scopes](https://docs.gradle.org/current/userguide/dependency_management.html#sub:configurations) Don't be limited by a predefined set of dependency scopes (compile, runtime, etc). Gradle allows you to define arbitrary dependency scopes. For example for integration tests that you may model in your build, to provision toolchains you need in your build, etc ...
* [Custom Repository Layout](https://docs.gradle.org/current/userguide/dependency_management.html#N154B8) Declare repositories with custom layouts. With custom layouts you can effectively treat nearly any file system directory structure as an artifact repository.
* [File Based Dependencies](https://docs.gradle.org/current/userguide/dependency_management.html#sub:file_dependencies) Not all dependencies are available from external repositories. Declare dependencies on filesystem resources when using a managed dependency isn't practical or when migrating legacy builds.
