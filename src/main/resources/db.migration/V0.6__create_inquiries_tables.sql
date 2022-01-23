CREATE TABLE inquiries (
    id                      SERIAL PRIMARY KEY,
    estimated_budget        DOUBLE PRECISION,
    metadata                json,
    preferred_destination   VARCHAR,
    comments                TEXT,
    check_in_date           DATE,
    check_out_date          DATE,
    created_at              DATE NOT NULL,
    updated_at              DATE NOT NULL,
    dates_flexible          BOOLEAN,
    viewed                  BOOLEAN DEFAULT false
);
