CREATE TABLE posts (
    id                  SERIAL PRIMARY KEY,
    title               VARCHAR,
    description         TEXT,
    content             TEXT,
    featured_image      VARCHAR,
    images              json,
    created_at          DATE NOT NULL,
    updated_at          DATE NOT NULL,
    slug                VARCHAR,
    side_images         VARCHAR,
    meta_description    TEXT
);
