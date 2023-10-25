Working with iframes (inline frames) in Selenium involves switching the WebDriver's focus to the iframe, performing actions within it, and then switching back to the main content when done. Here's how you can work with iframes in Selenium using Java:

1. **Identify the iframe**:

   First, you need to identify the iframe you want to interact with. You can do this using different methods like `id`, `name`, `index`, or `WebElement`. For example:

   ```java
   // Using iframe id
   WebElement iframeElement = driver.findElement(By.id("iframe_id"));
   
   // Switch to the iframe
   driver.switchTo().frame(iframeElement);
   ```

2. **Perform actions within the iframe**:

   Once you've switched to the iframe, you can interact with elements inside it. For example:

   ```java
   WebElement elementInIframe = driver.findElement(By.id("element_id_inside_iframe"));
   elementInIframe.sendKeys("Text within iframe");
   ```

3. **Switch back to the main content**:

   After you've completed the actions within the iframe, you need to switch the focus back to the main content:

   ```java
   driver.switchTo().defaultContent();
   ```

| Method/Command                                 | Description                                                                                               |
|------------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| `switchTo().frame(int index)`                  | Switches to the iframe using its index (0-based).                                                         |
| `switchTo().frame(String nameOrId)`            | Switches to the iframe using its name or id attribute.                                                    |
| `switchTo().frame(WebElement frameElement)`     | Switches to the iframe using a reference to the iframe element itself.                                    |
| `switchTo().defaultContent()`                  | Switches back to the main content from an iframe.                                                         |
|`switchTo().parentFrame()`	| Switches back to the parent frame from a nested frame.                                                    |

[Example](WorkingWithIFrameExample.java)