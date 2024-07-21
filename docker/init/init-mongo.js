// init-mongo.js
db = db.getSiblingDB('OrderDB');

db.createUser({
  user: 'username',
  pwd: 'password',
  roles: [{ role: 'readWrite', db: 'OrderDB' }]
});

db.orders.insertMany([
  {
    orderId: UUID(),
    clientId: UUID(),
    itens: [
      {
        product: 'processador amd ryzen 7 5700U',
        quantity: 1,
        price: 1085.99
      },
      {
        product: 'ssd seagate barracuda',
        quantity: 1,
        price: 369.00
      }
    ]
  }
]);
