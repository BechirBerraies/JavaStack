<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Song</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .song-form {
            margin-top: 50px;
            max-width: 600px;
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
            width: 100%;
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
                    <h2>Edit Song</h2>
                    <form action="/song/${song.id}/edit" method="post" modelAttribute="song">
                        <div class="mb-3">
                            <label for="title" class="form-label">Title:</label>
                            <input type="text" id="title" name="title" class="form-control" placeholder="Enter song title" title="Enter the title of the song" required="true"/>
                        </div>
                        <div class="mb-3">
                            <label for="artist" class="form-label">Artist:</label>
                            <input type="text" id="artist" name="artist" class="form-control" placeholder="Enter artist name" title="Enter the name of the artist" required="true"/>
                        </div>
                        <button type="submit" class="btn btn-primary">Save Changes</button>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>