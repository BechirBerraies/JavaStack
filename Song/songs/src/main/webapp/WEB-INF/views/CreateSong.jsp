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
    <title>Best Music</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
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
            width: 100%;
        }

        .song-form .btn:hover {
            background-color: #343a40;
        }
    </style>
</head>
<body>
    <div class="container ">
        <div class="row justify-content-center ">
            <div class="col-md-8">
                <div class="song-form">
                    <h2>Create a Song</h2>
                    <form action="/song/add" method="post">
                        <div class="mb-3">
                            <label for="title" class="form-label">Title:</label>
                            <input type="text" class="form-control" id="title" name="title" required>
                        </div>
                        <div class="mb-3">
                            <label for="artist" class="form-label">Artist:</label>
                            <input type="text" class="form-control" id="artist" name="artist" required>
                        </div>
                        <button type="submit" class="btn btn-primary">Create</button>
                    </form>
                </div>
            </div>
            <div class="col-md-8 mt-5">
                <h2>List of Songs</h2>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Artist</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${songs}" var="song">
                            <tr>
                                <td>${song.title}</td>
                                <td>${song.artist}</td>
                                <td>${song.id}</td>
                                <td><a type="button" class="btn btn-warning" href="song/${song.id}">View</a></td>
                                <td>
                                        <a type="button" class="btn btn-primary" href="song/${song.id}/edit" >edit song</a>
                                    
                                </td>
                                <td>
                                    <form action="/song/${song.id}/delete" method="post" class="d-inline">
                                        <input type="hidden" name="_method" value="DELETE">
                                        <input type="submit" value="Delete" class="btn btn-danger" />
                                    </form>
                                </td>
                                
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>