package com.example.demo.MyEmail.Model.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zzc
 * @date 2019-04-07 20:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String Id;
    String username;
    String password;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
}