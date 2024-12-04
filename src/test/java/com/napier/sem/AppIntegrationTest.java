package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 20000);

    }

    @Test
    void testGetEmployee()
    {
        Employee emp = app.getEmployee(10001);
        assertEquals(emp.emp_no, 10001);
        assertEquals(emp.first_name, "Georgi");
        assertEquals(emp.last_name, "Facello");
    }
}