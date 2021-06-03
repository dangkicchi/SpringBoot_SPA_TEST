package com.example.demo.app._mysample;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ReactTestForm{
	
	@Size(min = 1, max = 20, message = "20文字以外で入力してください")
    private String name;
	
	@NotNull
	@Email(message = "E-mail 形式で入力してください")
    private String email;
	
	@NotNull
    private String contents;
    
    
	public ReactTestForm() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
}