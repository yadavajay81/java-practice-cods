package com.luv2code.springbootlibrary.entity;

import javax.persistence.*;
import lombok.Data;
import org.springframework.data.domain.Page;

@Entity
@Table(name = "newbook")
@Data
public class Newbook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "description")
	private String description;

	@Column(name = "copies")
	private int copies;

	@Column(name = "copies_available")
	private int copiesAvailable;

	@Column(name = "category")
	private String category;

	@Column(name = "img")
	private String img;

}
