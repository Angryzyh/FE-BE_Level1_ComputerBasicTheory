package com.angryzyh.singleton;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import lombok.experimental.FieldNameConstants;

// 枚举单例模式 , 懒加载
@Data
@Accessors(chain = true)
@FieldNameConstants
@NoArgsConstructor
public class UserEnum {
	private String username;
	private String password;

	public static UserEnum getUser() {
		return Enum_.INSTANCE.getInstance();
	}

	static enum Enum_ {
		INSTANCE;

		private final UserEnum user;

		private Enum_() {
			user = new UserEnum();
		}

		public UserEnum getInstance() {
			return user;
		};
	}
}
