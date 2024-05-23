<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Song Details</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
        }
        .song-details {
            max-width: 500px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            padding: 40px;
            margin: auto;
            margin-top: 20px;
        }
        .song-details h2 {
            text-align: center;
            margin-bottom: 30px;
            color: #343a40;
        }
        .song-info {
            margin-bottom: 20px;
        }
        .song-info label {
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="song-details">
                    <h2>Song Details</h2>
                    <div class="song-info">
                        <label>Title:</label>
                        <p>${song.title}</p>
                    </div>
                    <div class="song-info">
                        <label>Artist:</label>
                        <p>${song.artist}</p>
                    </div>
                    <!-- Add more song details here if needed -->
                    <div class="text-center">
                        <a href="/" class="btn btn-primary">Back to Songs</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>