The Actions class in Selenium is used for performing complex user interactions with web elements, such as mouse hover, drag-and-drop, right-click, and double-click. Below is a table listing some of the common methods of the Actions class and their descriptions:

| Method                                       | Description                                               |
|----------------------------------------------|-----------------------------------------------------------|
| `click(WebElement element)`                  | Clicks the specified web element.                        |
| `clickAndHold(WebElement element)`            | Clicks and holds the specified web element.              |
| `release(WebElement element)`                 | Releases the mouse button previously held on the specified web element. |
| `contextClick(WebElement element)`           | Performs a right-click on the specified web element.    |
| `doubleClick(WebElement element)`            | Performs a double-click on the specified web element.   |
| `moveToElement(WebElement toElement)`         | Moves the mouse cursor to the center of the specified web element. |
| `moveToElement(WebElement toElement, int xOffset, int yOffset)` | Moves the mouse cursor to an offset from the specified web element. |
| `dragAndDrop(WebElement source, WebElement target)` | Drags the source element and drops it onto the target element. |
| `dragAndDropBy(WebElement source, int xOffset, int yOffset)` | Drags the source element by an offset and drops it. |
| `keyDown(CharSequence key)`                  | Simulates holding down a keyboard key, e.g., Keys.SHIFT, Keys.CONTROL. |
| `keyUp(CharSequence key)`                    | Simulates releasing a keyboard key.                     |
| `sendKeys(WebElement element, CharSequence... keysToSend)` | Sends key sequences to a web element.              |

### `build()` and `perform()` methods
1. **`build()` Method**:

    - The `build()` method is used to compile a sequence of actions into a single action chain.
    - It is called after you've added multiple actions to the action chain using the various methods available in the Actions class.

   ```java
   Actions actions = new Actions(driver);
   actions.moveToElement(element1).click(element2).build();
   ```

2. **`perform()` Method**:

    - The `perform()` method is used to execute the actions that have been built using the `build()` method.
    - It triggers the actions on the web page as a single sequence.

   ```java
   Actions actions = new Actions(driver);
   actions.moveToElement(element1).click(element2).build().perform();


[Example](PurchaseGold.java)