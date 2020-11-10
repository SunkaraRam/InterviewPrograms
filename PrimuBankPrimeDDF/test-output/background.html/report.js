$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./FeatureFiles/BackgroundDemo.feature");
formatter.feature({
  "line": 1,
  "name": "Checking Background Verification",
  "description": "",
  "id": "checking-background-verification",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "User should be on LoginPage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I launch application in Chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should be launch",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Enter username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Loginbutton",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate title of the Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I am creating object for loginHomepage",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundDemo.i_launch_application_in_Chromebrowser()"
});
formatter.result({
  "duration": 103478564900,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundDemo.application_should_be_launch()"
});
formatter.result({
  "duration": 315182022,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d86.0.4240.111)\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027RAMSUNKARA\u0027, ip: \u0027192.168.43.72\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.111, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\SUNKAR~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:50292}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: e9c8de0ed6ce17b8a0e6717d860a34b3\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:605)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:280)\r\n\tat stepDefinitions.BackgroundDemo.application_should_be_launch(BackgroundDemo.java:39)\r\n\tat ✽.Then Application should be launch(./FeatureFiles/BackgroundDemo.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "BackgroundDemo.i_Enter_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BackgroundDemo.i_Enter_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BackgroundDemo.i_click_on_Loginbutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BackgroundDemo.i_validate_title_of_the_Homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BackgroundDemo.i_am_creating_object_for_loginHomepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 13,
  "name": "Title of your scenario",
  "description": "",
  "id": "checking-background-verification;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I click on Users",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I validate the UsersHomepage",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundDemo.i_click_on_Users()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "BackgroundDemo.i_validate_the_UsersHomepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "User should be on LoginPage",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I launch application in Chromebrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Application should be launch",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I Enter username",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Enter password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Loginbutton",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I validate title of the Homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I am creating object for loginHomepage",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundDemo.i_launch_application_in_Chromebrowser()"
});
