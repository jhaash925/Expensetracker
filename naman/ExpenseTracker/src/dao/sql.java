CREATE TABLE expenses (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    date DATE NOT NULL,
    category TEXT NOT NULL,
    description TEXT,
    amount REAL NOT NULL
);