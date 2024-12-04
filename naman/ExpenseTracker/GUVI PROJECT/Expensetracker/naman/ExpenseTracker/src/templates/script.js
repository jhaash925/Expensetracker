document.addEventListener('DOMContentLoaded', function() {
    // Login form submission
    const loginForm = document.getElementById('loginForm');
    if (loginForm) {
        loginForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;

            if (username === '' || password === '') {
                document.getElementById('error-message').innerText = 'Please fill in all fields.';
            } else {
                // Here you would typically send the data to the server
                alert('Login successful!');
            }
        });
    }

    // Register form submission
    const registerForm = document.getElementById('registerForm');
    if (registerForm) {
        registerForm.addEventListener('submit', function(event) {
            event.preventDefault();
            const username = document.getElementById('username').value;
            const password = document.getElementById('password').value;
            const confirmPassword = document.getElementById('confirmPassword').value;

            if (username === '' || password === '' || confirmPassword === '') {
                document.getElementById('error-message').innerText = 'Please fill in all fields.';
            } else if (password !== confirmPassword) {
                document.getElementById('error-message').innerText = 'Passwords do not match.';
            } else {
                // Here you would typically send the data to the server
                alert('Registration successful!');
            }
        });
    }
});