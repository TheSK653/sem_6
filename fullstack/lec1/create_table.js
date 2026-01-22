import { getClient } from "./utils.js";
export async function createTable() {
    const userTable = `CREATE TABLE IF NOT EXISTS users (
        id SERIAL PRIMARY KEY,
        email VARCHAR(255) UNIQUE NOT NULL,
        password VARCHAR(255) NOT NULL
    )`;

    const client = await getClient();
    await client.query(userTable);
    console.log("User table created successfully");

    const todoTable = `CREATE TABLE IF NOT EXISTS todos (
        id SERIAL PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        description TEXT,
        user_id INTEGER REFERENCES users(id),
        done BOOLEAN DEFAULT FALSE
    )`;

    await client.query(todoTable);
    console.log("Todo table created successfully");

    await client.end();
}
createTable();