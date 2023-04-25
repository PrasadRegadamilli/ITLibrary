package com.vara.ITlibrary.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Lib_books")
public class LibBooks 
{
 @Id
 @Column(name="Book_name")
 private String bookname;
 
 @Column(name="Author_name")
 private String author;
 
 @Column(name="Technology")
 private String technology;
 
 @Column(name="Stock")
 private int stock;
 
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getTechnology() {
	return technology;
}
public void setTechnology(String technology) {
	this.technology = technology;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "LibBooks [bookname=" + bookname + ", author=" + author + ", technology=" + technology + ", stock=" + stock
			+ "]";
}
 
}
