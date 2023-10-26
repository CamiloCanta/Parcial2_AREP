package eci.escuelaing.edu.co;


import static spark.Spark.get;
import static spark.Spark.port;

public class Spark {
    public static void main(String[] args) {
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
    }

    public static Integer getPort() {
        return System.getenv("PORT") != null ? Integer.parseInt(System.getenv("PORT")) : 5000;
    }
}