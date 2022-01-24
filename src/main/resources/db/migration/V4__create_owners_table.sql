CREATE TABLE owners (
    id                  SERIAL PRIMARY KEY,
    name                VARCHAR,
    address             VARCHAR,
    city_town           VARCHAR,
    country             VARCHAR,
    postcode            VARCHAR,
    email               VARCHAR,
    domain              VARCHAR,
    mobile_phone        VARCHAR,
    office_phone        VARCHAR,
    created_at          DATE NOT NULL,
    updated_at          DATE NOT NULL
);

CREATE TABLE owners_yachts (
    owner_id               BIGINT NOT NULL,
    yacht_id               BIGINT NOT NULL,
    FOREIGN KEY (owner_id) REFERENCES owners (id),
    FOREIGN KEY (yacht_id) REFERENCES yachts (id)
);



