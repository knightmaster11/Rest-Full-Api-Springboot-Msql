document.addEventListener('DOMContentLoaded', function() {
    const searchInput = document.getElementById('search_by_username');
    const userItem = document.getElementById('userItem');

    searchInput.addEventListener('input', function() {
        // Check if the input value is not empty
        if (this.value.trim() !== '') {
            userItem.style.display = 'block';
            console.log("ini blog") // Show the user item
        } else {
            userItem.style.display = 'none'; // Hide the user item
            console.log("ini bisa") // Show the user item
        }
    });
});
