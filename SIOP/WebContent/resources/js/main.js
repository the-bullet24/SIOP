document.addEventListener("DOMContentLoaded", function() {
    var userInput = document.getElementById("userInput");
    var userSpan = document.getElementById("userSpan");
    var passwordInput = document.getElementById("passwordInput");
    var passwordSpan = document.getElementById("passwordSpan");

    userInput.addEventListener("input", function() {
        if (userInput.value.trim().length > 0) {
            userSpan.style.display = "none";
        } else {
            userSpan.style.display = "inline";
        }
    });

    passwordInput.addEventListener("input", function() {
        if (passwordInput.value.trim().length > 0) {
            passwordSpan.style.display = "none";
        } else {
            passwordSpan.style.display = "inline";
        }
    });
});