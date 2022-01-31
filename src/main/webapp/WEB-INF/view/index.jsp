<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
   content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
   integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
   crossorigin="anonymous">
<link rel="stylesheet"
   href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<title>News CRUD Spring</title>
</head>

<body onload="">
    <div class="container">
    <div class="jumbotron" style="margin: 40px 0px">
             <h2 class="text-center">Movie Display</h2>
          </div>
          <form method="POST" action="savemovie" modelAttribute="movie">
          <div class="form-group">
          <label for="movie_Name">Movie Name</label>
          <input type="text" class="form-control" id="movie_Name" aria-describedby="name"
                         placeholder="Enter Movie Name" name="movie_Name">
          </div>
          <div class="form-group">
                    <label for="movie_Release_date">Movie Release Date</label>
                    <input type="text" class="form-control" id="movie_Release_date" aria-describedby="name"
                                   placeholder="Enter Release Date" name="movie_Release_date">
          </div>
          <div class="form-group">
                    <label for="movie_Director">Movie Director</label>
                    <input type="text" class="form-control" id="movie_Director" aria-describedby="name"
                                   placeholder="Enter Movie Director" name="movie_Director">
          </div>

          <button type="submit" class="btn btn-primary">Submit</button>
          </form>
          <div style="margin-top: 1em; text-align: center">
          <h2>All Movie Information</h2>
          <table class="table table-striped">
          <thead>
          <tr>
          <th scope="col">Movie Name</th>
          <th scope="col">Movie Release Date</th>
          <th scope="col">Movie Director</th>
          </tr>
          </thead>
          <tbody id='table-body'>
          <c:forEach items="${movieList}" var="movieobj">
          <tr>
          <td>${movieobj.movie_Name}</td>
          <td>${movieobj.movie_Release_date}</td>
          <td>${movieobj.movie_Director}</td>
          </tr>
          </c:forEach>
          </tbody>
          </table>
          </div>
    </div>
</body>
</html>
