$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\java\\Feature\\Login.feature");
formatter.feature({
  "name": "DemoWebShop Application",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user should navigate to demowebShop application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.userShouldNavigateToDemowebShopApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on login link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userShouldClickOnLoginLink()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d129.0.6668.103)\nBuild info: version: \u00274.12.1\u0027, revision: \u00278e34639b11\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002722.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [9464dcdcd39506a6866329bc9e794c39, findElement {using\u003dxpath, value\u003d//a[@class\u003d\u0027ico-login\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 129.0.6668.103, chrome: {chromedriverVersion: 129.0.6668.100 (cf58cba358d..., userDataDir: C:\\Users\\admin\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:56030}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:56030/devtoo..., se:cdpVersion: 129.0.6668.103, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 9464dcdcd39506a6866329bc9e794c39\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:62)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:502)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:486)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat Steps.LoginSteps.userShouldClickOnLoginLink(LoginSteps.java:74)\r\n\tat ✽.user should click on login link(src\\test\\java\\Feature\\Login.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Login should be successfull",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should Enter username as \"javaseleniumA4@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userShouldEnterUsernameAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should enter the password as \"123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userShouldEnterThePasswordAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userClickOnLoginButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should click on Digital Downloads link",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.userShouldClickOnDigitalDownloadsLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user add one product to cart",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.userAddOneProductToCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "product should added to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.productShouldAddedToCart()"
});
formatter.result({
  "status": "skipped"
});
});