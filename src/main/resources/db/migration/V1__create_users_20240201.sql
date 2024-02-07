CREATE TABLE users
(
    id         BIGSERIAL PRIMARY KEY,
    email      VARCHAR(255)  NOT NULL,
    password   VARCHAR(2048) NOT NULL,
    first_name VARCHAR(64)   NOT NULL,
    last_name  VARCHAR(64)   NOT NULL,
    role       VARCHAR(32)   NOT NULL DEFAULT 'ROLE_USER',
    enabled    BOOLEAN                DEFAULT TRUE,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);