package nl.avans.android.todos.service;

/**
 * Bevat o.a. URL definities.
 */
public class Config {

    // 10.0.2.2 is de Android connectie naar localhost.
    private static final String BASIC_URL = "http://10.0.2.2:3000";

    public static final String URL_LOGIN = BASIC_URL + "/api/v1/login";
    public static final String URL_TODOS = BASIC_URL + "/api/v1/todos";

}
