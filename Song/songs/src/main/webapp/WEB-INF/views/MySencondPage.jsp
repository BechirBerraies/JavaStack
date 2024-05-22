<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simple Webpage with Bootstrap</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <header class="bg-dark text-white py-4">
        <div class="container text-center">
            <h1>Welcome to My Simple Webpage</h1>
        </div>
    </header>
    
    <nav class="bg-secondary text-white py-2">
        <div class="container">
            <ul class="nav">
                <li class="nav-item"><a class="nav-link text-white" href="#">Home</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="#">About</a></li>
                <li class="nav-item"><a class="nav-link text-white" href="#">Contact</a></li>
            </ul>
        </div>
    </nav>
    
    <main class="container py-4">
        <section class="mb-4">
            <h2>About Us</h2>
            <p>This is a simple webpage to test HTML and Bootstrap.</p>
        </section>
        
        <section>
            <h2>Contact Us</h2>
            <p>Email: example@example.com</p>
            <p>Phone: 123-456-7890</p>
        </section>
    </main>
    
    <footer class="bg-dark text-white py-2 fixed-bottom">
        <div class="container text-center">
            <p>&copy; 2024 Simple Webpage. All rights reserved.</p>
        </div>
    </footer>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>