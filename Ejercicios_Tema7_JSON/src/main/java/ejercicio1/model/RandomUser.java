package ejercicio1.model;

// RandomUser.java


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class RandomUser {
    private List<Result> results;
    private Info info;
}

// Info.java


@Data
class Info {
    private String seed;
    private long results;
    private long page;
    private String version;
}

// Result.java


// Dob.java



@Data
class Dob {
    @JsonIgnore
    private OffsetDateTime date;
    private long age;
}

// ID.java

@Data
class ID {
    private String name;
    private String value;
}

// Location.java

@Data
class Location {
    private Street street;
    private String city;
    private String state;
    private String country;
    private long postcode;
    private Coordinates coordinates;
    private Timezone timezone;
}

// Coordinates.java

@Data
class Coordinates {
    private String latitude;
    private String longitude;
}

// Street.java

@Data
class Street {
    private long number;
    private String name;
}

// Timezone.java


@Data
class Timezone {
    private String offset;
    private String description;
}

// Login.java

@Data
class Login {
    private UUID uuid;
    private String username;
    private String password;
    private String salt;
    private String md5;
    private String sha1;
    private String sha256;
}

// Name.java
@Data
class Name {
    private String title;
    private String first;
    private String last;
}

// Picture.java

@Data
class Picture {
    private String large;
    private String medium;
    private String thumbnail;
}
