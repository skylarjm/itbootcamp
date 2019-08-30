package base;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Helper {
	@DataProvider(name = "LoginData")
	public Object[][] loginData(Method m) {
		Object[][] obj = { new Object[1], new Object[2] };

		if (m.getName().contains("admin")) {
			obj = new Object[1][2];

			obj[0][0] = "adminUser";
			obj[0][1] = "admin";
		}

		if (m.getName().contains("moderator")) {
			obj = new Object[1][2];

			obj[0][0] = "moderatorUser";
			obj[0][1] = "moderator";
		}

		if (m.getName().contains("classic")) {
			obj = new Object[1][2];

			obj[0][0] = "classicUser";
			obj[0][1] = "classic";
		}

		return obj;
	}

}
