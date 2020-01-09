<html>
<%@page isELIgnored = "false" %>
<body>
	<form action="bookCrud">
		<table align=center width=50% bgcolor=lightblue>
			<tr>
				<th>Book ID</th>
				<td><input type=text name=bookId value=${book.bookId } ></td>
			</tr>
			<tr>
				<th>Book Name</th>
				<td><input type=text name=bookName value=${book.bookName }></td>
			</tr>
			<tr>
				<th>Book price</th>
				<td><input type=text name=price value=${book.price }></td>
			</tr>
			<tr>
				<th>Book Author</th>
				<td><input type=text name=author value=${book.author }></td>
			</tr>
			<tr>
				<td><input type=submit value=Add_Book name="sub"></td>
				<td><input type=submit value=Show_Book name="sub"></td>
			</tr>
			<tr>
				<td><input type=submit value=Modify_Book name="sub"></td>
				<td><input type=submit value=Delete_Book name="sub"></td>
			</tr>
		</table>
	</form>
</body>
</html>