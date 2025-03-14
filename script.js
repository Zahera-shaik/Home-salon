
const product = {
    name:'All Types of Facials',
    price: 1250.0
};

let cart = [];
let total = 0.00;

function addToCart() {
    cart.push(product);
    total += product.price;

    updateCart();
}

function updateCart() {
    const cartItems = document.getElementById('cart-items');
    const totalSpan = document.getElementById('total');

    cartItems.innerHTML = '';

    cart.forEach(item => {
        const listItem = document.createElement('li');
        listItem.textContent = `${item.name} - $${item.price.toFixed(2)}`;
        cartItems.appendChild(listItem);
    });
    totalSpan.textContent = total.toFixed(2);
}

function checkout() {
    alert('Payment processed successfully!');
    
    cart = [];
    total = 0.00;
    updateCart();
}
