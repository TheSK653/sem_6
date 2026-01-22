import { getClient } from "./utils.js";
async function insertData() {
    // Insert a user item
    const userData = `INSERT INTO users (email,password) VALUES ($1,$2) RETURNING id;`;
    const userValues = ['a@example.com', 'password123'];
    const client = await getClient();
    const result = await client.query(userData, userValues);

    console.log(result, "result");
    console.log (result.rows[0]);
    
    // Insert a todo item
    const todoData = 'INSERT INTO todos (title,description,user_id,done) VALUES ($1,$2,$3,$4);';
    const todoValues = ['Sample Todo', 'This is a sample todo item.', result.rows[0].id, false];
    await client.query(todoData, todoValues);
    
    console.log('check the database for inserted data');
    
    // Close the database connection
    await client.end();
}
insertData();