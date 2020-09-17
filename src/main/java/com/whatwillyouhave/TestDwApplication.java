package com.whatwillyouhave;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TestDwApplication extends Application<TestDwConfiguration> {

    public static void main(final String[] args) throws Exception {
        new TestDwApplication().run(args);
    }

    @Override
    public String getName() {
        return "TestDw";
    }

    @Override
    public void initialize(final Bootstrap<TestDwConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final TestDwConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
