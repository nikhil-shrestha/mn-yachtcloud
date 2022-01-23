CREATE TABLE owners (
    id    SERIAL PRIMARY KEY,
    name VARCHAR,
    address VARCHAR,
    city_town VARCHAR,
    country VARCHAR,
    postcode VARCHAR,
    email VARCHAR,
    domain VARCHAR,
    mobile_phone VARCHAR,
    office_phone VARCHAR,
    created_at DATE NOT NULL,
    updated_at DATE NOT NULL
);

CREATE TABLE owners_yachts (
    owner               BIGINT NOT NULL,
    yacht               BIGINT NOT NULL,
    FOREIGN KEY (owner) REFERENCES owners (id),
    FOREIGN KEY (yacht) REFERENCES yachts (id)
);



