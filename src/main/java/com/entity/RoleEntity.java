package com.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name="roles")
public class RoleEntity {

		@Id
		@GeneratedValue
		Integer roleId;
		String roleName;
		
		@OneToMany
		Set<UserEntity> users;
		
		
		
		public Set<UserEntity> getUsers() {
			return users;
		}
		public void setUsers(Set<UserEntity> users) {
			this.users = users;
		}
		public Integer getRoleId() {
			return roleId;
		}
		public void setRoleId(Integer roleId) {
			this.roleId = roleId;
		}
		public String getRoleName() {
			return roleName;
		}
		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}
		
		
}
