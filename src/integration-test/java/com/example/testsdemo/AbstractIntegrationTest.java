package com.example.testsdemo;

@IntegrationTest
public abstract class AbstractIntegrationTest {
    // Here we can autowire all the beans we need for our integration tests
    // and set up @BeforeEach and @AfterEach methods to clean DB, Kafka topics, reset Wiremock stubs etc.
}
