<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Best Music</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<style>
    body {
        background-color: #f8f9fa;
    }

    .song-form {
        margin-top: 50px;
        max-width: 500px;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
        padding: 40px;
    }

    .song-form h2 {
        text-align: center;
        margin-bottom: 30px;
        color: #343a40;
    }

    .song-form .form-control {
        border-radius: 20px;
    }

    .song-form .btn {
        border-radius: 20px;
    }

    .song-form .btn:hover {
        background-color: #343a40;
    }
</style>
</head>

<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-8">
            <div class="song-form">
                <h2>Create a Song</h2>
                <form action="/song/add" method="post" modelAttribute="song">
                    <div class="form-group">
                        <label for="title">Song Name</label>
                        <form:input path="title" type="text" class="form-control" id="title" name="title" required="required"/>
                    </div>
                    <div class="form-group">
                        <label for="artist">Author</label>
                        <form:input path="artist" type="text" class="form-control" id="artist" name="artist" required="required"/>
                    </div>
                    <button type="submit" class="btn btn-primary btn-block mt-3">Create Song</button>
                </form>
            </div>
        </div>
    </div>
</div>


</body>

</html>