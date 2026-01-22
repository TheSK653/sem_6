import { Client } from 'pg'
export async function getClient() {
    const client = new Client({
        user: 'postgres',
        password: 'root',
        host: 'localhost',
        port: 5432,
        database: 'basanti'
    })
    await client.connect();

    return client;
}